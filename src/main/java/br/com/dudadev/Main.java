package br.com.dudadev;

import br.com.dudadev.models.Empregado;
import br.com.dudadev.test.TesteAdministrador;
import br.com.dudadev.test.TesteEmpregado;
import br.com.dudadev.test.TesteFornecedor;
import br.com.dudadev.test.TestePessoa;

public class Main {
    public static void main(String[] args) {

        TestePessoa testePessoa = new TestePessoa();
        TesteFornecedor testeFornecedor = new TesteFornecedor();
        TesteEmpregado testeEmpregado = new TesteEmpregado();
        TesteAdministrador testeAdministrador = new TesteAdministrador();

//        testePessoa.testaPessoa();
//        testeFornecedor.testaFornecedor();
//        testeEmpregado.testaEmpregado();
        testeAdministrador.testaAdministrador();
    }
}