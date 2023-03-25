package com.example.pm1e2grupo6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnAgregar;
        ImageButton btnLista;
        ImageButton btnAbout;
        btnAgregar= findViewById(R.id.btnadd);
        btnLista= findViewById(R.id.btnlist);
        btnAbout = findViewById(R.id.btnAbout);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Integrantes");
                builder.setMessage("Yelsin Alberto Sánchez\nYency  Julieth  Ortega\nAngie Suyapa Lemus\nKatheryn Pamela Hernández\nNelson Geovanny Izaguirre\nObed Josue Garcia");
                builder.setPositiveButton("OK", null);
                builder.show();
            }
        });
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddActivity.class);
                startActivity(intent);
            }
        });
        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intent);
            }
        });
    }
}