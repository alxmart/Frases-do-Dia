package com.luizafmartinez.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

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

        TextView texto = findViewById(R.id.textResultado);

        int numeroAleatorio = new Random().nextInt(3);  // 0, 1, 2

        String frase = frases[numeroAleatorio];

        texto.setText(frase);

    }

    public void exibirTodas(View view) {

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";

        for ( String frase: frases ) {
           textoResultado = textoResultado + frase + "\n";
        }
        texto.setText(textoResultado);
    }

    /*
    1) "" + "Frase 01" + quebra linha
    2) "Frase 01" + "Frase 02" + quebra linha
    2) "Frase 01" + "Frase 02" + "FRase 03" + quebra linha
    */






}