package br.com.dudadev.test;

import br.com.dudadev.models.Empregado;
import br.com.dudadev.models.Fornecedor;

public class TesteEmpregado  {
    public void testaEmpregado(){

        System.out.println("-------------TESTE EMPREGADO-------------");

        System.out.println("Incialização de empregado com os 2 construtores diferentes ");
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado("Miranda", "98765432", "endereço789", 3, 1000.0, 15);

        System.out.println("--------------------------------------------------");

        System.out.println("Print os 2 empregados após inicialização utilizando o metodo toString ");
        System.out.println("Teste Empregado 1: " + empregado1);
        System.out.println("Teste Empregado 2: " + empregado2);

        System.out.println("--------------------------------------------------");

        System.out.println("Teste de getters e setters atribuindo valores a empregado 1");

        empregado1.setNome("Joaquim");
        empregado1.setTelefone("1122334455");
        empregado1.setCodigoSetor(5);
        empregado1.setSalarioBase(15000.0);
        empregado1.setImposto(15);
        System.out.println("Fornecedor 1 Atualizado: " + empregado1.getNome() + ", "
                + empregado1.getEndereco() + ", " + empregado1.getTelefone()+ ", "
                + empregado1.getCodigoSetor() + ", " + empregado1.getSalarioBase() +
                ", " + empregado1.getImposto() + ", " + empregado1.calcularSalario() );

    }
}
