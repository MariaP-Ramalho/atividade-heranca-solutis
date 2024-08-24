package br.com.dudadev.test;

import br.com.dudadev.models.Pessoa;

public class TestePessoa {

    public void testaPessoa(){

        System.out.println("-------------TESTE PESSOA-------------");

        System.out.println("Incialização de pessoa com os 3 construtores diferentes ");
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("João", "12345678", "Rua A, 123");
        Pessoa pessoa3 = new Pessoa("Maria", "87654321");

        System.out.println("--------------------------------------------------");

        System.out.println("Print as 3 pessoas após inicialização utilizando o metodo toString ");
        System.out.println("Pessoa 1: " + pessoa1);
        System.out.println("Pessoa 2: " + pessoa2);
        System.out.println("Pessoa 3: " + pessoa3);

        System.out.println("--------------------------------------------------");

        System.out.println("Teste de getters e setters atribuindo valores a pessoa 1");
        pessoa1.setNome("Felipe");
        pessoa1.setEndereco("endereco123");
        pessoa1.setTelefone("11223344");
        System.out.println("Pessoa 1 Atualizado: " + pessoa1.getNome() + ", " + pessoa1.getEndereco() + ", " + pessoa1.getTelefone());

    }
}
