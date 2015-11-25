
package com.oyra.svti.svtitest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

class Socialmediaplatform implements Serializable{

    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("platformurl")
    @Expose
    private String platformurl;

    /**
     * 
     * @return
     *     The platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 
     * @param platform
     *     The platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * 
     * @return
     *     The platformurl
     */
    public String getPlatformurl() {
        return platformurl;
    }

    /**
     * 
     * @param platformurl
     *     The platformurl
     */
    public void setPlatformurl(String platformurl) {
        this.platformurl = platformurl;
    }

}
