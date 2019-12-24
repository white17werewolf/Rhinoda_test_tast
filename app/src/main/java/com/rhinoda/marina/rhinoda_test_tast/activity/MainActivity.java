package com.rhinoda.marina.rhinoda_test_tast.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rhinoda.marina.rhinoda_test_tast.R;
import com.rhinoda.marina.rhinoda_test_tast.try_retrofit.Api;
import com.rhinoda.marina.rhinoda_test_tast.try_retrofit.JsonTest;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button btn;
    @BindView(R.id.textView)
    TextView txt;
    @BindView(R.id.editText)
    EditText editTxt;
    @BindView(R.id.imageView)
    ImageView img;
    @BindView(R.id.switch1)
    Switch sw;
    String strYasha = "Яша кушал кашу";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_default_view_activity);

        ButterKnife.bind(this);
        Intent intent = new Intent(this, SecondActivity.class);

//item 1.9
        //txt.setText(strYasha);
        btn.setOnClickListener(v -> {strYasha.split(" ");
            //COMBINATION
        });

//item 1.10
        sw.setOnCheckedChangeListener((buttonView, isChecked) -> img.setVisibility(isChecked ?
                View.GONE :  View.VISIBLE));

        editTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void afterTextChanged(Editable s) {
                btn.setText(editTxt.getText());} });

//item 1.11
        img.setOnClickListener(v -> startActivity(intent));


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);
        Call<JsonTest> call = api.getJson("0");

        /* ****************** TEST
            call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.d("name", "onResponse");
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("name", "onFailure");
            }
        });*/ 
        
        call.enqueue(new Callback<JsonTest>() {
            @Override
            public void onResponse(Call<JsonTest> call, Response<JsonTest> response) {
                JsonTest   t = response.body();
                //JsonTest t = new JsonTest(tmp.string());
                   Log.d("Address ", t.getAddress());
                    Log.d("Email ", t.getEmail());
                    Log.d("Full name ", t.getFull_name());
                    Log.d("ID", String.valueOf(t.getId()));
                    Log.d("Short name", t.getShort_name());
            }

         @Override
            public void onFailure(Call<JsonTest> call, Throwable t) {
                txt.setText(t.getMessage());
                //Toast.makeText(getApplicationContext(),  t.getMessage(), Toast.LENGTH_LONG).show();
             Log.d("Loser", "Loser"); }
        });

    }
}




