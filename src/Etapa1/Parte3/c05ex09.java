package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex09 {
    public static void main(String[] args) {
        double nota1,nota2,nota3,mediaF;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe a sua primeira nota:");
        nota1=teclado.nextDouble();
        System.out.print("Informe a sua segunda nota:");
        nota2=teclado.nextDouble();
        System.out.print("Informe a sua terceira nota:");
        nota3=teclado.nextDouble();
        mediaF=((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
        System.out.println("Sua m�dia final � de: "+mediaF);
        teclado.close();
    }
}
