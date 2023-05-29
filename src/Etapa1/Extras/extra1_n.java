package Etapa1.Extras;
import java.util.Scanner;
public class extra1_n {
    public static void main(String[] args) {
        int n1,n2,n3,n4,num,numero;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe um valor de 4 digitos: ");
        numero=teclado.nextInt();
        n1=numero%10;
        n2=(numero/10)%10;
        n3=(numero/100)%10;
        n4=numero/1000;
        num=n1+n2+n3+n4;
        if (num==numero)
            System.out.println("O numero digitado e um palindromo");
        else
            System.out.println("O numero digitado nao e um palindromo.");
        teclado.close();
    }
}
