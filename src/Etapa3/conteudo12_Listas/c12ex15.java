package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex15 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
         int[] Num=new int[10];
         int soma=0,cont=0;
         double media;
         for(int aux=0;aux< Num.length;aux++){
             System.out.println("Informe um numero inteiro:");
             Num[aux]=tec.nextInt();
         }
         for (int aux=0;aux< Num.length;aux++){
             if (Num[aux]%2==0){
                 System.out.println("Numero par:"+Num[aux]);
                 soma+=Num[aux];
                 cont++;
             }
         }
         media=(float)soma/cont;
        System.out.println("Media dos numeros pares: "+media);
        tec.close();
    }
}
