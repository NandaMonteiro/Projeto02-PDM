package com.example.nandapc.exerciciopdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class segundaTela extends AppCompatActivity {

    List<String> opcoes;
    ArrayAdapter<String> adaptador;
    ListView lvOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        lvOpcoes = (ListView) findViewById(R.id.lista);

        opcoes = new ArrayList<String>();


//        String[] contatos = new String[]{"fernanda", "nanda", "flavia"};



    }
}
