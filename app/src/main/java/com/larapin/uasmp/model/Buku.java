package com.larapin.uasmp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Avin on 11/07/2018.
 */

public class Buku {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("sampul")
    @Expose
    private String sampul;
    @SerializedName("nama")
    @Expose
    private String judul;
    @SerializedName("pengarang")
    @Expose
    private String pengarang;
    @SerializedName("tahun_terbit")
    @Expose
    private String tahun;
    @SerializedName("isbn")
    @Expose
    private String isbn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSampul() {
        return sampul;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getTahun() {
        return tahun;
    }

    public String getIsbn() {
        return isbn;
    }
}
