package Etapa3.conteudo12;

import java.util.Scanner;

public class c12ex12 {
    public static void main(String[] args) {
        String[] nome =new String[8];
        double[] nota =new double[8];
        double notaMa=0;
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux< nome.length;aux++){
            System.out.println("Informe o nome do aluno: ");
            nome[aux]=tec.nextLine();
            System.out.println("Informe a nota do aluno "+nome[aux]+":");
            nota[aux]= tec.nextDouble();
            tec.nextLine();
        }
        for(int aux=0;aux<nome.length;aux++){
            if (nota[aux]>notaMa){
                notaMa=nota[aux];
            }
        }
        for (int aux=0;aux<nome.length;aux++){
           if(nota[aux]==notaMa)
               System.out.println("Nota maior: "+nome[aux]);
               
        }
        tec.close();
    }
}
