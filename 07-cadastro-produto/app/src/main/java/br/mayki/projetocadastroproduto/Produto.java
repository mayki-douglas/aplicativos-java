package br.mayki.projetocadastroproduto;

public class Produto {

    private int id;
    private String nome;
    private String categoria;
    private float valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n"+
                "ID: " + id + "\n"+
                "Nome: " + nome + '\n' +
                "Categoria: " + categoria + '\n' +
                "Valor: " + valor;
    }
}
