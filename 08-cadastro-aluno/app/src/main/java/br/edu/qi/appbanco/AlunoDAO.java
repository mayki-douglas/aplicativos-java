package br.edu.qi.appbanco;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private SQLiteDatabase bd_escola;
    private ConexaoBD conexaoBD;

    public AlunoDAO(Context context) {
        this.conexaoBD = new ConexaoBD(context);
        this.bd_escola = conexaoBD.getWritableDatabase();

    }

    public void cadastrarAluno(Aluno objAluno){
        ContentValues values = new ContentValues();
        values.put("nome", objAluno.getNome());
        values.put("cpf", objAluno.getCpf());
        values.put("telefone", objAluno.getTelefone());
        this.bd_escola.insert("tb_aluno", null, values);
    }

    public List <Aluno> consultarAlunos(){
        List <Aluno> encontrados = new ArrayList<>();

        Cursor cursor =bd_escola.query("tb_aluno", new String[]{"id","nome","cpf","telefone"},
                null ,null,null, null, null);
        while (cursor.moveToNext()){
            Aluno objAluno = new Aluno();
            objAluno.setId(cursor.getInt(0));
            objAluno.setNome(cursor.getString(1));
            objAluno.setCpf(cursor.getLong(2));
            objAluno.setTelefone(cursor.getString(3));
            encontrados.add(objAluno);

        }

        return encontrados;
    }
}
