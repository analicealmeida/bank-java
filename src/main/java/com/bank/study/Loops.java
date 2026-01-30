package com.bank.study;

import java.util.ArrayList;
import java.util.List;

public class Loops {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Joao");
        for (int i=0;i< nomes.size();i++){
            String nome = nomes.get(i);
            System.out.println(nome);
        }

        for(String nome : nomes){
            System.out.println(nome);
        }

        nomes.forEach(nome-> System.out.println(nome));
        int contador = 2;
        while (contador < 2){
            System.out.println(nomes.get(contador));
            contador ++;
        }



    }
}
