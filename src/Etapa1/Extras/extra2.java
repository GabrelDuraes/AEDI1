package Etapa1.Extras;
import java.util.Scanner;
public class extra2 {
    public static void main(String[] args) {
        double tempRel,vel,temp,velLuz=3*(Math.pow(10,8));
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe o tempo em segundos:");
        temp= teclado.nextDouble();
        System.out.println("Informe a velocidade:");
        vel= teclado.nextDouble();
        tempRel=temp*(1/(Math.sqrt((1-(Math.pow(vel,2)/Math.pow(velLuz,2))))));
        System.out.printf("Tempo relativo:%12.4f",tempRel);
        teclado.close();
    }
}
