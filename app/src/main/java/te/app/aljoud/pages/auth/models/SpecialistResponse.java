package te.app.aljoud.pages.auth.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.utils.PopUp.PopUp;
@Keep
public class SpecialistResponse extends StatusMessage {
    @SerializedName("data")
    private List<PopUp> specialist;

    public List<PopUp> getSpecialist() {
        return specialist;
    }
}
