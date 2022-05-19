package com.example.corps.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.corps.R;
import com.example.corps.controleur.Controle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        this.controle = Controle.getInstance();
    }
    //Propriétés

    private EditText txtPrenom;
    private EditText txtAge;
    private ImageView imgAccueil;
    private ImageButton imgValider;
    private Controle controle;

    //Liaison entre ces variables et les objets graphiques
    private void init(){
        txtPrenom = (EditText) findViewById(R.id.txtPrenom);
        txtAge = (EditText) findViewById(R.id.txtAge);
        imgAccueil = (ImageView) findViewById(R.id.imgAccueil);
        imgValider = (ImageButton) findViewById(R.id.imgValider);
        ecouteValider();
    }

    private void ecouteValider (){
        ((ImageButton) findViewById(R.id.imgValider)).setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ChoiceActivity.class);
                startActivity(intent);
            }
        });
    }
}
