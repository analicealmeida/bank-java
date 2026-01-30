package com.bank.study.estruturadedados;

public class Produtos {
    //criou a classe Produtos, declarou 2 atributos, deixou o construtor default
    // encapsulou com get e set e por ultimo sobrescreveu o metodo toString
    private int id;
    private String nome;

   public Produtos (String nome) {
       this.nome = nome;
   }
   public Produtos (){

   }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //sobreescrevendo um metodo ja existente, toString, para formatar o texto.
    @Override
    public String toString() {
        return "Produtos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
