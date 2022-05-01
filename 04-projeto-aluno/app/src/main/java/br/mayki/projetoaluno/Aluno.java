package br.mayki.projetoaluno;

public class Aluno {

    private String nome;
    private long ra;
    private float nota1;
    private float nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float calcularMedia(){
        return (this.nota1 + this.nota2) /2;
    }

    public String vericarSituacao(){
        if (calcularMedia() >= 6){
            return "Aprovado!";
        }else {
            return "Reprovado!";
        }
    }

    public String toString(){
        return "Nome do Aluno: "+this.nome+"\n" +
                "Registro Acadêmico: "+this.ra+"\n" +
                "Nota 1: "+this.nota1+"\n" +
                "Nota 2: "+this.nota2+"\n" +
                "Média do Aluno: "+this.calcularMedia()+"\n" +
                "Situação: "+this.vericarSituacao();
    }
}
