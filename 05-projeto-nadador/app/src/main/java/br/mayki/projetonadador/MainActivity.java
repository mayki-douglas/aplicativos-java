package br.mayki.projetonadador;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularIdade(View view) {

        EditText editNome = findViewById(R.id.editNome);
        EditText editAnoAtual = findViewById(R.id.editAnoAtual);
        EditText editAnoNascimento = findViewById(R.id.editAnoNascimento);
        Nadador objNadador = new Nadador();

        if (editNome.getText().toString().isEmpty() || editAnoAtual.getText().toString().isEmpty() || editAnoNascimento.getText().toString().isEmpty()){
            Toast.makeText(this, "Preencha os Campos!", Toast.LENGTH_SHORT).show();
        }else {
            objNadador.setNome(editNome.getText().toString());
            objNadador.setAnoAtual(Integer.parseInt(editAnoAtual.getText().toString()));
            objNadador.setAnoNascimento(Integer.parseInt(editAnoNascimento.getText().toString()));

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Resultados");
            builder.setMessage(objNadador.toString());

            AlertDialog alert = builder.create();
            alert.show();
        }
    }
}