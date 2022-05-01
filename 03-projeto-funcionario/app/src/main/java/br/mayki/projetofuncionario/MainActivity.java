package br.mayki.projetofuncionario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularSalario(View view){

        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextCpf = findViewById(R.id.editTextCpf);
        EditText editTextValor1 = findViewById(R.id.editTextValor1);
        EditText editTextValor2 = findViewById(R.id.editTextValor2);
        Funcionario objFuncionario = new Funcionario();

        if(editTextName.getText().toString().isEmpty() || editTextCpf.getText().toString().isEmpty() || editTextValor1.getText().toString().isEmpty() || editTextValor2.getText().toString().isEmpty()){
            Toast.makeText(this, "Preencha os campos em Branco!", Toast.LENGTH_LONG).show();
        }else {
            objFuncionario.setNome(editTextName.getText().toString());
            objFuncionario.setCpf(Long.parseLong(editTextCpf.getText().toString()));
            objFuncionario.setValorHora(Float.parseFloat(editTextValor1.getText().toString()));
            objFuncionario.setCargaHorariaMes(Float.parseFloat(editTextValor2.getText().toString()));

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Resultado");
            builder.setMessage(objFuncionario.toString());

            AlertDialog alert = builder.create();
            alert.show();
        }
    }
}