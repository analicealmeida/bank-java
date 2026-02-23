package com.bank.study.estruturadedados;

public class BubbleSort {

    public static void main(String[] args) {

        //vetor de 3 indices, 0,1,2
        int[] v = {3, 1, 2};

        //i = percorre todo o vetor, j percorre o vetor menos o ultimo indice.

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {

                //se o indice do vetor j for maior que o indice
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }

            }
        }





        }
    }

