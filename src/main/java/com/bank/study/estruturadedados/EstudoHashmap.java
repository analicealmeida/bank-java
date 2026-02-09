package com.bank.study.estruturadedados;

import com.bank.model.Funcionario;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class EstudoHashmap {
    public static void main(String[] args) {
        Map <String, Funcionario> mapa = new HashMap<>();

        Funcionario f1 = new Funcionario("12678","Ana", "ana@gmail.com");
        Funcionario f2 = new Funcionario("12555","Joao", "Joao@gmail.com");
        Funcionario f3 = new Funcionario("12932","Lucas", "lucas@gmail.com");
        mapa.put(f1.getCpf(), f1);
        mapa.put(f2.getCpf(), f2);
        mapa.put(f3.getCpf(), f3);


        mapa.forEach((k,v)->{
            System.out.println("chave: " + k + " valor: " + v.getNome());
        });


    }
}
