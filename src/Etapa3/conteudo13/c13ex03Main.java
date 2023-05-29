package Etapa3.conteudo13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c13ex03Main {
    public static void main(String[] args) {
        int posicao;
        String num;
        Scanner tec=new Scanner(System.in);
        System.out.println("Informe um numero inteiro:");
        num=tec.nextLine();
        System.out.println("Informe a posicao que deseja pegar do numero digitado:");
        posicao=tec.nextInt();
        System.out.println("Numero da posicao "+posicao+": "+c13ex03Metodo.NumPosicao(num,posicao));
        tec.nextLine();
    }
}
