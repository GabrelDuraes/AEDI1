package Etapa3.conteudo13;

import java.util.Scanner;

public class c13ex05 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        double anguloGra,angulo,seno,cosseno,tg,arcSen,arcCos,arcTg;
        System.out.println("Informe um angulo:");
        anguloGra=tec.nextDouble();
        angulo=Math.toRadians(anguloGra);
        seno=Math.sin(angulo);
        cosseno=Math.cos(angulo);
        tg=Math.tan(angulo);
        arcSen=1/seno;
        arcCos=1/cosseno;
        arcTg=1/tg;
        System.out.println("Angulo "+anguloGra+": \nSeno: "+seno+"\nCosseno: "+cosseno+
        "\nTangente: "+tg+"\nArco seno: "+arcSen+"\nArco Cosseno: "+arcCos+"\nArco tangente: "+arcTg);
    }
}
