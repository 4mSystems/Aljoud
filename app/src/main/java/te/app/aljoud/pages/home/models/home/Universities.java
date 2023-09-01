package te.app.aljoud.pages.home.models.home;

import androidx.annotation.Keep;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.PaginateMain;
@Keep
public class Universities extends PaginateMain {


	@SerializedName("data")
	private List<University> universityList;


	public List<University> getUniversityList(){
		return universityList;
	}

}