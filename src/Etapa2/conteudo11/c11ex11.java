package Etapa2.conteudo11;
import java.util.Scanner;
public class c11ex11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;
        System.out.println("Informe um numero inteiro entre 1 e 9:");
        num=tec.nextInt();
        do {
            if (num<1||num>9){
                System.out.println("Numero invalido! Digite novamente: ");
                num=tec.nextInt();
            }
        }while (num<1||num>9);
        for (int aux1=1;aux1<=num;aux1++) {
            for (int aux = 1; aux <= aux1; aux++){
                System.out.print(aux1+" ");
            }
            System.out.println();
        }
        tec.close();
    }
}