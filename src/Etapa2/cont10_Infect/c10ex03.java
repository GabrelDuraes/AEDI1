package Etapa2.cont10_Infect;

import java.util.Scanner;

public class c10ex03 {
    public static void main(String[] args) {
        double angulo,pi=3.1416,raio,conta;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe um valor para o angulo: ");
        angulo=teclado.nextDouble();
        do {
            System.out.println("Informe um valor de raio: ");
            raio=teclado.nextDouble();
            if (raio==-1) {
                System.out.println("Programa encerrado.");
                break;
            }
            conta=(angulo*pi*Math.pow(raio,2))/360;
            System.out.println("A area do setor circulo � de: "+conta);
        }while(raio!=-1);
        teclado.close();
    }
}
