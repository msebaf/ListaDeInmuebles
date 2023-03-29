package com.miempresa.listadeinmuebles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();
        generarListView();
    }


    public void generarListView(){
        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this, R.layout.item,lista, getLayoutInflater());
        ListView lv = findViewById(R.id.miLista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.inm1, "Los arroyos 234", 70000));
        lista.add(new Inmueble(R.drawable.inm2, "Patricios 27", 567500));
        lista.add(new Inmueble(R.drawable.inm3, "calle falsa 123", 65000));
    }
}