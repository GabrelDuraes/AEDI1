package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex12 {
    public static void main(String[] args) {
        int cod,precoUni1=1565,precoUni2=1890,precoUni3=2150,precoUni4=2963,precoUni5=3750,cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        double faturamento;
        Scanner teclado=new Scanner(System.in);
        for(int aux=1;aux<=5;aux++){
            System.out.println("Informe o codigo do seu produto: ");
            cod=teclado.nextInt();
            if (cod==1)
                cont1++;
            else if (cod==2)
                cont2++;
            else if (cod==3)
                cont3++;
            else if (cod==4)
                cont4++;
            else if (cod==5)
                cont5++;
        }
        faturamento=cont1*precoUni1+cont2*precoUni2+cont3+precoUni3+cont4*precoUni4+cont5*precoUni5;
        System.out.println("O faturamento total foi de: R$"+faturamento);
    }
}