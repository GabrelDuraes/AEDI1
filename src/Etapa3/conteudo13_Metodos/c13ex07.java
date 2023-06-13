package Etapa3.conteudo13_Metodos;

import java.util.Scanner;

public class c13ex07 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nomeS;
        System.out.println("Digite Fim em nome para encerrar o programa!");
        do {
            System.out.println("Informe seu nome completo:");
            nomeS = tec.nextLine();
            String[] cadaNo = nomeS.split(" ");
            if (nomeS.equalsIgnoreCase("Fim") || nomeS.equalsIgnoreCase("fim")) {
                System.out.println("Programa finalizado!");
                break;
            }
            System.out.println("Voce pertence a familia " + cadaNo[cadaNo.length - 1]);
        } while (!(nomeS.equalsIgnoreCase("Fim") || nomeS.equalsIgnoreCase("fim")));
        tec.nextLine();
    }
}
