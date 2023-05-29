package Etapa3.conteudo12;

import java.util.Scanner;

public class c12ex07 {
    public static void main(String[] args) {
        String nome[]=new String[50];
        Double notaF[]=new Double[50];
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux<nome.length;aux++){
            System.out.println("Informe o nome do aluno:");
            nome[aux]=tec.nextLine();
            System.out.println("Informe a nota final do aluno "+nome[aux]+":");
            notaF[aux]=tec.nextDouble();
            tec.nextLine();
        }
        for (int aux=0;aux<notaF.length;aux++){
            if (notaF[aux]<=30)
                System.out.println("Aluno: "+nome[aux]+"\nConceito D.");
            else if (notaF[aux]<=60)
                System.out.println("Aluno: "+nome[aux]+"\nConceito C.");
            else if (notaF[aux]<=80)
                System.out.println("Aluno: "+nome[aux]+"\nConceito B.");
            else
                System.out.println("Aluno: "+nome[aux]+"\nConceito A.");
                System.out.println("como coco");
        }
        tec.close();
    }
}
