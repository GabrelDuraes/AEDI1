package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex20 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int[] num=new int[10];
        int soma=0,cont=0;
        double media;
        for(int aux=0;aux< num.length;aux++){
            System.out.println("Informe um numero inteiro: ");
            num[aux]=tec.nextInt();
        }
        for(int aux=0;aux< num.length;aux++){
            if (num[9]<num[aux]){
                System.out.println("Numero maior que "+num[9]+": "+num[aux]);
                soma+=num[aux];
                cont++;
            }
        }
        media=(float)soma/cont;
        System.out.println("Media dos numeros maior que "+num[9]+": "+media);
        tec.close();
    }
}
