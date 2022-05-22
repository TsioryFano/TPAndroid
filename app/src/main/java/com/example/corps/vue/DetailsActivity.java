package com.example.corps.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.corps.R;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ecouteImgBtn((ImageButton) findViewById(R.id.btnRetourDeDetail), ChoiceActivity.class);
    }

    private void ecouteImgBtn (ImageButton btn, final Class classe){
        btn.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(DetailsActivity.this, classe);
                startActivity(intent);
            }
        });
    }
}