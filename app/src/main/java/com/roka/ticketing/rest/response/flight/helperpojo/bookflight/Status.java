
package com.roka.ticketing.rest.response.flight.helperpojo.bookflight;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Status {

    @SerializedName("value")
    private String mvalue;

    public String getvalue() {
        return mvalue;
    }

    public static class Builder {

        private String mvalue;

        public Status.Builder withvalue(String value) {
            mvalue = value;
            return this;
        }

        public Status build() {
            Status Status = new Status();
            Status.mvalue = mvalue;
            return Status;
        }

    }

}
