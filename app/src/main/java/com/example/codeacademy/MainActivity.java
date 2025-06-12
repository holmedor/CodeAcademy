package com.example.codeacademy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//public class MainActivity extends AppCompatActivity {
//  public class MainActivity extends Activity {
    public class MainActivity extends AppCompatActivity {

    private ImageView imgvQuienesSomos;
    private ImageView imgvCursos;
    private ImageView imgvContacto;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imgvQuienesSomos=(ImageView) findViewById(R.id.imgvQuienesSomos);
        imgvCursos=(ImageView) findViewById(R.id.imgvCursos);
        imgvContacto=(ImageView) findViewById(R.id.imgvContacto);
        imgvQuienesSomos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, QuienesSomosActivity.class));
            }
        });
        imgvCursos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, CursosActivity.class));
            }
        });
        imgvContacto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, ContactoActivity.class));
            }
        });
//        boton = (Button) findViewById(R.id.btnLlamar);
//        boton.setOnClickListener(new View.OnClickListener(){
/*            @Override
            public void onClick(View v){
//                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(intent);
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        */

/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
 */
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
        if (itemId == R.id.mnuItemClientes) {
            startActivity(new Intent(this, ClientesActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}