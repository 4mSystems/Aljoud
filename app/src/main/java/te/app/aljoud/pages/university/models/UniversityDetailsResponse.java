package te.app.aljoud.pages.university.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class UniversityDetailsResponse extends StatusMessage {

    @SerializedName("data")
    private UniversityData universityData;

    public UniversityData getUniversityData() {
        return universityData;
    }

}