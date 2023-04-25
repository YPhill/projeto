package br.com.etecia.acheaqui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationBarView;

public class MainSobreActivity extends AppCompatActivity {

    Toolbar toolBarSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_sobre_layout);

        toolBarSobre = findViewById(R.id.toolBarSobre);


        toolBarSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        startActivity(new Intent(getApplicationContext(),MainActivity.class));


            }
        });


    }
}