package Etapa2.conteudo11;

import java.util.Scanner;

public class c11ex01 {
    public static void main(String[] args) {
        int numero,cont=0;
        double funcao,conta=0,soma=0,media;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero=teclado.nextInt();
        while (conta<numero){
            cont++;
            conta=2*cont-1;
            funcao=Math.pow(conta,2)+((4*conta-2.0)/5);
            soma+=funcao;
            System.out.println("Valor da funcao: "+funcao);
        }
        media=soma/cont;
        System.out.println();
        System.out.println("Media da funcao: "+media);
        teclado.close();
    }
}
