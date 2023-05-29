package Etapa1.Parte5;
import java.util.Scanner;
public class c07ex01 {
    public static void main(String[] args) {
        String nome;
        int jogos;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe o nome do apostador: ");
        nome=teclado.nextLine();
        System.out.println("Informe a quantidade de jogos acertados: ");
        jogos=teclado.nextInt();
        switch (jogos){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Premio: Nenhum.");
                break;
            case 6: case 7: case 8: case 9: case 10:
                System.out.println("Premio: Outro cart�o.");
                break;
            case 11:
                System.out.println("Premio: R$100,00");
                break;
            case 12:
                System.out.println("Premio: R$1000,00");
                break;
            case 13:
                System.out.println("Premio: R$50000,00");
                break;
        }
        teclado.close();
    }
}
