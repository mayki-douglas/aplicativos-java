package br.mayki.projetocadastroproduto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaActivity extends AppCompatActivity {

    private ListView listaProdutos;
    private ProdutoDAO objProdutoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        getSupportActionBar().hide();

        listaProdutos = findViewById(R.id.listaProdutos);
        objProdutoDAO = new ProdutoDAO(this);

        ArrayAdapter<Produto> adaptor = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,objProdutoDAO.consultarProdutos());
        listaProdutos.setAdapter(adaptor);
    }
}