package com.example.corps.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.ImageButton;

import com.example.corps.R;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        ecouteImgBtn((ImageButton) findViewById(R.id.imgBtnAcceuil), MainActivity.class);
        ecouteImgBtn((ImageButton) findViewById(R.id.imgBtnCorps), DetailsActivity.class);
        ecouteImgBtn((ImageButton) findViewById(R.id.imgBtnLaver), WashActivity.class);
    }

    private void ecouteImgBtn (ImageButton btn, final Class classe){
        btn.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ChoiceActivity.this, classe);
                startActivity(intent);
            }
        });
    }
}