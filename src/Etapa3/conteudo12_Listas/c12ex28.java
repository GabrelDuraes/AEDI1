package Etapa3.conteudo12_Listas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class c12ex28 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        List<String> RA = new ArrayList<>();
        List<String> nome = new ArrayList<>();
        String nomeS, RAS, temp, temp1, pediNome;
        int pos = -1, posicao = 0, rep;
        System.out.println("Informe o numero de alunos que inserido: ");
        rep = tec.nextInt();
        for (int aux = 0; aux < rep; aux++) {
            System.out.println("Informe o nome do aluno: ");
            nomeS = tec.nextLine();
            if (!(nomeS.equalsIgnoreCase("FIM") || nomeS.equalsIgnoreCase("fim"))) {
                nome.add(nomeS);
                System.out.println("Informe o RA do aluno " + nomeS + ":");
                RAS = tec.nextLine();
                RA.add(RAS);
            }
            tec.nextLine();
        }
        for (int aux = 0; aux < nome.size() - 1; aux++) {
            for (int x = 0; x < nome.size(); x++) {
                if (nome.get(x).compareToIgnoreCase(nome.get(x + 1)) > 0) {
                    temp = nome.get(x);
                    temp1 = RA.get(x);
                    nome.set(x, nome.get(x + 1));
                    nome.set(x + 1, temp);
                    RA.set(x, RA.get(x + 1));
                    RA.set(x + 1, temp1);
                }
            }
        }
        System.out.println("Informe o nome do aluno que deseja procurar:");
        pediNome = tec.nextLine();
        for (int aux = 0; aux < nome.size(); aux++) {
            if (nome.get(aux).equalsIgnoreCase(pediNome)) {
                pos = aux;
                posicao = aux + 1;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Nome nao encontrado!");
        } else {

            System.out.println("Nome encontrado! Aluno de RA: " + RA.get(pos) + " esta na posicao: " + posicao);
        }

        tec.nextLine();
    }
}