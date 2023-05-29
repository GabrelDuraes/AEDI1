package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex09 {
    public static void main(String[] args) {
        String sex;
        double altura,pesoIdeal;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Qual o seu sexo, F ou M?");
        sex=teclado.nextLine();
        System.out.print("Qual a sua altura? ");
        altura=teclado.nextDouble();
        if (sex.equalsIgnoreCase("f")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal � %.3f",pesoIdeal);
        }
        else{
            if(sex.equalsIgnoreCase("m")) {
                pesoIdeal = (72.7 * altura) - 58;
                System.out.printf("Seu peso ideal � %.3f",pesoIdeal);
            }
        }
        teclado.close();
    }
}
