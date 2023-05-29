package Etapa1.Parte2;
import java.util.Scanner;
public class c04ex03 {
    public static void main(String[] args) {
        double multa1, polu1, polu2, multa2, multa3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ate qual valor sera aplicado a primeira multa? ");
        polu1 = teclado.nextDouble();
        System.out.print("Qual o valor cobrado para a primeira multa? ");
        multa1 = teclado.nextDouble();
        System.out.print("De " + polu1 + " ate qual valor sera aplicado a segunda multa? ");
        polu2 = teclado.nextDouble();
        System.out.print("De " + polu1 + " ate " + polu2 + " sera cobrado qual valor para multa? ");
        multa2 = teclado.nextDouble();
        System.out.print("Acima de " + polu2 + " qual o valor da multa por poluente emitido? ");
        multa3 = teclado.nextDouble();
        System.out.println("===============================================================");
        System.out.println("       Quantidade de Poluente Emitido x Valor da Multa.");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Ate " + polu1 + " multa de R$ " + multa1 + ".");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Entre " + polu1 + " e " + polu2 + " multa de R$ " + multa2 + ".");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Acima de " + polu2 + " multa de R$ " + multa3 + " por poluente emitido.");
        System.out.println("===============================================================");

    }
}