package com.luizafmartinez.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

      // Atributo
      String[] frases = {
              "Frase 01",
              "Frase 02",
              "Frase 03"
      };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view) {


    }

    public void exibirTodas(View view) {
        TextView texto = findViewById(R.id.textResultado);
        String textoResultado = "";
        for ( String frase: frases ) {
           textoResultado = textoResultado + frase;
        }
        texto.setText(textoResultado);
    }






}