package Etapa3.conteudo12;

import java.util.Scanner;

public class c12ex17 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double[] vetorCer = new double[10], vetoInv = new double[10];
        double temp;
        for (int aux = 0; aux < vetorCer.length; aux++) {
            System.out.println("Informe um numero: ");
            vetorCer[aux] = tec.nextDouble();
        }
        for (int aux = 0; aux < vetorCer.length; aux++) {
            for (int x = 0; x < vetorCer.length; x++) {
                vetoInv[x] = vetorCer[9 - x];
            }
        }
        for (int aux = 0; aux < vetoInv.length; aux++) {
            System.out.println(vetoInv[aux]);
        }
        tec.close();
    }
}
