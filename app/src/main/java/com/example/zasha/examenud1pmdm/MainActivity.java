package com.example.zasha.examenud1pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Añado el boton oyente buscandolo por su ID
        Button button = (Button) findViewById(R.id.button);

        // Añado el evento onClick sobre el boton Verificar
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                calcular();
            }
        });
    }

    //METODO

    public void calcular() {

        EditText dato = (EditText) findViewById(R.id.editText);
        String num = dato.getText().toString();


        int numero = Integer.parseInt(num);
        int factorial = 1;


        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }
        //return numero;


        //Localizo la textView destino y le paso el resultado del metodo
        TextView resultado = (TextView) findViewById(R.id.textView);
        resultado.setText("El factorial de " + num + " es " + factorial);
    }







}//Final de la clase principal
