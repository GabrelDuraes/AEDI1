package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex14 {
    public static void main(String[] args) {
        int numero,n1,n2,n3,n4;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe um numero de 4 digitos: ");
        numero=teclado.nextInt();
        n1=numero%10;
        n2=(numero/10)%10;
        n3=(numero/100)%10;
        n4=numero/1000;
        if (n4>=1&&n4<=9)
            System.out.println("Numero:"+n1+n2+n3+n4);
        else
            System.out.println("NUMERO TEM QUE TER 4 DIGITOS.");
        teclado.close();
    }
}
