package Etapa3.conteudo12_Listas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class c12ex27 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        List<String> endereco = new ArrayList<String>();
        List<Integer> cpf = new ArrayList<Integer>();
        String enderecoS, resposta, alterar;
        int cpfS, pediCpf, pos = -1;
        System.out.println("Informe 0 em CPF para encerrar a coleta de dados!");
        do {
            System.out.println("Informe o CPF(somente numeros): ");
            cpfS = tec.nextInt();
            if (cpfS != 0) {
                cpf.add(cpfS);
                tec.nextLine();
                System.out.println("Informe o endereco do dono do CPF:");
                enderecoS = tec.nextLine();
                endereco.add(enderecoS);
            }
        } while (cpfS != 0);
        System.out.println("Informe o CPF que deseja pesquisar(somente numeros):");
        pediCpf = tec.nextInt();
        for (int aux = 0; aux < cpf.size(); aux++) {
            if (cpf.get(aux) == pediCpf) {
                pos = aux;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("CPF digitado nao encontrado na lista!");
            System.out.println("Deseja adicionar esse CPF com um endereco � lista?(S/N)");
            resposta = tec.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Informe o endereco do CPF informado: ");
                enderecoS = tec.nextLine();
                endereco.add(enderecoS);
                cpf.add(pediCpf);
                System.out.println("CPF e endereco adicionado � lista!");
            }
        } else {
            System.out.println("Deseja alterar o endereco ou exluir o endereco/CPF?/nDigite A para alterar ou E para excluir:");
            resposta = tec.nextLine();
            if (resposta.equalsIgnoreCase("A") || resposta.equalsIgnoreCase("a")) {
                System.out.println("Informe o novo endereco do CPF digitado: ");
                alterar = tec.nextLine();
                endereco.set(pos, alterar);
            }
            if (resposta.equalsIgnoreCase("E") || resposta.equalsIgnoreCase("e")) {
                cpf.remove(pos);
                endereco.remove(pos);
                System.out.println("Dados do CPF informado foram apagados!");
            }
        }
        for (int aux = 0; aux < cpf.size(); aux++)
            System.out.print("CPF: " + cpf.get(aux) + "-Endereco: " + endereco.get(aux) + "./n");

        tec.nextLine();
    }
}