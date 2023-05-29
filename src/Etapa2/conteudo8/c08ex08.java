package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex08 {
    public static void main(String[] args) {
        int faltas,rep,contAlunosMais=0,soma=0,contAlunosAprov=0;
        double notaF,media;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe o numero de alunos: ");
        rep=teclado.nextInt();
        for (int aux=1;aux<=rep;aux++){
            System.out.println("Informe o valor da sua nota final: ");
            notaF= teclado.nextDouble();
            System.out.println("Informe a quantidade que voce tem de faltas: ");
            faltas=teclado.nextInt();
            if (faltas>=16)
                contAlunosMais++;
            if (notaF>=65&&faltas<=16) {
                System.out.println("Aluno aprovado");
                soma+=notaF;
                contAlunosAprov++;
            }
            else
                System.out.println("Aluno reprovado");
        }
        media=(float)soma/contAlunosAprov;
        System.out.println("Media dos alunos aprovados: "+media+"\n" +
                "Quantidade de alunos com mais de 16 faltas: "+contAlunosMais);
        teclado.close();
    }
}
