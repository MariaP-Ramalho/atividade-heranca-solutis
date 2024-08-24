package br.com.dudadev.test;

import br.com.dudadev.models.Administrador;
import br.com.dudadev.models.Empregado;

public class TesteAdministrador {

    public void testaAdministrador(){

        System.out.println("-------------TESTE ADMINISTRADOR-------------");

        System.out.println("Incialização de administrador com os 2 construtores diferentes ");
        Administrador administrador1 = new Administrador();
        Administrador administrador2 = new Administrador("Miranda", "98765432", "endereço789",
                3, 1000.0, 15, 500);

        System.out.println("--------------------------------------------------");

        System.out.println("Print os 2 administradores após inicialização utilizando o metodo toString ");
        System.out.println("Teste Empregado 1: " + administrador1);
        System.out.println("Teste Empregado 2: " + administrador2);

        System.out.println("--------------------------------------------------");

        System.out.println("Teste de getters e setters atribuindo valores a administrador 1");

        administrador1.setNome("Joaquim");
        administrador1.setTelefone("1122334455");
        administrador1.setCodigoSetor(5);
        administrador1.setSalarioBase(15000.0);
        administrador1.setImposto(15);
        System.out.println("Fornecedor 1 Atualizado: " + administrador1.getNome() + ", "
                + administrador1.getEndereco() + ", " + administrador1.getTelefone()+ ", "
                + administrador1.getCodigoSetor() + ", " + administrador1.getSalarioBase() +
                ", " + administrador1.getImposto() + ", " + administrador1.getAjudaDecusto() +
                ", " + administrador1.calcularSalario() );

    }
}
