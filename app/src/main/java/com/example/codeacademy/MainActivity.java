package com.example.codeacademy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends Activity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
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
}