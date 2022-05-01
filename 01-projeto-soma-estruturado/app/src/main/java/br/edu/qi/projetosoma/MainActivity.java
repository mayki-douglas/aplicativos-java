package br.edu.qi.projetosoma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view){

        EditText edtValor1 = (EditText) findViewById(R.id.edtValor1);
        EditText edtValor2 = (EditText) findViewById(R.id.edtValor2);
        TextView txtResultado = findViewById(R.id.txtResultado);

        float valor1 = Float.parseFloat(edtValor1.getText().toString());
        float valor2 = Float.parseFloat(edtValor2.getText().toString());

        txtResultado.setText(String.valueOf(valor1 + valor2));
    }
}