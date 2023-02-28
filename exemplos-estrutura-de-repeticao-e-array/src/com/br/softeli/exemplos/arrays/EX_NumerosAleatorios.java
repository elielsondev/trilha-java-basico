package com.br.softeli.exemplos.arrays;

import java.util.Random;
/* Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 * e armazene-os num array:
 *  - Ao final mostre os números inputados no array. */

public class EX_NumerosAleatorios {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        // Obs: Esse vinte é a quantidade de espaços que
        // desejamos que o array possua.
        int[] numerosAleatorios = new int[20];
        int count = 0;

        do {
            int num = aleatorio.nextInt(100);
            numerosAleatorios[count] = num;
            count ++;
        } while (count < numerosAleatorios.length);

        System.out.println("Numeros do Array:");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

    }
}
