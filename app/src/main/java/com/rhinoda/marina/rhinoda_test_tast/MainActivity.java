package com.rhinoda.marina.rhinoda_test_tast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
    int count = factorial(strYasha.length());
    //int max =
    int shift = strYasha.length();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_default_view_activity);
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.textView);
        editTxt = findViewById(R.id.editText);
        img = findViewById(R.id.imageView);
        sw = findViewById(R.id.switch1);

//item 1.9
        btn.setOnClickListener(v -> {strYasha.split(" ");
        //COMBINATION
           /* while(count<0){
                String t = strYasha[shift];
            }*/

        });


//item 1.10
        sw.setOnCheckedChangeListener((buttonView, isChecked) -> { img.setVisibility(isChecked ? View.VISIBLE :  View.GONE); });
        editTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                btn.setText(editTxt.getText());
            }
        });
    }

    public  Integer factorial(int n){
        return (n>0)?n*factorial(n-1):1;
    }




}

