package te.app.aljoud.pages.courseDetails.models.videos;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class VideosResponse extends StatusMessage {
    @SerializedName("data")
    private VideosMainData videosMainData;

    public VideosMainData getVideosMainData() {
        return videosMainData;
    }

}