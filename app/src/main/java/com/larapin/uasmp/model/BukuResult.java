package com.larapin.uasmp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Avin on 11/07/2018.
 */

public class BukuResult {
    @SerializedName("buku")
    @Expose
    private List<Buku> bukus = null;

    public List<Buku> getBukus() {
        return bukus;
    }
}
