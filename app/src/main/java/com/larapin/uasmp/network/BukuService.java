package com.larapin.uasmp.network;

import com.larapin.uasmp.model.BukuResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Avin on 11/07/2018.
 *
 */

public interface BukuService {
    @GET("buku/search/{pengarang}")
    Call<BukuResult> getBuku(@Path("pengarang") String pengarang);

}
