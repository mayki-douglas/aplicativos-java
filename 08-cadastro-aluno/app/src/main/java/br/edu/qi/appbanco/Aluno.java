package br.edu.qi.appbanco;

public class Aluno {

    private int id;
    private String nome;
    private long cpf;
    private String telefone;

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

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n"+
                "ID do Aluno: " + id +"\n"+
                "Nome: " + nome + '\n' +
                "CPF: " + cpf + "\n"+
                "Telefone: " + telefone;
    }
}
