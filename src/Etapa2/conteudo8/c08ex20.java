package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex20 {
    public static void main(String[] args) {
        double valor,numero,soma=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe a quantidade de termos: ");
        numero=teclado.nextInt();
        for (int aux=0;aux<=numero-1;aux++){
            valor=Math.pow(2,aux);
            soma+=valor;
            System.out.println(valor);
        }
        System.out.println("Soma: "+soma);
    }
}
