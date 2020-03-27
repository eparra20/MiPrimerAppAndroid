package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Integer unEntero ;
    private Button buttonEnviar;
    //todo 1 crear atributo de tipo EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Necesitamos enlazar nuestro button java con el button XML
        buttonEnviar = findViewById(R.id.mainActivityButtonEnviar);
        //todo 2 enlanzar el editText Java al editText XML (FindViewByid)

        //cuando le hagan click a este boton HACE ALGO (Pattern Observer)
        //Puedo presonar control + espacio para la ayuda
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo 3 Pedirle al objeto editText el texto [editText.getText().toString()] y guardarlo en una variable.
                //aca va la accion real de cuando presionen al boton enviar.
                //Una tostada responde 3 cosas.
                // Donde, Que y Cuanto tiempo y por lo ultimo lo mostramos (.show())
                //todo 4 Mostrar el mensaje.
                Toast.makeText(MainActivity.this, "Hola hicieron click", Toast.LENGTH_LONG).show();
            }
        });


    }

}
