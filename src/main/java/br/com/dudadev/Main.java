package br.com.dudadev;

import br.com.dudadev.test.TesteFornecedor;
import br.com.dudadev.test.TestePessoa;

public class Main {
    public static void main(String[] args) {

        TestePessoa testePessoa = new TestePessoa();
        TesteFornecedor testeFornecedor = new TesteFornecedor();

        testePessoa.testaPessoa();
        testeFornecedor.testaFornecedor();


    }
}