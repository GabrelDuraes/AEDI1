package Etapa2.cont10_Infect;

import java.util.Scanner;

public class c10ex01 {
    public static void main(String[] args) {
        double multa = 0.1, valor, soma = 0, media;
        int contVal = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Informe o valor para que seja calculado a multa: R$");
            valor = teclado.nextDouble();
            if (valor != -1) {
                valor = valor * multa;
                soma += valor;
                contVal++;
                System.out.print("Valor da multa: " + valor);
            }
            System.out.println();
        } while (valor != -1);
        media = soma / contVal;
        System.out.println("Media dos valores informados: R$ " + media);
        teclado.close();
    }
}
