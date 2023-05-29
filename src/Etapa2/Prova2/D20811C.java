//Gabriel da Silva Durães
package Etapa2.Prova2;

import java.util.Scanner;

public class D20811C {
    public static void main(String[] args) {
        String data, dataMe = "";
        double valor, soma = 0, mediaTo, valorDesa = 0, mediaDesa, valorMe = 0;
        int contAg = 0, contDe = 0, contPe = 0, contDia = 0;
        Scanner tec = new Scanner(System.in);
        do {
            System.out.println("Informe a data: ");
            data = tec.nextLine();
            if (data.equalsIgnoreCase("fim")) {
                System.out.println("Programa encerrado.");
                break;
            }
            contDia++;
            System.out.println("Informe o valor da poluiçao nesse dia: ");
            valor = tec.nextInt();
            do {
                if (valor < 0 || valor > 100) {
                    System.out.println("Valor nao esta dentro dos parametros! Digite novamente:");
                    valor = tec.nextInt();
                }
            } while (valor < 0 || valor > 100);
            soma += valor;
            if (valor <= 35) {
                System.out.println("Dia: " + data + "\nClassificação: Agradavel.");
                contAg++;
            } else if (valor <= 60) {
                System.out.println("Dia: " + data + "\nClassificação: Desagradavel.");
                contDe++;
                valorDesa += valor;
            } else {
                System.out.println("Dia: " + data + "\nClassificação: Perigoso.");
                contPe++;
            }
            if (contDia == 1 || valor <= valorMe) {
                valorMe = valor;
                dataMe = data;
            }
            tec.nextLine();
        } while (!data.equalsIgnoreCase("Fim"));
        if (contAg > contDe && contAg > contPe)
            System.out.println("Classificacao mais registrada: Agradavel.");
        else if (contDe > contPe)
            System.out.println("Classificacao mais registrada: Desagradavel.");
        else
            System.out.println("Classificacao mais registrada: Perigoso.");
        mediaTo = soma / contDia;
        mediaDesa = valorDesa / contDe;
        System.out.println("Media final dos indices de poluicao: " + mediaTo + "\n" +
                "Media dos indices de poluicao com classificacao DESAGRADAVEL: " + mediaDesa + "\n" +
                "Ultima data em que foi registrado o menor indice de poluicao: " + dataMe);
        tec.close();
    }
}
