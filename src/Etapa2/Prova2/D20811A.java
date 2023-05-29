//Gabriel da Silva Durães
package Etapa2.Prova2;

import java.util.Scanner;

public class D20811A {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int rep, contw = 0;
        double valy, valwMa = 0, media,valw;
        System.out.println("Quantos calculos irao ser feitos:");
        rep = tec.nextInt();
        for (int aux = 1; aux <= rep; aux++) {
            valy = 4 * Math.pow(aux, 3) - (13 * aux) + 2;
            valw = 10*valy-Math.pow(6*aux-1,1.0/7);
            if (valw > 1000) {
                valwMa += valw;
                contw++;
            }
            System.out.println("Valor de x: " + aux + "\n" +
                    "Valor de y: " + valy + "\n" +
                    "Valor de w: " + valw);
        }
        media = valwMa / contw;
        System.out.println("Media dos valores de w maiores que 1000: " + media);
        tec.close();
    }
}
