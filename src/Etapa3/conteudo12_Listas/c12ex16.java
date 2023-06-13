package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex16 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        double[] Num=new double[10];
        double NumReal;
        int posicao;
        for(int aux=0;aux< Num.length;aux++){
            System.out.println("Informe um numero inteiro:");
            Num[aux]=tec.nextDouble();
        }
        System.out.println("Informe um numero para multiplicar os outros: ");
        NumReal=tec.nextDouble();
        for (int aux=0;aux<Num.length;aux++){
            Num[aux]=NumReal*Num[aux];
            posicao=aux+1;
            System.out.println(posicao+" numero informado multiplicado por "+NumReal+": "+Num[aux]);
        }
        tec.close();
    }
}
