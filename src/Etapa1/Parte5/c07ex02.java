package Etapa1.Parte5;
import java.util.Scanner;
public class c07ex02 {
    public static void main(String[] args) {
        int nota1,nota2,nota3,notaF;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe o valor da primeira nota: ");
        nota1=teclado.nextInt();
        System.out.println("Informe o valor da segunda nota: ");
        nota2=teclado.nextInt();
        System.out.println("Informe o valor da terceira nota: ");
        nota3= teclado.nextInt();
        notaF=(nota1+nota2+nota3)/3;
        switch (notaF){
            case 9: case 10:
                System.out.println("Conceito: A.");
                break;
            case 8:
                System.out.println("Conceito: B.");
                break;
            case 7:
                System.out.println("Conceito: C.");
                break;
            case 5: case 6:
                System.out.println("Conceito: D.");
                break;
            case 1: case 2: case 3: case 4:
                System.out.println("Conceito: E.");
                break;
        }
        teclado.close();
    }
}
