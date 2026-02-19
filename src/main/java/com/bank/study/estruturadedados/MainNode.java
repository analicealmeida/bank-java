package com.bank.study.estruturadedados;

public class MainNode {
    public static void main(String[] args) {
        Node meuNode = new Node(42);
        Node novoNode = new Node(55);
        meuNode.proximo = novoNode;

        Node currentNode = meuNode;
        while (currentNode != null) {
            if (currentNode.dado == 42) {
                System.out.println("Encontrado o Node com valor 42!");
                break;
            }
            currentNode = currentNode.proximo;
        }
    }

}
