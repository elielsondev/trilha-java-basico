package com.br.softeli.exemplos.arrays;

public class Ex_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {20, -7, 13, 32, 0, 4};

        System.out.println("Vetor original:");
        int count = 0;

        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count ++;
        }

        System.out.println("\nVetor invertido:");
        for(int index = (vetor.length -1); index >= 0; index -= 1) {
            System.out.print(vetor[index] + " ");
        }

        System.out.println(" ");
    }
}
