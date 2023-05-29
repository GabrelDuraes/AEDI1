package Etapa3.conteudo12;

import java.util.Scanner;

public class c12ex26 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nome ;
        System.out.println("Digite uma frase: ");
        nome = tec.nextLine();
        String[] palavra = nome.split(" ");
        for (int aux = 0; aux < palavra.length; aux++) {
            System.out.println(palavra[aux]);
        }
    }
}
