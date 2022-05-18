package br.edu.qi.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText editNome, editCpf, editTelefone;
    private Button buttonCadastro, buttonListar;
    private AlunoDAO objAlunoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();

        editNome = findViewById(R.id.editNome);
        editCpf = findViewById(R.id.editCpf);
        editTelefone = findViewById(R.id.editTelefone);
        buttonCadastro = findViewById(R.id.buttonCadastro);
        buttonListar = findViewById(R.id.buttonListar);
        objAlunoDAO = new AlunoDAO(this);

        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aluno objAluno = new Aluno();
                objAluno.setNome(editNome.getText().toString());
                objAluno.setCpf(Long.parseLong(editCpf.getText().toString()));
                objAluno.setTelefone(editTelefone.getText().toString());
                objAlunoDAO.cadastrarAluno(objAluno);
            }
        });

        buttonListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadastroActivity.this, ListaActivity.class);
                startActivity(intent);
            }
        });
    }
}