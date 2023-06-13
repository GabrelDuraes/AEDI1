package Etapa3.conteudo13_Metodos;

import java.util.Scanner;

public class calculoIR {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        double salario,imposto;
        int dependentes;
        String result;
        System.out.println("Informe -1 em salario para encerrar o programa. ");
        do {
            System.out.print("Informe o valor so seu salario: ");
            salario=tec.nextDouble();
            if (salario==-1)
                break;
            System.out.print("Informe a quantidade de dependentes: ");
            dependentes=tec.nextInt();
            imposto= CalculoImpost.aliquota(salario,dependentes);
            System.out.println("Valor que tem que pagar de imposto �: R$ "+imposto);
        }while (salario!=-1);
        System.out.println("Programa encerrado.");
        tec.close();
    }
}
