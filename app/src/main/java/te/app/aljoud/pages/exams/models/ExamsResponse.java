package te.app.aljoud.pages.exams.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class ExamsResponse extends StatusMessage {

    @SerializedName("data")
    private List<ExamData> examDataList;

    public List<ExamData> getExamDataList() {
        return examDataList;
    }

}