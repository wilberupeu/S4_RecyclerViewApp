package com.example.s4_recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> listDatos;
    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recycler=findViewById(R.id.RecyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


        listDatos=new ArrayList<String>();
        for(int i=0;i<=50;i++){
            listDatos.add(" Dato #  "+i+" ");
        }

        AdapterDatos adapter=new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);

    }


}