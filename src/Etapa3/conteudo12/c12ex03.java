package Etapa3.conteudo12;

import java.util.Scanner;

public class c12ex03 {
    public static void main(String[] args) {
        double vet[]=new double[10];
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux< vet.length;aux++){
            System.out.println("informe um valor: ");
            vet[aux]=tec.nextInt();
        }
        for (int aux=0;aux< vet.length;aux++){
            vet[aux]=Math.pow(vet[aux],2);
            System.out.println("Valor: "+vet[aux]);
        }
        tec.close();
    }
}
