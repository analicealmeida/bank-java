package com.bank.study;

import java.util.Scanner;

public class Condicoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome: ");

        String nome = sc.nextLine();

        System.out.println("Digite uma idade");

        int idade = sc.nextInt();

        /*if (idade >= 21 ){
            System.out.println(nome + " é responsável por outras pessoas.");
        }
        else if(idade >= 18){
            System.out.println(nome + " é maior de idade");
        }
        else{
            System.out.println(nome + " é menor de idade.");
        }
**/
        //System.out.println(idade >= 18 ? nome + "é maior de idade" : nome + "é menor de idade");


        /*switch (idade) {
            case 18:
                System.out.println("tem 18 anos");
                break;
            case 21:
                System.out.println("tem 21 anos");
                break;
            default:
                System.out.println("é menor de idade");
                break;
        }
**/


    }
}
