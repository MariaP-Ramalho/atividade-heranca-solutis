package br.com.dudadev;

import br.com.dudadev.models.Empregado;
import br.com.dudadev.test.*;

public class Main {
    public static void main(String[] args) {

        TestePessoa testePessoa = new TestePessoa();
        TesteFornecedor testeFornecedor = new TesteFornecedor();
        TesteEmpregado testeEmpregado = new TesteEmpregado();
        TesteAdministrador testeAdministrador = new TesteAdministrador();
        TesteOperario testeOperario = new TesteOperario();

//        testePessoa.testaPessoa();
//        testeFornecedor.testaFornecedor();
//        testeEmpregado.testaEmpregado();
//        testeAdministrador.testaAdministrador();
        testeOperario.testaOperario();
    }
}