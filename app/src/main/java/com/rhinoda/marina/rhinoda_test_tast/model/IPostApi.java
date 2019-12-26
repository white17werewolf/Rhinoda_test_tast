package com.rhinoda.marina.rhinoda_test_tast.model;

import com.rhinoda.marina.rhinoda_test_tast.model.forJson.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IPostApi {

    String URL = "http://api.armfriend.com/";

    @GET("post/get_all?count=10&type=1&offset=0&city_id=0&sex=2&key=aK7vTOALevDPxr8yRFgnyKttB40Py0IT234487&1577251044290")
    Call<Data> getDataWeb();
}
