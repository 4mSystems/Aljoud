package te.app.aljoud.pages.courseDetails.models.videos;

import androidx.annotation.Keep;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.PaginateMain;
@Keep
public class VideosMainData extends PaginateMain {

	@SerializedName("data")
	private List<VideoData> videoDataList;

	public List<VideoData> getVideoDataList(){
		return videoDataList;
	}

}