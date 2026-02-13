package com.bank.study.generics;

import com.bank.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class TesteGeneric {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();

        CaixaGenerica<String> cg = new CaixaGenerica<>();
        cg.setConteudo("Antonio");

        CaixaGenerica<Integer> cgInt = new CaixaGenerica<>();
        cgInt.setConteudo(10);

        CaixaGenerica<Cliente> cgCli = new CaixaGenerica<>();
        cgCli.setConteudo(new Cliente());

        System.out.println(cg.getConteudo());
    }
}
