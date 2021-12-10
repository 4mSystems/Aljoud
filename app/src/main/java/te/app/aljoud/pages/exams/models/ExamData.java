package te.app.aljoud.pages.exams.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ExamData {

	@SerializedName("quiz_id")
	private String quizId;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("show")
	private String show;

	@SerializedName("answers")
	private List<AnswersItem> answers;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("sort")
	private String sort;

	@SerializedName("type")
	private String type;

	public String getQuizId(){
		return quizId;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getName(){
		return name;
	}

	public String getShow(){
		return show;
	}

	public List<AnswersItem> getAnswers(){
		return answers;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getId(){
		return id;
	}

	public String getSort(){
		return sort;
	}

	public String getType(){
		return type;
	}

	@Override
	public String toString() {
		return "ExamData{" +
				"quizId='" + quizId + '\'' +
				", updatedAt='" + updatedAt + '\'' +
				", name='" + name + '\'' +
				", show='" + show + '\'' +
				", answers=" + answers +
				", createdAt='" + createdAt + '\'' +
				", id=" + id +
				", sort='" + sort + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}