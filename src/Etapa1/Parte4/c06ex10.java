package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex10 {
    public static void main(String[] args) {
        double capApli,numDiasApl,taxDia,rend,imposRenda,valResga,taxAdm=10;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Qual foi o capital aplicado? ");
        capApli=teclado.nextDouble();
        System.out.print("Quantos dias ficou aplicado o valor? ");
        numDiasApl=teclado.nextDouble();
        System.out.print("Qual a taxa di�ria em %? ");
        taxDia=teclado.nextDouble();
        rend=capApli*(taxDia/100)*numDiasApl;
        imposRenda=rend*15/100;
        valResga=capApli+rend-imposRenda-taxAdm;
        System.out.print("Rendimento: "+rend+"\n" +
                "Imposto de renda: "+imposRenda+"\n" +
                "Valor resgatado: "+valResga);
        teclado.close();
    }
}