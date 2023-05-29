package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex29 {
    public static void main(String[] args) {
        int valX,valY,conta=1;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe um valor inteiro e positivo para X: ");
        valX=teclado.nextInt();
        System.out.println("Informe um valor inteiro e positivo para Y: ");
        valY=teclado.nextInt();
        for (int aux=0;aux<valY;aux++){
            conta*=valX;
        }
        System.out.println("Funcao exponencial: "+conta);
    }
}