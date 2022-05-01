package br.edu.qi.projetosoma;

public class Calculadora {

    private float valor1;
    private float valor2;

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float calcularSoma(){
        return this.valor1 + this.valor2;
    }

    public float calcularSubtracao(){
        return this.valor1 - this.valor2;
    }

    public float calcularMultiplacao(){
        return this.valor1 * this.valor2;
    }

    public float calcularDivisao(){
        return this.valor1 / this.valor2;
    }

    public float calcularResto(){
        return this.valor1 % this.valor2;
    }

    public float potencia(){
        return (float) Math.pow(valor1, valor2);
    }

    public float raiz(){
        return (float) Math.pow(valor1, 1 / this.valor2);
    }

    public String toString(){
        return "\n" +
                "Soma: "+this.calcularSoma()+"\n" +
                "Subtração: "+this.calcularSubtracao()+"\n" +
                "Multiplicação: "+this.calcularMultiplacao()+"\n" +
                "Divisão: "+this.calcularDivisao()+"\n" +
                "Resto: "+this.calcularResto()+"\n" +
                "Potencia: "+this.potencia()+"\n" +
                "Raiz: "+this.raiz();
    }
}
