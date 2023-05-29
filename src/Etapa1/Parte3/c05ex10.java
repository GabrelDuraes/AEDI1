package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex10 {
    public static void main(String[] args) {
        int numInt, dig1, dig2 ,dig3,dig4,dig5;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro de 5 digitos:");
        numInt=teclado.nextInt();
        dig1=numInt/10000;
        dig2=numInt/1000%10;
        dig3=numInt/100%10;
        dig4=numInt/10%10;
        dig5=numInt%10;
        System.out.println("Impressão=\n"+dig1+"\n"+dig2+"\n"+dig3+"\n"+dig4+"\n"+dig5);
        teclado.close();
    }
}
