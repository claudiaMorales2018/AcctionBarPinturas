package com.example.myappactionbar;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setTitle("Barra de Accion");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

       MenuInflater menuInflater = getMenuInflater();
       menuInflater.inflate(R.menu.menu_items,menu);

       return true;



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "Hola bienvenido a este mundo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "Hola bienvenido a la clase programacion", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "Hola bienvenido a la clase de ingles", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);

    }





}