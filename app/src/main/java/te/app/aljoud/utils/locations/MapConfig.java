package te.app.aljoud.utils.locations;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapConfig {
    public List<LatLng> markers_service = new ArrayList<>();
    ArrayList<Marker> markers = new ArrayList<>();
    private static final String TAG = "MapConfig";
    Context context;
    GoogleMap mMap;
    Marker driverMarker;
    public Polyline direction;
    public double distanceKm;
    public HashMap<Marker, Object> markersId = new HashMap<>();

    public MapConfig(Context context, GoogleMap map) {
        this.context = context;
        this.mMap = map;
    }

    public void setSettings() {
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setTrafficEnabled(true);
        mMap.setBuildingsEnabled(true);
        mMap.setIndoorEnabled(true);
        mMap.getUiSettings().setRotateGesturesEnabled(false);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
    }

    public void setPadding(int left, int top, int right, int bottom) {
        if (mMap != null) mMap.setPadding(left, top, right, bottom);
    }

    public void setPaddingRunTime(int left, int top, int right, int bottom) {
        if (mMap != null) {
            new Handler().post(new Runnable() {
                @Override
                public void run() {
                    getGoogleMap().setPadding(left, top, right, bottom);
                }
            });

        }
    }

    public void enableLocationButton() {
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);

        mMap.setOnMyLocationButtonClickListener(() -> true);
    }


    public void moveCamera(LatLng latLng) {
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15.0f));
    }

    public void moveCamera(ArrayList<LatLng> latLngs) {
        if (latLngs.size() > 0) {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (LatLng latLng : latLngs) {
                builder.include(latLng);
            }
//            int padding = 400; // offset from edges of the map in pixels
            int padding = 100; // offset from edges of the map in pixels
            LatLngBounds bounds = builder.build();
            final CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, padding);
            /**call the map call back to know map is loaded or not*/
            getGoogleMap().setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
                @Override
                public void onMapLoaded() {
                    /**set animated zoom camera into map*/
                    getGoogleMap().animateCamera(cu);
                }
            });
        }
    }

    public void setRoute(Polyline direction) {
        this.direction = direction;
    }

    public void removeRoute() {
        if (direction != null)
            direction.remove();
    }

    public Marker getDriverMarker() {
        return driverMarker;
    }


    public Marker addMarker(LatLng latLng, int icon, String title) {
        Marker marker = mMap.addMarker(new MarkerOptions().position(latLng)
                .icon(BitmapDescriptorFactory.fromResource(icon))
                .title(title));
        markers.add(marker);
        return marker;
    }


    public ArrayList<Marker> getMarkers() {
        return markers;
    }

    public void clearMarkers() {
        markers.clear();
    }

    public void changeMyLocationButtonLocation(MapView mapView) {
        if (mapView != null &&
                mapView.findViewById(Integer.parseInt("1")) != null) {
            // Get the button view
            View locationButton = ((View) mapView.findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2"));
            // and next place it, on bottom right (as Google Maps app)
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)
                    locationButton.getLayoutParams();
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, 0);
            // position on right bottom
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
//            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_END, RelativeLayout.TRUE);

            layoutParams.setMargins(0, 0, 0, 0);
        }
    }

    public void clear() {
        markersId.clear();
        markers.clear();
        getGoogleMap().clear();
    }

    public LatLngBounds zoomCamera(int padding) {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (Marker marker : markers) {
            builder.include(marker.getPosition());
        }
        LatLngBounds bounds = builder.build();
        CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, padding);
        mMap.animateCamera(cu);
        return bounds;
    }

    public void navigation(double lat, double lng) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?daddr=" + lat + "," + lng));
        context.startActivity(intent);
    }

    public void navigation(LatLng latLngPicker, LatLng latLngDestination) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?saddr=" + latLngPicker.latitude + "," + latLngPicker.longitude + "&daddr=" + latLngDestination.latitude + "," + latLngDestination.longitude + ""));
        context.startActivity(intent);
    }

    public void setLocationButtonListeners() {
        mMap.setOnMyLocationButtonClickListener(onMyLocationButtonClickListener);
        mMap.setOnMyLocationClickListener(onMyLocationClickListener);
    }

    private LocationRequest mLocationRequest;
    private static int UPDATE_INTERVAL = 5000 * 60;
    private static int FATEST_INTERVAL = 3000;
    private static int DISPLACEMENT = 10;


    public void createLocationRequest() {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(UPDATE_INTERVAL);
        mLocationRequest.setFastestInterval(FATEST_INTERVAL);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mLocationRequest.setSmallestDisplacement(DISPLACEMENT);
    }

    public LocationRequest getmLocationRequest() {
        if (mLocationRequest == null) {
            createLocationRequest();
        }
        return mLocationRequest;
    }

    public void setmLocationRequest(LocationRequest mLocationRequest) {
        this.mLocationRequest = mLocationRequest;
    }

    private GoogleMap.OnMyLocationClickListener onMyLocationClickListener =
            new GoogleMap.OnMyLocationClickListener() {
                @Override
                public void onMyLocationClick(@NonNull Location location) {
                    Log.e(TAG, "onMyLocationClick: " + location.getLatitude() + "," + location.getLongitude());
                }
            };

    private GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener =
            () -> {
//                    mMap.setMinZoomPreference(15);
                return false;
            };


    public GoogleMap getGoogleMap() {
        return mMap;
    }

    private ArrayList<LatLng> latLngPointsDirections = new ArrayList();

    public void setLatLngPointsDirections(ArrayList<LatLng> pointsDirections) {
        latLngPointsDirections = new ArrayList(pointsDirections);
    }

    public ArrayList<LatLng> getLatLngPointsDirections() {
        return latLngPointsDirections;
    }


    public Object getId(Marker marker) {
        return markersId.get(marker);
    }

    public static void getAddress( double lat,  double lng,Context context, MapAddressInterface mapAddressInterface) {
        MapAddress mapAddress = new MapAddress(((Activity) context), lat, lng);
        mapAddress.getAddressFromUrl((address, city) -> {
            if (mapAddressInterface != null)
                mapAddressInterface.fetchFullAddress(address,city);
        });

    }

    public Double setDistanceWithKilo(int distance_meters) {
        distanceKm = (distance_meters / 1000); //by kilo
        return distanceKm;
    }


//    public class DownloadImagesTask extends AsyncTask<ImageView, Void, Bitmap> {
//
//        ImageView imageView = null;
//
//        @Override
//        protected Bitmap doInBackground(ImageView... imageViews) {
//            this.imageView = imageViews[0];
//            return download_Image((String)imageView.getTag());
//        }
//
//        @Override
//        protected void onPostExecute(Bitmap result) {
//            imageView.setImageBitmap(result);
//        }
//
//
//        private Bitmap download_Image(String url) {
//
//        }
//    }
}
