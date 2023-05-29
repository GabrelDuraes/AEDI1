package Etapa1.Parte5;
import java.util.Scanner;
public class c07ex03 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double imposto,multa;
        int dias;
        System.out.println("Informe o valor do imposto: ");
        imposto=teclado.nextDouble();
        System.out.println("Informe o numero de dias atrasados: ");
        dias=teclado.nextInt();
        switch (dias) {
            case 1, 2, 3, 4, 5 -> System.out.println("Multa: R$0");
            case 6, 7, 8 -> {
                multa = imposto * 2 / 100;
                System.out.println("Multa: R$" + multa);
            }
            case 9, 10 -> {
                multa = (imposto * 10 / 100) + dias * 0.5 % 100.0;
                System.out.println("Multa: R$" + multa);
            }
            default -> {
                multa = (imposto * 150 / 100) + dias;
                System.out.println("Multa: R$" + multa);
            }
        }
        teclado.close();
    }
}

