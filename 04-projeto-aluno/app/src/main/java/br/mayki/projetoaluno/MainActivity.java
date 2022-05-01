package br.mayki.projetoaluno;

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

    public void verificarAluno(View view) {

        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        EditText edit3 = findViewById(R.id.edit3);
        EditText edit4 = findViewById(R.id.edit4);
        Aluno objAluno = new Aluno();

        if(edit1.getText().toString().isEmpty() || edit2.getText().toString().isEmpty() || edit3.getText().toString().isEmpty() || edit4.getText().toString().isEmpty()){
            Toast.makeText(this, "Preencha os Campos em Branco!", Toast.LENGTH_SHORT).show();
        }else {
            objAluno.setNome(edit1.getText().toString());
            objAluno.setRa(Long.parseLong(edit2.getText().toString()));
            objAluno.setNota1(Float.parseFloat(edit3.getText().toString()));
            objAluno.setNota2(Float.parseFloat(edit4.getText().toString()));

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Situação do Aluno");
            builder.setMessage(objAluno.toString());

            AlertDialog alert = builder.create();
            alert.show();
        }

    }

}