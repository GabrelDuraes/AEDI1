package Etapa3.conteudo13_Metodos;

import java.util.Scanner;

public class c13ex04 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num,numero,cont=0;
        num = (int) Math.floor(Math.random() * 100);
        do {
            System.out.println("Informe um numero inteiro: ");
            numero=tec.nextInt();
            if (num==numero){
                cont++;
                System.out.println("Numero acertado! \nTentativas: "+cont);
                break;
            }
            else
                if (numero>num) {
                    System.out.println("Numero acima do numero aleatorio.");
                    cont++;
                }
                if (numero<num){
                    System.out.println("Numero abaixo do numero aleatorio.");
                    cont++;
                }
        }while (num!=numero);
        tec.close();
    }
}
