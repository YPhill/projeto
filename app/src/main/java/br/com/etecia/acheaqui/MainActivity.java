package br.com.etecia.acheaqui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    MaterialToolbar toolbar;

    DrawerLayout drawerLayout;

    NavigationView NavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView = findViewById(R.id.navMenu);


        toolbar = findViewById(R.id.toolBar);

        drawerLayout = findViewById(R.id.idNavDrawer);

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawerLayout, toolbar, R.string.navopen, R.string.navclose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mNotifcacoes:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        return true;
                    case R.id.mItensPd:
                        startActivity(new Intent(getApplicationContext(),MainCardsActivity.class));
                        return true;
                    case R.id.mPerdiItm:
                        startActivity(new Intent(getApplicationContext(),MainBottomActivity.class));
                        return true;
                    case R.id.mSobre:
                        startActivity(new Intent(getApplicationContext(), MainSobreActivity.class));
                        return true;
                }
                return false;
            }
        });








    }
}