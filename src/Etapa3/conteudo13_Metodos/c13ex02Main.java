package Etapa3.conteudo13_Metodos;

import java.util.Scanner;

public class c13ex02Main {
    static double x;
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        do {
            System.out.println("Informe um valor para x: ");
            x = tec.nextDouble();
            if (x!=-1)
                System.out.println("Valor da funcao: " +c13ex02Metodo.funcaoX(x));
        }while (x!=-1);
        System.out.println("Fim do programa.");
        tec.close();
    }
}
