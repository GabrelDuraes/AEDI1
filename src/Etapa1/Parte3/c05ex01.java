package Etapa1.Parte3;
import java.util.Scanner;

public class c05ex01 {
    public static void main(String[] args) {
        double fx,x;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe o valor de x:");
        x=teclado.nextDouble();
        fx=Math.pow(x,3)+4*x+10;
        System.out.println("F(x)="+fx);
        teclado.close();
    }
}
