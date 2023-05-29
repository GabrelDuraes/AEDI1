package Etapa1.Parte5;
import java.util.Scanner;
public class c07ex04 {
    public static void main(String[] args) {
        String equipes;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe um nome de uma equipe: ");
        equipes=teclado.nextLine();
        switch (equipes){
            case "America": case "Atletico": case"Cruzeiro": case"Vila Nova":
                System.out.println("Estado: Minas Gerais.");
                break;
            case "Botafogo": case "Flamengo": case"Fluminense": case" Vasco":
                System.out.println("Estado: Rio de Janeiro.");
                break;
            case "Corinthias": case "Palmeiras": case"Santos": case"Sao Paulo":
                System.out.println("Estado: Sao Paulo.");
                break;
            case "Gremio": case "Internacional": case"Juventude":
                System.out.println("Estado: Rio Grande do Sul.");
                break;
            default:
                System.out.println("Estado: Pernambuco.");
                break;
        }
        teclado.close();
    }
}
