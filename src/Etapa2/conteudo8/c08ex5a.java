package Etapa2.conteudo8;

import java.util.Scanner;

public class c08ex5a {
    public static void main(String[] args) {
        int cont1, cont2, cont3, candidato, nulos;
        String candV;
        Scanner teclado = new Scanner(System.in);
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        nulos = 0;
        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Informe o seu candidato: 1-Fulano,2-Ciclano,3-Beltrano");
            candidato = teclado.nextInt();
            switch (candidato) {
                case 1 -> cont1++;
                case 2 -> cont2++;
                case 3 -> cont3++;
                default -> nulos++;
            }
        }
        if (((cont1 + cont2 + cont3) - nulos) < 0) {
            System.out.println("Eleicao invalida: votos nulos maior que o numero de pessoas que votaram.");
            return;
        }
        //Segundo turno:
        if (cont1 == cont2) {
            cont1 = 0;
            cont2 = 0;
            cont3 = 0;
            for (int cont = 1; cont <= 5; cont++) {
                System.out.println("Segundo turno");
                System.out.println("Informe o seu candidato: 1-Fulano,2-Ciclano");
                candidato = teclado.nextInt();
                if (candidato == 1)
                    cont1++;
                else
                    cont2++;
            }
            if (cont1 > cont2)
                candV = "Fulano";
            else
                candV = "Ciclano";
            System.out.println("Fulano: " + cont1 + "\n" + "Ciclano: " + cont2 + "\n" + "Beltrano: " + cont3 + "\nCandidato vencedor e: " + candV);
        } else if (cont1 == cont3) {
            cont1 = 0;
            cont2 = 0;
            cont3 = 0;
            for (int cont = 1; cont <= 5; cont++) {
                System.out.println("Segundo turno");
                System.out.println("Informe o seu candidato: 1-Fulano,3-Beltrano");
                candidato = teclado.nextInt();
                if (candidato == 1)
                    cont1++;
                else
                    cont3++;
            }
            if (cont1 > cont3)
                candV = "Fulano";
            else
                candV = "Beltrano";
            System.out.println("Fulano: " + cont1 + "\n" + "Ciclano: " + cont2 + "\n" + "Beltrano: " + cont3 + "\nCandidato vencedor e: " + candV);
        } else if (cont2 == cont3) {
            cont1 = 0;
            cont2 = 0;
            cont3 = 0;
            for (int cont = 1; cont <= 5; cont++) {
                System.out.println("Segundo turno");
                System.out.println("Informe o seu candidato: 2-Ciclano,3-Beltrano");
                candidato = teclado.nextInt();
                if (candidato == 2)
                    cont2++;
                else
                    cont3++;
            }
            if (cont2 > cont3)
                candV = "Ciclano";
            else
                candV = "Beltrano";
            System.out.println("Fulano: " + cont1 + "\n" + "Ciclano: " + cont2 + "\n" + "Beltrano: " + cont3 + "\nCandidato vencedor e: " + candV);
        }
        //Resultado da Eleicao 1 eleicao:
        if (cont1 > cont2 && cont1 > cont3)
            candV = "Fulano";
        else if (cont2 > cont1 && cont2 > cont3)
            candV = "Ciclano";
        else
            candV = "Beltrano";
        //saida das eleicoes:
        System.out.println("Fulano: " + cont1 + "\n" + "Ciclano: " + cont2 + "\n" + "Beltrano: " + cont3 + "\nCandidato vencedor e: " + candV);
        teclado.close();
    }
}