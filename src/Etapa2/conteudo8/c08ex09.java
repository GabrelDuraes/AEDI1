package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex09 {
    public static void main(String[] args) {
        String nome,sex;
        int idade,rep;
        double mediaM,mediaF,somaF=0,somaM=0,contM=0,contF=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe a quantidade de pessoas: ");
        rep=teclado.nextInt();
        teclado.nextLine();
        for (int aux=1;aux<=rep;aux++){
            System.out.println("Informe o seu nome: ");
            nome= teclado.nextLine();
            System.out.println("Informe o sexo do(a) "+nome+" (F/M): ");
            sex= teclado.nextLine();
            System.out.println("Informe a sua idade: ");
            idade=teclado.nextInt();
            if (sex.equalsIgnoreCase("F")||sex.equalsIgnoreCase("feminino")) {
                somaF += idade;
                contF++;
            }
            else {
                somaM += idade;
                contM++;
            }
            teclado.nextLine();
        }
        mediaM=(float)somaM/contM;
        mediaF=(float)somaF/contF;
        System.out.println("Media das idades dos homens: "+mediaM+"\n" +
                "Media das idades das mulheres: "+mediaF);
        teclado.close();
    }
}
