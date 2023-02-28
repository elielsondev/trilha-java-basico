package com.br.softeli.exemplos.arrays;

import java.util.Random;

public class Ex_ArrayMultidirecional {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[][] matriz = new int[4][4];

        for(int indexLinha = 0; indexLinha < matriz.length; indexLinha ++) {
            for(int indexColuna = 0; indexColuna < matriz[indexLinha].length; indexColuna ++) {
                matriz[indexLinha][indexColuna] = aleatorio.nextInt(9);
            }
        }

        System.out.println("Matriz:");
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }
}
