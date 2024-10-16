package com.mycompany.atividade.metodos;


public class Elevador {
    int andar_atual;
    int max_pessoas;
    int pessoas_atuais;
    int total_andares;
    
    
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
    public void sobe(){
        if (andar_atual < total_andares){
            andar_atual++;
        }
            
    }
    public void desce(){
        if (andar_atual > 0){
            andar_atual--;
        }
    }
}
