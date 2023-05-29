package Etapa1.Parte2;
import java.util.Scanner;
public class c04ex01 {
    public static void main(String[] args) {
        String primNome;
        String segNome;
        String terNome;
        int idade;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Qual o seu primeiro nome? ");
        primNome=teclado.nextLine();
        System.out.print("Qual o seu segundo nome? ");
        segNome= teclado.nextLine();
        System.out.print("Qual o seu terceiro nome? ");
        terNome= teclado.nextLine();
        System.out.print("Qual a sua idade? ");
        idade=teclado.nextInt();
        System.out.println(terNome+", "+primNome+" "+segNome);
        System.out.println("Idade: "+idade+" anos.");
        teclado.close();
    }
}
