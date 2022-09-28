package te.app.aljoud.pages.fawaterkPayment.models.check_out;

import com.google.gson.annotations.SerializedName;

public class DiscountData {

	@SerializedName("old_price")
	private int oldPrice;

	@SerializedName("discount")
	private float discount;

	@SerializedName("new_price")
	private float newPrice;

	@SerializedName("type")
	private String type;

	@SerializedName("done")
	private boolean done;

	public int getOldPrice(){
		return oldPrice;
	}

	public float getDiscount(){
		return discount;
	}

	public float getNewPrice(){
		return newPrice;
	}

	public String getType(){
		return type;
	}

	public boolean isDone(){
		return done;
	}
}