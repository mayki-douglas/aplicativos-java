package br.mayki.projetocadastroproduto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText editNome, editCategoria, editValor;
    private Button buttonCadastrar, buttonListar;
    private ProdutoDAO objProdutoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getSupportActionBar().hide();

        editNome = findViewById(R.id.editNome);
        editCategoria = findViewById(R.id.editCategoria);
        editValor = findViewById(R.id.editValor);
        buttonCadastrar = findViewById(R.id.buttonCadastrar);
        buttonListar = findViewById(R.id.buttonListar);
        objProdutoDAO = new ProdutoDAO(this);

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Produto objProduto = new Produto();
                objProduto.setNome(editNome.getText().toString());
                objProduto.setCategoria(editCategoria.getText().toString());
                objProduto.setValor(Float.parseFloat(editValor.getText().toString()));
                objProdutoDAO.cadastrarProduto(objProduto);
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