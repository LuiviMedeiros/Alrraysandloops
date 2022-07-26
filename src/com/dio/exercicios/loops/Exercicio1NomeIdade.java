package com.dio.exercicios.loops;

/* 1- Faça um programa que leia conjuntos de dois valores, o primeiro
      representando o nome do aluno e o segundo representando a idade do aluno
      (pare o programa quando for inserido 0 zero no campo nome */

import java.util.Scanner;

public class Exercicio1NomeIdade {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("Idade ");
            idade = scan.nextInt();

        }


}
}