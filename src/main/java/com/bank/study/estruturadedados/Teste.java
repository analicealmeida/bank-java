package com.bank.study.estruturadedados;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declarando um array de objeto
        Produtos[] produtos = new Produtos[100];
        produtos[0] = new Produtos("Lapis");
        produtos[1] = new Produtos("Caneta");
        produtos[2] = new Produtos("Borracha");
        produtos[3] = new Produtos("Estojo");
        produtos[4] = new Produtos("Caderno");
        produtos[5] = new Produtos("Calculadora");
        //assegurando que o indice inicie em 0
        int contador = 6;

        while (true) {
            //comandos para o usuario
            System.out.println("Digite um numero: ");
            System.out.println("Digite 1 para adicionar um produto: ");
            System.out.println("Digite 2 para excluir um produto: ");
            System.out.println("Digite 3 para listar todos os produtos: ");
            System.out.println("Digite 0 para sair do programa: ");
            System.out.println("Digite 4 para buscar um produto especifico.");
            System.out.println("Digite 5 para atualizar um produto.");
            //variavel que armazena os comandos do usuario
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Programa encerrado");
                break;
            } else if (numero == 1) {
                //aqui foi declarado e instanciado um objeto simples para inserir valores no array
                System.out.println("Digite o nome do produto: ");
                String nome = sc.next();
                Produtos produto = new Produtos();
                produto.setNome(nome);
                produtos[contador] = produto;
                contador++;
                System.out.println("\n Produto cadastrado com sucesso.");
            } else if (numero == 3) {
                for (int i = 0; i < produtos.length; i++) {
                    if (produtos[i] != null) {
                        System.out.println(produtos[i]);
                    }

                }

            } else if (numero == 2) {
                System.out.println("Digite o produto que quer excluir: ");
                String excluir = sc.next();
                int excluirIndex = 0;
                boolean found = false;
                for (int i = 0; i < contador; i++) {

                    Produtos produto = produtos[i];
                    if (excluir.equalsIgnoreCase(produto.getNome())) {
                        excluirIndex = i;
                        found = true;
                        break;
                    }
                }
                if (found) {
                    contador--;
                    produtos[excluirIndex] = produtos[contador];
                    produtos[contador] = null;
                }
            } else if (numero == 4) {
                System.out.println("Digite o nome do produto que você quer buscar: ");
                String nome = sc.next();

                boolean encontrado = false;

                //for para percorrer o array em busca dos dados do usuario
                for (Produtos p : produtos) {
                    if (p == null){
                        break;
                    }
                    //buscando dados do usuario
                    if (p.getNome().equalsIgnoreCase(nome)) {
                        System.out.println(p);
                        encontrado = true;
                        break;
                    }

                }
                if (!encontrado) { //parei aqui
                    System.out.println("Produto não encontrado.");
                }


            } else if (numero == 5) {
                System.out.println("Digite o nome do produto que você quer atualizar: ");
                String nome = sc.next();


                int indiceEncontrado = -1;

                for (int i = 0; i < contador; i++) {
                    Produtos produto = produtos[i];
                    if (produto.getNome().equalsIgnoreCase(nome)) {
                        indiceEncontrado = i;
                        break;
                    }


                }
                if (indiceEncontrado != -1) {

                    System.out.println("Produto encontrado!");

                    System.out.println("Digite o novo produto:");
                    String novoProduto = sc.next();

                    System.out.println("Produto atualizado com sucesso!");
                    produtos[indiceEncontrado].setNome(novoProduto);

                } else {
                    System.out.println("Produto não encontrado.");
                }


            }
        }
    } }