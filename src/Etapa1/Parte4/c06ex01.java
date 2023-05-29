package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex01 {
    public static void main(String[] args) {
        double valorX, fx;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe o valor de X:");
        valorX=teclado.nextDouble();
        if (valorX<4)
            fx=(5*valorX+3)/Math.sqrt(16-Math.pow(valorX,2));
        else{
            if (valorX==4) {
                valorX = 0;
                fx = valorX;
            }
            else
                fx=(5*valorX+3)/(Math.sqrt(Math.pow(valorX,2)-16));
        }
        System.out.println("O valor de f(x) e:"+fx);
        teclado.close();
    }
}
