//Nome: Gabriel da Silva Dur�es
package Etapa1.Prova;
import java.util.Scanner;
public class D20811C {
    public static void main(String[] args) {
        String bolsa1;
        int registro, ra, qtdCopias, xerox;
        double totalProd, mensalidade, bolsa2, precoX, total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o 5 digitos do seu RA: ");
        registro = teclado.nextInt();
        System.out.println("informe a quantidade de copias xerox: ");
        qtdCopias = teclado.nextInt();
        System.out.println("Informe o valor total dos produtos adquiridos: ");
        totalProd = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Voce possui bolsa? ");
        bolsa1 = teclado.nextLine();
        ra = registro / 10000;
        mensalidade = 0;
        switch (ra) {
            case 1:
                mensalidade = 1200;
                break;
            case 2:
                mensalidade = 1350;
                break;
            case 3:
                mensalidade = 2100;
                break;
            case 4:
                mensalidade = 3200;
        }
        bolsa2 = 0;
        //Desconto bolsa
        if (bolsa1.equalsIgnoreCase("sim")) {
            switch (ra) {
                case 1:
                    bolsa2 = mensalidade * 5 / 100;
                    break;
                case 2:
                    bolsa2 = mensalidade * 10 / 100;
                    break;
                case 3:
                    bolsa2 = mensalidade * 15 / 100;
                    break;
                case 4:
                    bolsa2 = mensalidade * 30 / 100;
            }
        }
        if (qtdCopias <= 50){
            precoX = qtdCopias * 0.09;}
        else if (qtdCopias <= 500){
            precoX = qtdCopias * 0.08;}
        else{
            precoX = qtdCopias * 0.06;}
        total = (mensalidade + precoX + totalProd - bolsa2);
        System.out.printf("Valor do Boleto: R$ %.2f",total);
        teclado.close();
    }
}