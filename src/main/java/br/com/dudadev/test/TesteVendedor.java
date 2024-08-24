package br.com.dudadev.test;

import br.com.dudadev.models.Operario;
import br.com.dudadev.models.Vendedor;

public class TesteVendedor {
    public void testaVendedor(){

        System.out.println("-------------TESTE VENDEDOR-------------");

        System.out.println("Incialização de vendedor com os 2 construtores diferentes ");
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor("Operario2", "98765432", "endereço789", 3, 2000.0, 15, 1000, 5);

        System.out.println("--------------------------------------------------");

        System.out.println("Print os 2 vendedores após inicialização utilizando o metodo toString ");
        System.out.println("Teste Operario 1: " + vendedor1);
        System.out.println("Teste Operario 2: " + vendedor2);

        System.out.println("--------------------------------------------------");

        System.out.println("Teste de getters e setters atribuindo valores a vendedor 1");

        vendedor1.setNome("vendedor 1");
        vendedor1.setTelefone("1122334455");
        vendedor1.setCodigoSetor(5);
        vendedor1.setSalarioBase(2500.0);
        vendedor1.setImposto(15);
        vendedor1.setValorVenda(1500);
        vendedor1.setComissao(7);
        System.out.println("Fornecedor 1 Atualizado: " + vendedor1.getNome() + ", "
                + vendedor1.getEndereco() + ", " + vendedor1.getTelefone()+ ", "
                + vendedor1.getCodigoSetor() + ", " + vendedor1.getSalarioBase() +
                ", " + vendedor1.getImposto() + ", " + vendedor1.calcularSalario()  +
                ", " + vendedor1.getValorVenda() + ", " + vendedor1.getComissao());

    }
}
