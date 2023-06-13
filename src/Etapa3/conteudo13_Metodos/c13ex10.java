package Etapa3.conteudo13_Metodos;

import java.util.Scanner;

public class c13ex10 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        String frase;
        String[] nome;
        System.out.println("Informe seu nome completo: ");
        frase=tec.nextLine();
        frase=frase.toUpperCase();
        nome=frase.split("");
        for (int aux=0;aux<nome.length;aux++){
            System.out.println(nome[aux]);
        }
        tec.close();
    }
}
