package Etapa2.conteudo8;

public class c08ex27 {
    public static void main(String[] args) {
        double conta;
        for (int aux1=1;aux1<=10;aux1++) {
            for (int aux = 0; aux <= 7; aux++) {
                conta=Math.pow(2, aux);
                for (int a = 1; a <= conta; a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int aux = 6; aux >= 0; aux--) {
                for (int a = 1; a <= Math.pow(2, aux); a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}