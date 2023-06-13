package Etapa3.conteudo13_Metodos;

import java.util.Scanner;

public class c13ex08 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        String nome,ultNome;
        System.out.println("Informe o nome do autor: ");
        nome=tec.nextLine();
        String[] nomeDiv=nome.split(" ");
        ultNome=nomeDiv[nomeDiv.length-1];
        ultNome=ultNome.toUpperCase();
        System.out.print(ultNome+", ");
        for (int aux=0;aux< nomeDiv.length-1;aux++){
            System.out.print(nomeDiv[aux].charAt(0)+". ");
        }
        tec.close();
    }
}
