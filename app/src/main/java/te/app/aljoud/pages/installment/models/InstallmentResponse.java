package te.app.aljoud.pages.installment.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class InstallmentResponse extends StatusMessage {

	@SerializedName("data")
	private List<InstallmentData> installmentDataList;

	public List<InstallmentData> getInstallmentDataList(){
		return installmentDataList;
	}

}