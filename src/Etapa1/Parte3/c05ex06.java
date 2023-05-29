package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex06 {
    public static void main(String[] args) {
        double valA, valB, valC, pontX,pontY,reta,distancia;
        Scanner teclado=new Scanner(System.in);
    System.out.print("Qual o valor do ponto A na reta R?");
    valA=teclado.nextDouble();
    System.out.print("Qual o valor do ponto B na reta R?");
    valB=teclado.nextDouble();
    System.out.print("Qual o valor do ponto C na reta R?");
    valC=teclado.nextDouble();
    System.out.print("Qual a coordenada de X no ponto P?");
    pontX=teclado.nextDouble();
    System.out.print("Qual a coordenada de Y no ponto P?");
    pontY=teclado.nextDouble();
    reta=valA*pontX+valB*pontY+valC;
    distancia=reta/Math.sqrt(Math.pow(valA,2)+Math.pow(valB,2));
    System.out.println("Distancia:"+distancia);
    teclado.close();
    }
}
