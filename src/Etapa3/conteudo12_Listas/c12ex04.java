package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex04 {
    public static void main(String[] args) {
        String vet[]=new String[20],vet10[]=new String[10];
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux< vet.length;aux++){
            System.out.println("Informe o numero do corredor em ordem: ");
            vet[aux]=tec.nextLine();
        }
        for (int aux=0;aux< vet10.length;aux++){
            System.out.println("Corredores: "+vet[aux]+" e "+vet[aux+10]);
        }
        tec.close();
    }
}
