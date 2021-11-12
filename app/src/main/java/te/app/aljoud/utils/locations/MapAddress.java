package te.app.aljoud.utils.locations;

import android.app.Activity;
import android.location.Address;
import android.location.Geocoder;
import android.util.Log;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import te.app.aljoud.R;
import te.app.aljoud.utils.session.LanguagesHelper;

public class MapAddress {
    Activity activity = null;
    double lat;
    double lng;

    public MapAddress(Activity activity, double lat, double lng) {
        this.activity = activity;
        this.lat = lat;
        this.lng = lng;
    }

    String address = "", fullAddress = "", city = "";
    private static final String TAG = "MapAddress";
    public void getAddressFromUrl(MapAddressInterface mapAddressInterface) {
        Geocoder geocoder;
        List<Address> addresses;
        geocoder = new Geocoder(activity, LanguagesHelper.getLocalLanguage());
        try {
            addresses = geocoder.getFromLocation(lat, lng, 1);
            if (addresses.size() > 0) {
                address = addresses.get(0).getAddressLine(0);
                city = addresses.get(0).getAddressLine(1);
                StringBuilder txt = new StringBuilder("");
                if (address != null)
                    txt.append(address);
                if (city != null)
                    txt.append(", " + city);
                fullAddress = txt.toString();
                mapAddressInterface.fetchFullAddress(fullAddress,city);
            } else {
                getAddress(mapAddressInterface);
            }
        } catch (IOException e) {
            getAddress(mapAddressInterface);
            e.printStackTrace();
        }
    }

    public void getAddress(final MapAddressInterface mapAddressInterface) {
        String url = "https://maps.googleapis.com/maps/api/geocode/json?latlng=+" + lat + "," + lng + "&key=" + activity.getString(R.string.google_map)+"&language="+LanguagesHelper.getCurrentLanguage();
        Log.e("url", url);
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onStart() {
                // called before request is started
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                // called when response HTTP status is "200 OK"
                try {
                    fullAddress = ((JSONArray) response.get("results")).getJSONObject(0).getString("formatted_address");
                    city=((JSONArray) response.get("results")).getJSONObject(0).getJSONArray("address_components").getJSONObject(1).getString("long_name");
                    mapAddressInterface.fetchFullAddress(fullAddress,city);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                mapAddressInterface.fetchFullAddress("","");
                Toast.makeText(activity, "" + activity.getString(R.string.connection_invaild_body), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRetry(int retryNo) {
                // called when request is retried
                Toast.makeText(activity, "" + activity.getString(R.string.connection_invaild_body), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
