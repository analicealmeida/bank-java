package com.bank.study.estruturadedados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteSet {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Antonio");
        nomes.add("Antonio");
        nomes.add("Rodrigo");
        nomes.add("Serra");
        nomes.add("Analice");

        nomes.forEach(n->{
            System.out.println(n);
        });

        System.out.println("------------------------------");

        Set<String> nomeSet = new HashSet<>();

        nomeSet.add("Antonio");
        nomeSet.add("Antonio");
        nomeSet.add("Rodrigo");
        nomeSet.add("Serra");
        nomeSet.addAll(nomes);

        nomeSet.forEach(n->{
            System.out.println(n);
        });

    }
}
