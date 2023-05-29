package Etapa2.conteudo11;

import java.util.Scanner;

public class c11ex13 {
    public static void main(String[] args) {
        double num,den,serie=0;
        int cont=0,rep,cont10=10;
        Scanner tec=new Scanner(System.in);
        System.out.println("Informe o numero de termos que a serie vai ter: ");
        rep=tec.nextInt();
        do {
            cont++;
            num=cont*Math.pow(cont10,2*cont);
            den=Math.pow(7,cont-1);
            serie+=num/den;
            cont10=cont10+9;
        }while (cont<= rep);
        serie=71+Math.cbrt(serie);
        System.out.println("Valor da serie: "+serie);
        tec.close();
    }
}
