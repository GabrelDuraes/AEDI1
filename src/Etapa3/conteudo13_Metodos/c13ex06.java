package Etapa3.conteudo13_Metodos;

import java.util.Scanner;

public class c13ex06 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String familia, nomeS;
        int cont = 0;
        System.out.println("Informe o nome de uma familia:");
        familia = tec.nextLine();
        for (int aux = 0; aux < 100; aux++) {
            System.out.println("Informe um nome completo:");
            nomeS = tec.nextLine();
            String[] cadaNo = nomeS.split(" ");
            if (cadaNo[cadaNo.length - 1].equalsIgnoreCase(familia)) {
                cont++;
            }
        }
        System.out.println(cont + " pessoas s�o da familia " + familia);
        tec.nextLine();
    }
}