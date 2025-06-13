package com.example.codeacademy;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContactoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contacto);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //AÑADE EL MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mnu_principal, menu);
        return true;
    }

    //GESTIONA EL CLICK EN EL MENU
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*switch(item.getItemId())
        {
            case R.id.mnuItemClientes:
                startActivity(new Intent(this, ClientesActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/
        int itemId = item.getItemId();
        if (itemId == R.id.mnuItemQuienesSomos) {
            startActivity(new Intent(this, QuienesSomosActivity.class));
        }
        if (itemId == R.id.mnuItemCursos) {
            startActivity(new Intent(this, CursosActivity.class));
        }
        if (itemId == R.id.mnuItemContacto) {
            startActivity(new Intent(this, ContactoActivity.class));
        }
        if (itemId == R.id.mnuItemClientes) {
            startActivity(new Intent(this, ClientesActivity.class));
        }
        if (itemId == R.id.mnuItemInicio) {
            startActivity(new Intent(this, MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}