package br.com.dudadev.models;

public class Administrador extends Empregado{
    private double ajudaDecusto;

    public Administrador(){
        super();
        this.ajudaDecusto = 0.0;
    }

    public Administrador(String nome,String telefone, String endereco, int codigoSetor, double salarioBase, double imposto, double ajudaDecusto){
        super(nome, telefone, endereco,codigoSetor, salarioBase,imposto);
        this.ajudaDecusto = ajudaDecusto;
    }

    public double getAjudaDecusto() {
        return ajudaDecusto;
    }

    public void setAjudaDecusto(double ajudaDecusto) {
        this.ajudaDecusto = ajudaDecusto;
    }

    @Override
    public double calcularSalario() {
        return (getSalarioBase() * (1 - (getImposto() / 100))) + ajudaDecusto;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Ajuda de custo: " + ajudaDecusto;
    }
}
