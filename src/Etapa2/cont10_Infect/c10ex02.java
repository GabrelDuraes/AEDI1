package Etapa2.cont10_Infect;

import java.util.Scanner;

public class c10ex02 {
    public static void main(String[] args) {
        double servicos, media, soma = 0;
        int contServ = 0, contMa = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Informe o valor recebido pelos servicos prestados: \n" +
                    "R$");
            servicos = teclado.nextDouble();
            if (servicos != 0) {
                soma += servicos;
                contServ++;
                if (servicos > 1000)
                    contMa++;
            }
        } while (servicos != 0);
        media = soma / contServ;
        System.out.print("Media dos valores recebidos: \n" +
                "R$" + media + "\n" +
                "Valor total recebido: \n" +
                "R$" + soma + "\n" +
                "Valores recebidos acima de R$1000,00: " + contMa);
        teclado.close();
    }
}
