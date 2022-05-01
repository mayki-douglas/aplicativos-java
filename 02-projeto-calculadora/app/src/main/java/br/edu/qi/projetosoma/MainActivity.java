package br.edu.qi.projetosoma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        TextView textResult = findViewById(R.id.textResult);
        Calculadora objCalculadora = new Calculadora();

        if (edit1.getText().toString().isEmpty() || edit2.getText().toString().isEmpty()){
            Toast.makeText(this, "Insira os Valores!", Toast.LENGTH_LONG).show();
        }else {
            objCalculadora.setValor1(Float.parseFloat(edit1.getText().toString()));
            objCalculadora.setValor2(Float.parseFloat(edit2.getText().toString()));

            textResult.setText(""+objCalculadora);
        }



    }
}