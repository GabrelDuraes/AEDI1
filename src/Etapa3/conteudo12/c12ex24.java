package Etapa3.conteudo12;

import java.util.Scanner;

public class c12ex24 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double[] num = new double[10], num2 = new double[10];
        for (int aux = 0; aux < num.length; aux++) {
            System.out.println("Informe um numero: ");
            num[aux] = tec.nextDouble();
        }
        for (int aux = 0; aux < num.length; aux++) {
            if (num[aux] % 3 == 0) {
                num2[aux] = num[aux];
            }
        }
        for (int aux = 0; aux < num.length; aux++) {
            if (num2[aux] != 0)
                System.out.println("Segundo vetor com numeros divisiveis por 3: " + num2[aux]);
        }
        tec.close();
    }
}
