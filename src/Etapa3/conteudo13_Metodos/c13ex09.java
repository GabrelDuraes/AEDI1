package Etapa3.conteudo13_Metodos;

import java.util.Scanner;

public class c13ex09 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        String frase,letra,resto;
        System.out.println("Informe uma frase: ");
        frase=tec.nextLine();
        String[] nome=frase.split(" ");
        for (int aux=0;aux< nome.length;aux++){
            letra=nome[aux].substring(0,1).toUpperCase();
            resto=nome[aux].substring(1).toLowerCase();
            System.out.print(letra+resto+" ");
        }
        tec.close();
    }
}
