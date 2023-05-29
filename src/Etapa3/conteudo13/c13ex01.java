package Etapa3.conteudo13;

<<<<<<< HEAD
public class c13ex01 {
    static double x1,x2,y1,y2;
    public static void main(String[] args) {

=======
import java.util.Scanner;

public class c13ex01 {
    static double x1,x2,y1,y2;
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        System.out.println("informe o valor de x1: ");
        x1=tec.nextDouble();
        System.out.println("Informe o valor de y1: ");
        y1=tec.nextDouble();
        System.out.println("Informe o valor de x2: ");
        x2=tec.nextDouble();
        System.out.println("Informe o valor de y2: ");
        y2=tec.nextDouble();
        System.out.println("Valor da distancia: "+distancia(x1,x2,y1,y2));
        tec.close();
    }
    static double distancia(double x1,double x2,double y1,double y2){
        double distancia;
        distancia=Math.sqrt((Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
        return distancia;
>>>>>>> 20ec462 (Exercicios)
    }
}
