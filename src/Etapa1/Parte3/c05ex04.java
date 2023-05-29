package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex04 {
    public static void main(String[] args) {
        double codX1,codX2,codY1,codY2,distancia;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe um valor para a coordenada X1:");
        codX1=teclado.nextDouble();
        System.out.print("Informe um valor para a coordenada Y1:");
        codY1=teclado.nextDouble();
        System.out.print("Informe um valor para a coordenada X2:");
        codX2=teclado.nextDouble();
        System.out.print("Informe um valor para a coordenada Y2:");
        codY2=teclado.nextDouble();
        distancia=Math.sqrt(Math.pow((codX1-codX2),2)+Math.pow((codY1-codY2),2));
        System.out.println("Distancia:"+distancia);
        teclado.close();
    }
}
