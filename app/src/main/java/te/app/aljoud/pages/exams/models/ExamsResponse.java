package te.app.aljoud.pages.exams.models;

import androidx.annotation.Keep;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class ExamsResponse extends StatusMessage {

    @SerializedName("data")
    private List<ExamData> examDataList;

    public List<ExamData> getExamDataList() {
        return examDataList;
    }

}