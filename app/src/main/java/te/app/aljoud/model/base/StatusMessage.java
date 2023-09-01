
package te.app.aljoud.model.base;


import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Keep
public class StatusMessage {

    @SerializedName("msg")
    @Expose
    public String mMessage;
    @SerializedName("status")
    @Expose
    public int code;

}
