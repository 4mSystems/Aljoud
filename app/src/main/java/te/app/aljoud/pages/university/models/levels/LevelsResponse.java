package te.app.aljoud.pages.university.models.levels;

import androidx.annotation.Keep;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class LevelsResponse extends StatusMessage {

	@SerializedName("data")
	private List<LevelsData> data;

	public List<LevelsData> getData(){
		return data;
	}

}