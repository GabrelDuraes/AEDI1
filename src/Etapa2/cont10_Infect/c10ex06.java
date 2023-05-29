package Etapa2.cont10_Infect;

import java.util.Scanner;

public class c10ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valA, valB, valC, valX, valY, dist;
        System.out.println("informe um valor para A: ");
        valA = teclado.nextDouble();
        System.out.println("Informe um valor para B: ");
        valB = teclado.nextDouble();
        System.out.println("Informe um valor para C: ");
        valC = teclado.nextDouble();
        do {
            System.out.println("Informe um valor para o ponto X: ");
            valX = teclado.nextDouble();
            System.out.println("Informe um valor para o ponto Y: ");
            valY = teclado.nextDouble();
            dist = ((valA * valX) + (valB * valY) + valC) / Math.sqrt(Math.pow(valA, 2) + Math.pow(valB, 2));
            if (dist == 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            System.out.println("Distancia: " + dist);
        } while (dist!=0);
    }
}
