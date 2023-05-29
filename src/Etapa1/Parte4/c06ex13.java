package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex13 {
    public static void main(String[] args) {
        int hrsI,minI,hrsF,minF,hrs,min1,min;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe as horas iniciais: ");
        hrsI= teclado.nextInt();
        System.out.println("Informe os minuto inicial: ");
        minI= teclado.nextInt();
        System.out.println("Informe as horas finais: ");
        hrsF= teclado.nextInt();
        System.out.println("Informe os minutos finais: ");
        minF= teclado.nextInt();
        hrs=(hrsF-hrsI);
        min=(minF-minI);
        if (min<0){
            min1=60+min;
            hrs--;
            System.out.println("O jogo durou "+hrs+" horas e "+min1+" minutos.");
        }
        else System.out.println("O jogo durou "+hrs+" horas e "+min+" minutos.");
        teclado.close();
    }
}
