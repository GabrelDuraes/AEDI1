package Etapa2.conteudo8;

import java.util.Scanner;

public class c08ex31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, cod, nomeMenor="", cargo = " ";
        int cont = 0, contSal = 0, contOutros = 0, rep;
        double salBru, salMin = 0, soma = 0, salMenor = 0, media;
        System.out.println("Informe a quantidade de engenheiros que sera pesquisados: ");
        rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++) {
            System.out.println("Informe o seu nome: ");
            nome = teclado.nextLine();
            teclado.nextLine();
            System.out.println("Informe o seu cargo: ");
            cod = teclado.nextLine();
            System.out.println("Informe o seu salario bruto: ");
            salBru = teclado.nextDouble();
            if (cod.equalsIgnoreCase("C"))
                salMin = 2500;
            else if (cod.equalsIgnoreCase("p"))
                salMin = 4650;
            else if (cod.equalsIgnoreCase("o"))
                salMin = 3200;
            else if (cod.equalsIgnoreCase("a"))
                salMin = 5100;
            else if (cod.equalsIgnoreCase("x"))
                salMin = 1;
            if (salBru < salMin)
                System.out.println("ABAIXO DO SALARIO MINIMO");
            if (salBru >= salMin && !(cod.equalsIgnoreCase("X")))
                cont++;
            if (cod.equalsIgnoreCase("A")) {
                soma += salBru;
                contSal++;
            }
            if (cod.equalsIgnoreCase("X") && salBru > 5000)
                contOutros++;
            if (aux == 1 || salBru < salMenor) {
                salMenor = salBru;
                nomeMenor = nome;
                if (cod.equalsIgnoreCase("C"))
                    cargo = "Engenheiro Calculista.";
                else if (cod.equalsIgnoreCase("p"))
                    cargo = "Engenheiro Projetista.";
                else if (cod.equalsIgnoreCase("o"))
                    cargo = "Engenheiro de Obra.";
                else if (cod.equalsIgnoreCase("a"))
                    cargo = "Engenheiro Administrador.";
                else if (cod.equalsIgnoreCase("x"))
                    cargo = "Outros.";
            }
        }
        media = soma / contSal;
        System.out.println("Salarios acima do minimo: " + cont + "\n" +
                "Media dos salarios dos engenheiros administradores: R$" + media + "\n" +
                "Engenheiros de cargo 'Outros' e que recebeme acima de R$5.000,00: " + contOutros + "\n" +
                "Engenheiro que recebe menos: " + nomeMenor + ", Cargo: " + cargo + ", Salario Bruto: " + salMenor);
    }
}