package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex11 {
    public static void main(String[] args) {
        int numCheq,numBanco,numAgen,numSeque;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe o numero de cheque:");
        numCheq=teclado.nextInt();
        numBanco=numCheq/1000000;
        numAgen=numCheq%1000000/1000;
        numSeque=numCheq%1000;
        System.out.println("Número do cheque:"+numCheq+"\nBanco:"+numBanco+"\nAgência:"+numAgen+"\nSequencial:"+numSeque);
        teclado.close();
    }
}
