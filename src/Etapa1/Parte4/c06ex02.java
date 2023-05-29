package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex02 {
    public static void main(String[] args) {
        double quantPolu,multa;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe a quantidade de poluentes emitido:");
        quantPolu=teclado.nextDouble();
        if(quantPolu<=1500){
            System.out.println("Valor da multa: Isento");
        }
        else{
            if (quantPolu>1500&&quantPolu<=3500){
                System.out.println("Valor da multa: R$3.000,00");
            }
            else{
                multa=5000*quantPolu;
                System.out.printf("Valor da multa:%8.2f",multa);
            }
        }
        teclado.close();
    }
}
