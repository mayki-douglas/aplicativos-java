package br.edu.qi.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaActivity extends AppCompatActivity {

    private ListView listaAlunos;
    private AlunoDAO objAlunoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        getSupportActionBar().hide();

        listaAlunos = findViewById(R.id.listaAlunos);
        objAlunoDAO = new AlunoDAO(this);

        ArrayAdapter<Aluno> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, objAlunoDAO.consultarAlunos());
        listaAlunos.setAdapter(adapter);
    }
}