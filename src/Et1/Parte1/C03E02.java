package Parte1;
import java.util.Scanner;
public class C03E02 {
    //Fun��o: Calcula a m�dia de 3 n�meros inteiros
    //Autor: Gabriel da Silva Dur�es
    public static void main(String[] args) {
        double n1, n2, n3, soma, m�dia;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe um n�mero:");
        n1= teclado.nextLong();
        System.out.print("Informe outro n�mero:");
        n2= teclado.nextLong();
        System.out.print("Informe mais um n�mero:");
        n3= teclado.nextLong();
        soma=n1+n2+n3;
        m�dia=soma/3.0;
        System.out.println("M�dia="+ m�dia);
        teclado.close();
    }
}