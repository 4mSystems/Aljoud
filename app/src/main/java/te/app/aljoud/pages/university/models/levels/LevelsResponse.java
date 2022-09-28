package te.app.aljoud.pages.university.models.levels;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class LevelsResponse extends StatusMessage {

	@SerializedName("data")
	private List<LevelsData> data;

	public List<LevelsData> getData(){
		return data;
	}

}