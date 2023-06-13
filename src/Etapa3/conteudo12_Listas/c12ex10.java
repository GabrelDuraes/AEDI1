package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex10 {
    public static void main(String[] args) {
        String nome[]=new String[5];
        double nota[]=new double[50],somaN=0,media;
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux< nome.length;aux++){
            System.out.println("Informe o nome do aluno: ");
            nome[aux]=tec.nextLine();
            System.out.println("Informe a nota do aluno "+nome[aux]+":");
            nota[aux]= tec.nextDouble();
            tec.nextLine();
        }
        for (int aux=0;aux< nome.length;aux++){
            somaN+=nota[aux];
        }
        media=somaN/nome.length;
        for (int aux=0;aux< nome.length;aux++){
            if (nota[aux]>media)
                System.out.println("Aluno que ficou acima da media: "+nome[aux]);
        }
        tec.close();
    }
}
