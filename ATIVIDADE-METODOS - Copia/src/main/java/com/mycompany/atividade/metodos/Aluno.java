package com.mycompany.atividade.metodos;

import java.util.Scanner;

public class Aluno {
    Scanner sc = new Scanner(System.in);
    String nome = "Antony";
    String matricula = "202322040008";
    int idade = 22;
    String turma = "TSI-P3";
    double cre = 100.0;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    boolean situacao = true;
    
    public void exibirInfo(){
        System.out.println(nome);
        System.out.println(matricula);
        System.out.println(idade);
        System.out.println(turma);
        System.out.println(nota1 +" "+ nota2+" " + nota3 +" "+ nota4);
        System.out.println(cre);
        System.out.println(situacao);
    }
    public void definirNotas(){
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();
    }
    public void definirSituacao(){
        double media = (nota1 + nota2 + nota3 + nota3)/4.0;
        if(media>=7.0){
            System.out.println("Aluno aprovado.");
            System.out.println(media);
        }else{
            System.out.println("Aluno reprovado.");
            System.out.println(media);
        }
    }
}
