package br.com.etecia.acheaqui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class OutrosFragment extends Fragment {


    ListView lstOutros;

    String nomeOutros[] = {"Corrente", "Anel", "Guarda-Chuva", "Pulseira"};
    String descricaoOutros[] = {
            "Tipo De Acessório: Corrente \nLocalizado em: Estação Bras",
            "Tipo De Acessório: Anel \nLocalizado em: Estação Barra Funda",
            "Tipo De Acessório:  Guarda-Chuva \nLocalizado em: Estação Barra funda",
            "Tipo De Acessório: Pulseira \nLocalizado em: Estação Lapa"
    };


    int imgOutros[] = {
            R.drawable.corrente, R.drawable.anel,
            R.drawable.guardachuva, R.drawable.pulseira
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_outros, container, false);

        lstOutros = view.findViewById(R.id.lstOutros);

        AdapterOutros adapterOutros = new AdapterOutros();

        lstOutros.setAdapter(adapterOutros);

        return view;

    }

    public class AdapterOutros extends BaseAdapter {

        @Override
        public int getCount() {
            return imgOutros.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            TextView txtNomeOutros, txtDescricaoOutros;
            ImageView imgModeloOutros;

            View v = getLayoutInflater().inflate(R.layout.modelooutros, null);

            txtNomeOutros = v.findViewById(R.id.txtNomeOutros);
            txtDescricaoOutros = v.findViewById(R.id.txtDescricaoOutros);
            imgModeloOutros = v.findViewById(R.id.imgModeloOutros);


            txtNomeOutros.setText(nomeOutros[i]);
            txtDescricaoOutros.setText(descricaoOutros[i]);
            imgModeloOutros.setImageResource(imgOutros[i]);


            return v;


        }
    }

}