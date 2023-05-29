package Etapa3.conteudo12;

import java.util.Scanner;

public class c12ex21 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int[] num=new int[20];
        for(int aux=0;aux<num.length;aux++){
            System.out.println("Informe um numero inteiro: ");
            num[aux]=tec.nextInt();
        }
        for (int aux=0;aux<num.length;aux++){
            if (aux%2!=0)
                System.out.println("Numero informado em espacos impares: "+num[aux]);
        }
        System.out.println();
        for (int aux=0;aux<num.length;aux++){
            if (aux%2==0)
                System.out.println("Numero informado em espacos pares: "+num[aux]);
        }
        tec.close();
    }
}
