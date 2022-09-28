package te.app.aljoud.pages.exams.models;

import com.google.gson.annotations.SerializedName;

public class AnswersItem{

	@SerializedName("quiz_question_id")
	private String quizQuestionId;

	@SerializedName("correct")
	private String correct;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("show")
	private String show;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("sort")
	private String sort;

	@SerializedName("type")
	private String type;

	public String getQuizQuestionId(){
		return quizQuestionId;
	}

	public String getCorrect(){
		return correct;
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
}