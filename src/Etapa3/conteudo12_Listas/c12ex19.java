package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex19 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int[] bilhete=new int[100];
        int bilhetePre;
        int posicao1,posicao,varAu=-1;
        for(int aux=0;aux<bilhete.length;aux++) {
            posicao = aux + 1;
            System.out.println("Informe o numero do "+posicao+"� bilhete: ");
            bilhete[aux] = tec.nextInt();
        }
        System.out.println("Informe o numero do bilhete premiado: ");
        bilhetePre=tec.nextInt();
        for (int aux=0;aux< bilhete.length;aux++){
            if (bilhetePre==bilhete[aux]){
                varAu=aux;
            }
        }
        if (varAu==-1)
            System.out.println("Bilhete premiado nao encontrado.");
        else {
            posicao1 = varAu + 1;
            System.out.println("Bilhete premiado encontrado!E o " + posicao1 + "� bilhete");
        }
        tec.close();
    }
}
