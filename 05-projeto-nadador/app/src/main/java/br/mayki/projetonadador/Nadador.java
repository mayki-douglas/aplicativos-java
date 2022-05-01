package br.mayki.projetonadador;

public class Nadador {

    private String nome;
    private int anoNascimento;
    private int anoAtual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public byte calcularIdadeAproximada(){
        return (byte) (this.anoAtual - this.anoNascimento);
    }

    public String classificarNadador(){
        if (this.calcularIdadeAproximada() < 8 || this.calcularIdadeAproximada() > 60){
            return "Não pode ser Nadador, idade entre 8 ou 60 anos";
        }else if(this.calcularIdadeAproximada() >= 8 && this.calcularIdadeAproximada() <= 10){
            return "Nadador Infantil";
        }else if(this.calcularIdadeAproximada() >= 11 && this.calcularIdadeAproximada() <=17){
            return "Nadador Juvenil";
        }else if(this.calcularIdadeAproximada() >=18 && this.calcularIdadeAproximada() <= 49){
            return "Nadador Adulto";
        }else {
            return "Nadador de Terceira idade";
        }
    }

    public String toString(){
        return "Nome: "+this.nome+"\n" +
                "Ano de Nascimento: "+this.anoNascimento+"\n" +
                "Idade Aproximada: "+this.calcularIdadeAproximada()+"\n"+
                "Classificação da Pessoa: "+this.classificarNadador();
    }
}
