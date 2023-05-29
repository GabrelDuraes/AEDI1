package Etapa1.Parte4;

import java.util.Scanner;

public class c06ex15_n {
    public static void main(String[] args) {
        String cidade;
        double extras, conta, soma, imposto, diaria;
        int fix1 = 65, fix2 = 104, fix3 = 137, cod, qtdDia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o codigo do seu pacote: ");
        cod = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Informe a sua cidade: ");
        cidade = teclado.nextLine();
        System.out.println("Informe a quantidade de dias que esta consumindo o pay-per-view: ");
        qtdDia = teclado.nextInt();
        System.out.println("Informe o valor dos servi�os extras: ");
        extras = teclado.nextDouble();
        if (cod == 1) {
            if (cidade.equalsIgnoreCase("belo horizonte")) {
                diaria = 1.20 * qtdDia;
                if (diaria > 65)
                    diaria = 65;
                soma = fix1 + diaria + extras;
                imposto = 0;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            } else if (cidade.equalsIgnoreCase("sao paulo")) {
                soma = fix1 + (1.20 * qtdDia) + extras;
                imposto = soma * 1 / 100;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            } else if (cidade.equalsIgnoreCase("rio de janeiro")) {
                soma = fix1 + (1.20 * qtdDia) + extras;
                imposto = soma * 1.5 / 100;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            } else {
                soma = fix1 + (1.20 * qtdDia) + extras;
                imposto = soma * 2 / 100;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            }
        }
        if (cod == 2) {
            if (cidade.equalsIgnoreCase("belo horizonte")) {
                soma = fix2 + (2.10 * qtdDia) + extras;
                imposto = soma * 0;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            } else if (cidade.equalsIgnoreCase("sao paulo")) {
                soma = fix2 + (2.10 * qtdDia) + extras;
                imposto = soma * 1 / 100;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            } else if (cidade.equalsIgnoreCase("rio de janeiro")) {
                soma = fix2 + (2.10 * qtdDia) + extras;
                imposto = (soma * 1.5) / 100.0;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            } else {
                soma = fix2 + (2.10 * qtdDia) + extras;
                imposto = soma * 2 / 100;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            }
        }
        if (cod == 3) {
            if (cidade.equalsIgnoreCase("belo horizonte")) {
                soma = fix3 + extras;
                imposto = soma * 0;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            } else if (cidade.equalsIgnoreCase("sao paulo")) {
                soma = fix3 + extras;
                imposto = soma * 1 / 100;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            } else if (cidade.equalsIgnoreCase("rio de janeiro")) {
                soma = fix3 + extras;
                imposto = (soma * 1.5) % 100;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            } else {
                soma = fix3 + extras;
                imposto = soma * 2 / 100;
                conta = soma + imposto;
                System.out.println("Conta: " + conta);
            }
        }
        teclado.close();
    }
}
