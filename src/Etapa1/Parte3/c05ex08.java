package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex08 {
    public static void main(String[] args) {
        double raio, areaS, valorA;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Informe a �rea do setor circular:");
        areaS=teclado.nextDouble();
        System.out.print("Informe o valor de A:");
        valorA= teclado.nextDouble();
        raio=Math.sqrt((360*areaS)/(valorA*3.1416));
        System.out.println("O valor do raio �:"+raio);
        teclado.close();
    }
}
