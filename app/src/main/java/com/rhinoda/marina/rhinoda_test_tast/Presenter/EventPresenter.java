package com.rhinoda.marina.rhinoda_test_tast.Presenter;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.rhinoda.marina.rhinoda_test_tast.EventAdapter;
import com.rhinoda.marina.rhinoda_test_tast.IEvenView;
import com.rhinoda.marina.rhinoda_test_tast.R;
import com.rhinoda.marina.rhinoda_test_tast.model.IPostApi;
import com.rhinoda.marina.rhinoda_test_tast.model.Post;
import com.rhinoda.marina.rhinoda_test_tast.model.forJson.Data;
import com.rhinoda.marina.rhinoda_test_tast.model.forJson.DataAboutPost;
import com.rhinoda.marina.rhinoda_test_tast.model.forJson.UserData;
import com.rhinoda.marina.rhinoda_test_tast.model.forJson.UserDataLikes;
import com.rhinoda.marina.rhinoda_test_tast.model.forJson.UserDataLikesList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class EventPresenter implements IEventPresenter {

        private IEvenView evenView;
        List<DataAboutPost> dataExample;
        Data dataJson;
        UserData currentUser;
        EventAdapter eventAdapter = new EventAdapter();


        UserDataLikesList currentLikes;
        List<UserDataLikes> likesList;
        UserDataLikes tmp;



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

                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void onResponse(Call<Data> call, Response<Data> response) {
                    dataJson = response.body();
                    dataExample =  dataJson.getResponse();



                    for(DataAboutPost currentPost:dataExample){
                        currentUser = currentPost.getUserData();
                        String time = eventAdapter.convertDate(currentPost.getDate());
                        //likesList = currentLikes.getUserLikesList();//ПОЛУЧИТЬ ПУЛЛ ЛАЙКЕРОВ
                        //System.out.println(likesList);
                        //currentPost.getDate();
                        //System.out.println("HEEEEEEEEEEREEEEEE  \n \n \n" + currentPost.getDate());
                        System.out.println("HEEEEEEEEEEREEEEEE  \n" + eventAdapter.convertDate(currentPost.getDate()));

                        data.add(new Post(
                                currentUser.getName(),
                                eventAdapter.convertDate(currentPost.getDate()),
                                //currentPost.getDate(), //ЗАМЕНИТЬ НА НОВУЮ ДАТУ
                                currentPost.getText(),
                                currentUser.getName(), //НАПИСАТЬ ОТДЕЛЬНУЮ МОДЕЛЬ ДЛЯ ЛАЙКНУВШИХ
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