package com.rhinoda.marina.rhinoda_test_tast.Presenter;

import android.util.Log;

import com.rhinoda.marina.rhinoda_test_tast.IEvenView;
import com.rhinoda.marina.rhinoda_test_tast.R;
import com.rhinoda.marina.rhinoda_test_tast.model.IPostApi;
import com.rhinoda.marina.rhinoda_test_tast.model.Post;
import com.rhinoda.marina.rhinoda_test_tast.model.forJson.Data;
import com.rhinoda.marina.rhinoda_test_tast.model.forJson.DataExample;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EventPresenter implements IEventPresenter {

    private IEvenView evenView;
    List<DataExample> dataExample;

    Data dataJson;

    public EventPresenter(IEvenView evenView){ this.evenView = evenView;}

    public void getData() {
        List<Post> data = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(IPostApi.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IPostApi api = retrofit.create(IPostApi.class);
        Call<Data> call = api.getDataWeb();

        call.enqueue(new Callback<Data>() {

            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                dataJson = response.body();
                dataExample =  dataJson.getResponse();

               for(DataExample currentPost:dataExample){
                   data.add(new Post(
                           "Name Surame",
                           String.valueOf(currentPost.getDate()),
                           currentPost.getText(),
                           "Peoples",
                           currentPost.getLikes(),
                           currentPost.getCommentCount(),
                           currentPost.getComplaint(),
                           //currentPost.getImage(),
                           //currentPost.getImageSmall());
                           R.drawable.bg_post_event,
                           R.drawable.bg_post_event));

                   evenView.update(data);
               }
               Log.d("ok ", "ok");
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                Log.d("Wasted ", t.getMessage());
            }
        });
    }

}