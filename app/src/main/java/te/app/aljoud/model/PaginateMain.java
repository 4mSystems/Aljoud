package te.app.aljoud.model;

import com.google.gson.annotations.SerializedName;

public class PaginateMain {
    @SerializedName("meta")
    private Meta meta;

    @SerializedName("links")
    private Links links;

    public Meta getMeta(){
        return meta;
    }

    public Links getLinks(){
        return links;
    }
}
