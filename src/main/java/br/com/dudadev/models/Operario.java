package br.com.dudadev.models;

public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(){
        super();
        this.valorProducao = 0.0;
        this.comissao = 0.0;
    }

    public Operario(String nome,String telefone, String endereco,
                    int codigoSetor, double salarioBase, double imposto,
                    double valorProducao, double comissao){
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()  + (valorProducao * (comissao/100));
    }

    @Override
    public String toString() {
        return super.toString() +
                ", valor producao: " + valorProducao +
                ", comissao: " + comissao;
    }
}
