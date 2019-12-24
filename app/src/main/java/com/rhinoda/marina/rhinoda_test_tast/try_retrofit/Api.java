package com.rhinoda.marina.rhinoda_test_tast.try_retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    String URL = "https://agrico-b2be8.firebaseio.com/";

    @GET("api/users/{number}.json")
    Call<JsonTest> getJson(@Path("number") String number);

}
