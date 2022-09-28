package te.app.aljoud.base;

import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

public class BaseUiState implements Observable {
    private PropertyChangeRegistry mCallBacks;

    public BaseUiState() {
        mCallBacks = new PropertyChangeRegistry();
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.remove(callback);
    }

    public void notifyChange() {
        mCallBacks.notifyChange(this, 0);
    }

    public void notifyChange(int propertyId) {
        mCallBacks.notifyChange(this, propertyId);
    }

}
