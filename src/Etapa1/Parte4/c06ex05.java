package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex05 {
    public static void main(String[] args) {
        int numInt, num1=5, num2=7, resultado;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        numInt= teclado.nextInt();
        resultado=numInt%num1;
        resultado=numInt%num2;
        if (resultado==0)
            System.out.print(numInt+" é divisivel simultaneamente por "+num1+" e "+num2);
        else
            System.out.print(numInt+" não é divisivel simultaneamente por "+num1+" e "+num2);
        teclado.close();

    }
}
