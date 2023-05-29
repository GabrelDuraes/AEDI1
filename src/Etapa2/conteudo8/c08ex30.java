package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex30 {
    public static void main(String[] args) {
        double serieS,conta,valX,valN,soma=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe um valor para X: ");
        valX=teclado.nextInt();
        System.out.println("Informe um valor para N: ");
        valN=teclado.nextInt();
        for (int aux=2;aux<=valN;aux++){
            conta=Math.pow(valX,aux)/aux;
            soma+=conta;
        }
        serieS=Math.log(valX)+valX+soma;
        System.out.println("Valor da serie: "+serieS);
        teclado.close();
    }
}
