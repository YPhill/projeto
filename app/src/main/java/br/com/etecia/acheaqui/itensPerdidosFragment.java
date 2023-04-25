package br.com.etecia.acheaqui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class itensPerdidosFragment extends Fragment {


    Button mvoltar;

    BottomNavigationView bottomNavigationView;

    addFragment homeFragment = new addFragment();

    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_itens_perdidos, container, false);





    }
}