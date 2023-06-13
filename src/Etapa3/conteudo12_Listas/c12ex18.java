package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex18 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        String[] nome=new String[10];
        String nomePes;
        int posicao1,posicao,varAu=-1;
        for(int aux=0;aux<nome.length;aux++) {
            posicao = aux + 1;
            System.out.println("Informe o nome da pessoas que esta no " + posicao + "� lugar da fila: ");
            nome[aux] = tec.nextLine();
        }
        System.out.println("Informe o nome que deseja procurar na fila: ");
        nomePes=tec.nextLine();
        for (int aux=0;aux< nome.length;aux++){
            if (nomePes.equalsIgnoreCase(nome[aux])){
                varAu=aux;
            }
        }
        if (varAu==-1)
            System.out.println("Nome nao encontrado na fila.");
        else {
            posicao1 = varAu + 1;
            System.out.println("Nome encontrado!Esta no " + posicao1 + "� lugar");
        }
        tec.close();
    }
}
