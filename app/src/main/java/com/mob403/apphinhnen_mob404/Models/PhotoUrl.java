package com.mob403.apphinhnen_mob404.Models;

import com.google.gson.annotations.SerializedName;

public class PhotoUrl  {
    @SerializedName("raw")
    private String raw;
    @SerializedName("full")
    private String full;
    @SerializedName("regular")
    private String regular;

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }
}