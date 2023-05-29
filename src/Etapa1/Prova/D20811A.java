//Nome: Gabriel da Silva Durães.
package Etapa1.Prova;
import java.util.Scanner;
public class D20811A {
    public static void main(String[] args) {
        double valx, f1x, f2x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um valor para x: ");
        valx = teclado.nextDouble();
        f1x = ((Math.pow(valx, 2) * 2) / 7.0) + Math.cbrt((Math.pow(valx, 5) * 4 + 10)) - 3;
        f2x = (5 * valx - 3) / Math.cbrt(Math.sqrt(valx - 1)) + 6 * valx - 1;
        System.out.println("F1(x): " + f1x + "\n" +
                "F2(x): " + f2x);
    }
}
