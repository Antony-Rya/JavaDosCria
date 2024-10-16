package com.mycompany.atividade.metodos;

import java.util.Scanner;

public class ATIVIDADEMETODOS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Aluno aluno = new Aluno();
        Elevador elevador = new Elevador();
        int qtd_andares = sc.nextInt();
        System.out.println(elevador.andar_atual);
        elevador.sobe(qtd_andares);
        System.out.println(elevador.andar_atual);
    }
}
