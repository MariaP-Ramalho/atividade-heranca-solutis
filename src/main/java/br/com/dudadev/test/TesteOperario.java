package br.com.dudadev.test;

import br.com.dudadev.models.Empregado;
import br.com.dudadev.models.Operario;

public class TesteOperario {
    public void testaOperario(){

        System.out.println("-------------TESTE OPERARIO-------------");

        System.out.println("Incialização de operário com os 2 construtores diferentes ");
        Operario operario1 = new Operario();
        Operario operario2 = new Operario("Operario2", "98765432", "endereço789", 3, 2000.0, 15, 1000, 5);

        System.out.println("--------------------------------------------------");

        System.out.println("Print os 2 empregados após inicialização utilizando o metodo toString ");
        System.out.println("Teste Operario 1: " + operario1);
        System.out.println("Teste Operario 2: " + operario2);

        System.out.println("--------------------------------------------------");

        System.out.println("Teste de getters e setters atribuindo valores a operario 1");

        operario1.setNome("Operario 1");
        operario1.setTelefone("1122334455");
        operario1.setCodigoSetor(5);
        operario1.setSalarioBase(2500.0);
        operario1.setImposto(15);
        operario1.setValorProducao(1500);
        operario1.setComissao(7);
        System.out.println("Fornecedor 1 Atualizado: " + operario1.getNome() + ", "
                + operario1.getEndereco() + ", " + operario1.getTelefone()+ ", "
                + operario1.getCodigoSetor() + ", " + operario1.getSalarioBase() +
                ", " + operario1.getImposto() + ", " + operario1.calcularSalario()  +
                ", " + operario1.getValorProducao() + ", " + operario1.getComissao());

    }
}
