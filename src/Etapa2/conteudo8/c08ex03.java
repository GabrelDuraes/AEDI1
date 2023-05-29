package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex03 {
    public static void main(String[] args) {
        int faltas, contA, contR;
        double notaF;
        contA = 0;
        contR = 0;
        Scanner teclado = new Scanner(System.in);
        for (int repete = 1; repete <= 50; repete++) {
            System.out.println("Informe o valor da nota Final: ");
            notaF = teclado.nextDouble();
            if (notaF == -1)
                break;
            System.out.println("Informe o numero de faltas: ");
            faltas = teclado.nextInt();
            if (notaF >= 65 && faltas <= 16) {
                System.out.println("Aluno aprovado");
                contA++;
            }
            else{
                    System.out.println("Aluno reprovado");
                    contR++;
                }
            }
                System.out.println("Aprovados: " + contA + "\n" +
                        "Reprovados: " + contR);
                teclado.close();
            }
        }