package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex02 {
    public static void main(String[] args) {
        double area,raio,volume;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe um valor para o raio:");
        raio=teclado.nextDouble();
        area = 4*3.1416*Math.pow(raio,2);
        volume = 4/3.0*3.1416*Math.pow(raio,3);
        System.out.println("Area="+area);
        System.out.println("Volume="+volume);
        teclado.close();
    }
}
