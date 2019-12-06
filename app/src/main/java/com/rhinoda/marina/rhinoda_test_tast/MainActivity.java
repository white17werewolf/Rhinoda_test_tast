package com.rhinoda.marina.rhinoda_test_tast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn;
    TextView txt;
    EditText editTxt;
    ImageView img;
    Switch sw;
    String  strYasha = "Яша кушал кашу";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_default_view_activity);
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.textView);
        editTxt = findViewById(R.id.editText);
        img = findViewById(R.id.imageView);
        sw = findViewById(R.id.switch1);

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void  onClick(View v)
            {
                strYasha.split(" ");


            }
        };
        btn.setOnClickListener(listener);}




}
