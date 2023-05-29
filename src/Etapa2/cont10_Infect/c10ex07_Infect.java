package Etapa2.cont10_Infect;
import java.util.Scanner;
public class c10ex07_Infect {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double taxa = 0.003, qtdPessoas, conta, infectados = 1;
        int dias = 0, diasF, meses, anos;
        System.out.println("Para encerrar o programa, digite 0 na quantidade de pessoas.");
        do {
            System.out.println("Informe a quantidade de pessoas da regiao: ");
            qtdPessoas = teclado.nextInt();
            if (qtdPessoas==0) {
                System.out.println("Programa encerrado.");
                break;
            }
            do {
                conta = infectados * taxa;
                infectados += conta;
                dias++;
            } while (qtdPessoas > infectados);
            anos = dias / 365;
            meses = (dias % 365)/30;
            diasF = dias - ((anos*365)+(meses*30));
            System.out.println("Anos: " + anos + "\nMeses: " + meses + "\nDias: " + diasF);
        }while (qtdPessoas!=0);
        teclado.close();
    }
}