package Etapa2.cont10_Infect;

import java.util.Scanner;

public class c10ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precoF, valBDI, taxaBDI, precoUni, custoPa, custoTo = 0;
        int material;
        String nome;
        System.out.println("Informe o valor da taxa BDI(em %): ");
        taxaBDI = teclado.nextDouble();
        do {
            teclado.nextLine();
            System.out.print("Informe o nome do material utilizado: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("Fim"))
                break;
            System.out.print("Informe a quantidade do material: ");
            material = teclado.nextInt();
            System.out.print("Informe o preco unitario do material: R$");
            precoUni = teclado.nextDouble();
            custoPa = material * precoUni;
            System.out.println("Custo Parcial do material: R$" + custoPa);
            custoTo += custoPa;
        } while (!nome.equalsIgnoreCase("Fim"));
        valBDI = (custoTo * taxaBDI) / 100;
        precoF = custoTo + valBDI;
        System.out.println("Custo total: " + custoTo + "\n" +
                "Valor do BDI: " + valBDI + "\n" +
                "O valor do preco final e de: " + precoF);
        teclado.close();
    }
}
