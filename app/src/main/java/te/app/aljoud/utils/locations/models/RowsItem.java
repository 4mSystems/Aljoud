package te.app.aljoud.utils.locations.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RowsItem{

	@SerializedName("elements")
	private List<ElementsItem> elements;

	public List<ElementsItem> getElements(){
		return elements;
	}
}