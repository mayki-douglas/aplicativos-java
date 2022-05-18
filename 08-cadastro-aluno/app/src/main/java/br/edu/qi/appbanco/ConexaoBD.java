package br.edu.qi.appbanco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexaoBD extends SQLiteOpenHelper {

    private static final String name = "bd_escola";
    private static final int version = 1;

    public ConexaoBD(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase bdEscola) {

        bdEscola.execSQL("create table tb_aluno(id integer not null primary key autoincrement, " +
                "nome varchar(100), cpf bigint, telefone varchar(50) )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
