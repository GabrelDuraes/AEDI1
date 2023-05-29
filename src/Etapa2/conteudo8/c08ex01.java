package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex01 {
    public static void main(String[] args) {
        double area,raio,pi=3.1416;
        Scanner teclado=new Scanner(System.in);
        for (int repete=1;repete<=10;repete++){
            System.out.println("Informe o valor do raio: ");
            raio=teclado.nextDouble();
            area=pi*Math.pow(raio,2);
            System.out.println("Raio: "+raio+" Area: "+area);
            teclado.nextLine();
        }
        teclado.close();
    }
}
