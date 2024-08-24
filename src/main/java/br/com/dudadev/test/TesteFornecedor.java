package br.com.dudadev.test;

import br.com.dudadev.models.Fornecedor;

public class TesteFornecedor {

    public void testaFornecedor(){

        System.out.println("-------------TESTE FORNECEDOR-------------");

        System.out.println("Incialização de fornecedor com os 3 construtores diferentes ");
        Fornecedor fornecedor1 = new Fornecedor();
        Fornecedor fornecedor2 = new Fornecedor("Loja X", "98765432", "endereço789", 1000.0, 3000.0);
        Fornecedor fornecedor3 = new Fornecedor("Empresa Z", "45678901", 50000.0, 20000.0);

        System.out.println("--------------------------------------------------");

        System.out.println("Print as 3 pessoas após inicialização utilizando o metodo toString ");
        System.out.println("Teste Fornecedor 1: " + fornecedor1);
        System.out.println("Teste Fornecedor 2: " + fornecedor2);
        System.out.println("Teste Fornecedor 3: " + fornecedor3);

        System.out.println("--------------------------------------------------");

        System.out.println("Teste de getters e setters atribuindo valores a pessoa 1");

        fornecedor1.setNome("Joaquim");
        fornecedor1.setTelefone("1122334455");
        fornecedor1.setValorCredito(15000.0);
        fornecedor1.setValorDivida(5000.0);
        System.out.println("Fornecedor 1 Atualizado: " + fornecedor1.getNome() + ", "
                + fornecedor1.getEndereco() + ", " + fornecedor1.getTelefone()+ ", "
                + fornecedor1.getValorCredito() + ", " + fornecedor1.getValorDivida() +
                ", " + fornecedor1.obterSaldo());

    }
}
