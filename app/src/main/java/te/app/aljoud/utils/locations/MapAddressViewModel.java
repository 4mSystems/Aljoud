package te.app.aljoud.utils.locations;

import androidx.databinding.ObservableField;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

import javax.inject.Inject;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.utils.Constants;


public class MapAddressViewModel extends BaseViewModel {
    public ObservableField<LatLng> mMapLatLng;
    public static ObservableField<Double> latitude;
    public static ObservableField<Double> longitude;
    public static ObservableField<String> address;
    public static ObservableField<String> arabicAddress;
    public ObservableField<String> placeSelectedObservable;

    public static double lat = 0, lng = 0;
    public GoogleMap mMap;

    public void submit() {
        getLiveData().setValue(Constants.PICKED_SUCCESSFULLY);
    }

    @Inject
    public MapAddressViewModel() {
        latitude = new ObservableField<>();
        longitude = new ObservableField<>();
        address = new ObservableField<>();
        placeSelectedObservable = new ObservableField<>();
        arabicAddress = new ObservableField<>();
    }

    public void reset() {
        latitude.set(null);
        longitude.set(null);
        address.set(null);
    }

}