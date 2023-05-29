package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex22 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero,numPrimo,rep,contDiv=0;
        System.out.println("Informe um numero inteiro: ");
        numero=teclado.nextInt();
        rep=numero-1;
        for (int aux=1;aux<=rep;aux++){
            numPrimo=numero%aux;
            if (numPrimo==0)
                contDiv++;
        }
        if (contDiv>0)
            System.out.println("Esse numero nao é primo.");
        else
            System.out.println("Esse numero é primo");
    }
}
