package com.mycompany.atividade.metodos;


public class Elevador {
    int andar_atual = 0;
    int max_pessoas = 5;
    int pessoas_atuais = 0;
    int total_andares = 10;
    
    
    public void entra(){
        if (pessoas_atuais < max_pessoas){
            pessoas_atuais ++;
        }
    }
    public void sai(){
        if (pessoas_atuais < max_pessoas){
            pessoas_atuais--;
        }
    }
    public void sobe(int qtd_andares){
        if (andar_atual < total_andares){
            andar_atual += qtd_andares;
        }
            
    }
    public void desce(){
        if (andar_atual > 0){
            andar_atual--;
        }
    }
}
