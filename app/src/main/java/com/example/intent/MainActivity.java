package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonElso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

        buttonElso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masodik_activityre = new Intent(MainActivity.this,nemtommi.class);
                startActivity(masodik_activityre);  //ezzel iondítod el az intent változót
                finish();                           //ezzel zárjuk az első alkalmazást
            }
        });
        }

    public void init()
    {
        buttonElso = findViewById(R.id.button_elso);

    }
}
