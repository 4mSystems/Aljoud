package te.app.aljoud.utils.locations.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DistanceTimeResponse{

	@SerializedName("destination_addresses")
	private List<String> destinationAddresses;

	@SerializedName("rows")
	private List<RowsItem> rows;

	@SerializedName("origin_addresses")
	private List<String> originAddresses;

	@SerializedName("status")
	private String status;

	public List<String> getDestinationAddresses(){
		return destinationAddresses;
	}

	public List<RowsItem> getRows(){
		return rows;
	}

	public List<String> getOriginAddresses(){
		return originAddresses;
	}

	public String getStatus(){
		return status;
	}
}