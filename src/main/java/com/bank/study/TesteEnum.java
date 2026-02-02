package com.bank.study;

import com.bank.model.Cargo;

public class TesteEnum {

    public static void main(String[] args) {
        System.out.println(Cargo.ATENDENTE);

        for (Cargo cargo : Cargo.values()){
            System.out.println(cargo);
            System.out.println(cargo.getSalarioMinimo());
        }
    }
}
