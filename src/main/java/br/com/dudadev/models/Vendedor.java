package br.com.dudadev.models;

public class Vendedor extends Empregado{
    private double valorVenda;
    private double comissao;

    public Vendedor(){
        super();
        this.valorVenda = 0.0;
        this.comissao = 0.0;
    }

    public Vendedor(String nome,String telefone, String endereco,
                    int codigoSetor, double salarioBase, double imposto,
                    double valorProducao, double comissao){
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorVenda = valorProducao;
        this.comissao = comissao;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVenda * (comissao/100));
    }

    @Override
    public String toString() {
        return super.toString() +
                ", valor vendas: " + valorVenda +
                ", comissao: " + comissao;
    }
}
