
package com.roka.ticketing.rest.response.flight.helperpojo.bookflight;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Username {

    @SerializedName("value")
    private String mvalue;

    public String getvalue() {
        return mvalue;
    }

    public static class Builder {

        private String mvalue;

        public Username.Builder withvalue(String value) {
            mvalue = value;
            return this;
        }

        public Username build() {
            Username Username = new Username();
            Username.mvalue = mvalue;
            return Username;
        }

    }

}
