package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex06 {
    public static void main(String[] args) {
        int numero,contTres=0,soma=0;
        Scanner teclado=new Scanner(System.in);
        for (int aux=1;aux<=10;aux++) {
            System.out.println("informe um numero inteiro: ");
            numero = teclado.nextInt();
            if ((numero % 2.0) == 0)
                System.out.println("Numero e par.");
            else
                System.out.println("Numero impar");
            if ((numero % 3.0) == 0)
                contTres++;
            if ((numero % 4.0) == 0)
                soma += numero;
        }
        System.out.println("Soma dos numeros divisiveis por 4: "+soma+"\n" +
                "Quantidade de numeros divisiveis por 3: "+contTres);
    teclado.close();
    }
}
