package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex08 {
    public static void main(String[] args) {
        double altura,pesoMin,pesoMax;
        String nome;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Qual o seu nome?");
        nome=teclado.nextLine();
        System.out.print("Qual a sua altura?");
        altura=teclado.nextDouble();
        pesoMin=20*(Math.pow(altura,2));
        pesoMax=25*(Math.pow(altura,2));
        System.out.println("Nome: "+nome+"\n" +
                "Seu peso tem que estar entre "+pesoMin+" e "+pesoMax+" para que esteja no peso ideal.");
        teclado.close();
    }
}
