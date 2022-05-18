package br.mayki.projetocadastroproduto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private SQLiteDatabase bd_produto;
    private ConexaoBD conexaoBD;

    public ProdutoDAO(Context context) {
        this.conexaoBD = new ConexaoBD(context);
        this.bd_produto = conexaoBD.getWritableDatabase();
    }

    public void cadastrarProduto(Produto objProduto){
        ContentValues values = new ContentValues();
        values.put("nome", objProduto.getNome());
        values.put("categoria", objProduto.getCategoria());
        values.put("valor", objProduto.getValor());
        this.bd_produto.insert("tb_produto", null, values);
    }

    public List<Produto> consultarProdutos(){
        List<Produto> encontrados = new ArrayList<>();

        Cursor cursor = bd_produto.query("tb_produto", new String[]{"id", "nome", "categoria", "valor"},
                null, null, null, null, null);
        while (cursor.moveToNext()){
            Produto objProduto = new Produto();
            objProduto.setId(cursor.getInt(0));
            objProduto.setNome(cursor.getString(1));
            objProduto.setCategoria(cursor.getString(2));
            objProduto.setValor(cursor.getFloat(3));
            encontrados.add(objProduto);
        }
        return encontrados;
    }
}
