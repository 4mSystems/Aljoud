package te.app.aljoud.pages.cart.models.cart_items;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.pages.university.models.course.Course;

public class CartItem{

	@SerializedName("course_id")
	private String courseId;

	@SerializedName("total")
	private int total;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("course")
	private Course course;

	@SerializedName("id")
	private int id;

	public String getCourseId(){
		return courseId;
	}

	public int getTotal(){
		return total;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getUserId(){
		return userId;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public Course getCourse(){
		return course;
	}

	public int getId(){
		return id;
	}
}