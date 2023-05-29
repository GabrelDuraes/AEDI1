package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex04 {
    public static void main(String[] args) {
        String nome;
        int idade,cont;
        Scanner  teclado= new Scanner(System.in);
        cont=0;
        for (int aux=1;aux<=5;aux++){
            System.out.println("Informe o seu nome: ");
            nome=teclado.nextLine();
            System.out.println("Informe a idade de "+nome+" : ");
            idade=teclado.nextInt();
            if (idade<=18){
                cont++;
            }
            teclado.nextLine();
        }
        System.out.println("Ate 18: "+cont+"\n" +
                "Acima de 18: "+(5-cont));
        teclado.close();
    }
}
