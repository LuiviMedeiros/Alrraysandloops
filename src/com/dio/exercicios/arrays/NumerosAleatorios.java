package com.dio.exercicios.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); /* Gera numeros aleatorios*/

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i< numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("\nNumeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");

        }
        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + 1 + " ");

        }
        System.out.print("\nAntecessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero - 1 + " ");

        }


    }
}
