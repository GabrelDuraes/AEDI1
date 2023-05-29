package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex14 {
    public static void main(String[] args) {
        String simbolo="";
        int numero=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe a quantidade de repeticoes entre 1 e 20: ");
        numero=teclado.nextInt();
        teclado.nextLine();
        System.out.println("Informe um simbolo: ");
        simbolo=teclado.nextLine();
        for (int aux=1;aux<=numero;aux++){
            System.out.println();
            for (int aux1=1;aux1<=numero;aux1++){
                System.out.print(simbolo);
            }
        }
        teclado.close();
    }
}
