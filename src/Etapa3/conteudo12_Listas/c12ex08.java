package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex08 {
    public static void main(String[] args) {
        int num[]=new int[20],soma[]=new int[10],posicao;
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux<num.length;aux++){
            System.out.println("Informe um numero: ");
            num[aux]=tec.nextInt();
        }
        System.out.println("Soma dos numeros informados:");
        for (int aux=0;aux<soma.length;aux++){
            soma[aux]+=num[aux]+num[aux+10];
            posicao=aux+1;
            System.out.println("Soma "+posicao+": "+soma[aux]);
        }
        tec.close();
    }
}
