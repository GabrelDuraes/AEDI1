package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex18 {
    public static void main(String[] args) {
        int numero,multiplicacao;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 9: ");
        numero=teclado.nextInt();
        if (numero>1||numero<9){
            for (int aux=1;aux<=9;aux++){
                multiplicacao=aux*numero;
                System.out.println(aux+" x "+numero+": "+multiplicacao);
            }
        }
        else
            System.out.println("Numero nao esta dentro do intervalo indicado.");
    }
}
