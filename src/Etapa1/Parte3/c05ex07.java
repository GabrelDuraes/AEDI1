package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex07 {
    public static void main(String[] args) {
        double numX, fx;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Informe um valor para x:");
        numX= teclado.nextDouble();
        fx=Math.sqrt(Math.pow((numX/4+1),2)+(0.2)*numX);
        System.out.println("Valor de F(x):"+fx);;
        teclado.close();
    }
}
