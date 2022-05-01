package br.mayki.projetofuncionario;

public class Funcionario {

    private String nome;
    private long cpf;
    private float valorHora;
    private float cargaHorariaMes;

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

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getCargaHorariaMes() {
        return cargaHorariaMes;
    }

    public void setCargaHorariaMes(float cargaHorariaMes) {
        this.cargaHorariaMes = cargaHorariaMes;
    }

    public float calcularSalarioBase(){
        return this.valorHora * this.cargaHorariaMes;
    }

    public String toString(){
        return "Nome: "+this.nome+"\n" +
                "CPF: "+this.cpf+"\n" +
                "Valor Hora: " +this.valorHora+"\n" +
                "Carga Horária Mês: "+this.cargaHorariaMes+"\n" +
                "Salário Base: "+this.calcularSalarioBase();
    }
}
