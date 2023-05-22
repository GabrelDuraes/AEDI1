package Parte1;
import java.util.Scanner;
public class C03E02 {
    //Função: Calcula a média de 3 números inteiros
    //Autor: Gabriel da Silva Durães
    public static void main(String[] args) {
        double n1, n2, n3, soma, média;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe um número:");
        n1= teclado.nextLong();
        System.out.print("Informe outro número:");
        n2= teclado.nextLong();
        System.out.print("Informe mais um número:");
        n3= teclado.nextLong();
        soma=n1+n2+n3;
        média=soma/3.0;
        System.out.println("Média="+ média);
        teclado.close();
    }
}