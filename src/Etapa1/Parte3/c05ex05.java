package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex05 {
    public static void main(String[] args) {
        double celsius, fahre, kelvin;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe o valor da temperatura em Celsius:");
        celsius=teclado.nextDouble();
        kelvin=celsius+273.0;
        fahre=(9.0*celsius+160.0)/5.0;
        System.out.println("Temperatura em Kelvin:"+kelvin);
        System.out.println("Temperatura em Fahrenheit:"+fahre);
        teclado.close();
    }
}
