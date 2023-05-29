package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex02 {
    public static void main(String[] args) {
        int faltas;
        double notaF;
        Scanner teclado =new Scanner(System.in);
        for (int repete=1;repete<=50;repete++){
            System.out.println("Informe o valor da nota Final: ");
            notaF=teclado.nextDouble();
            if (notaF==-1)
                break;
            System.out.println("Informe o numero de faltas: ");
            faltas=teclado.nextInt();
            if (notaF>=65&&faltas<=16)
                System.out.println("Aluno aprovado");
            else
                System.out.println("Aluno reprovado");
        }
        teclado.close();
    }
}
