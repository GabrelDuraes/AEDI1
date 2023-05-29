package Etapa2.conteudo8;

import java.util.Scanner;

public class c08ex21 {
    public static void main(String[] args) {
        double altura, pesoMin, imc, pesoMax;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        altura = teclado.nextDouble();
        pesoMin = 20 * (Math.pow(altura, 2));
        pesoMax = 25 * (Math.pow(altura, 2));
        for (int aux1 = 60; aux1 <= pesoMin; aux1++) {
            imc = aux1 / (Math.pow(altura, 2));
            System.out.println("Peso: " + aux1 + "\nImc: " + imc + "\nSitua��o coporea: Abaixo do peso.");
        }
        for (double aux2 = pesoMin; aux2 <= pesoMax; aux2++) {
            imc = aux2 / (Math.pow(altura, 2));
            System.out.println("Peso: " + aux2 + "\nImc: " + imc + "\nSitua��o coporea: Peso Ideal.");
        }
        for (double aux3 = pesoMax; aux3 <= 100; aux3++) {
            imc = aux3 / (Math.pow(altura, 2));
            System.out.println("Peso: " + aux3 + "\nImc: " + imc + "\nSitua��o coporea: Acima do peso.");
        }
        teclado.close();
    }
}
