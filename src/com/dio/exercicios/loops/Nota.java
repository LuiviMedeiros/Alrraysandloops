package com.dio.exercicios.loops;

/* Faça um programa que peça ma nota, entre zero e dez
   Mostre uma mensagem caso o valor seja invalido e continue pedindo
   até que o usuario informe um valor valido */

import java.util.Scanner;

public class Nota {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        int nota;

        System.out.println("Nota ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota Inválida! Digite Novamente ");
            nota = scan.nextInt();


        }

    }
}
