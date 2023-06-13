package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex09 {
    public static void main(String[] args) {
        int num[]=new int[10],soma=0;
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux< num.length;aux++){
            System.out.println("Informe um valor inteiro: ");
            num[aux]=tec.nextInt();
        }
        for (int aux=0;aux< num.length;aux++){
            soma+=num[aux];
        }
        for (int aux=0;aux< num.length;aux++){
            if (soma%num[aux]==0)
                System.out.println("Numero divisivel pela soma dos valores informados: "+num[aux]);
        }
        tec.close();
    }
}
