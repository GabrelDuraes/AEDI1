package Etapa2.teste;

public class serie_matematica {
    public static void main(String[] args) {
        double num,den,serie=0;
        for (int aux=1;aux<=100;aux++){//ajustavel para oq for pedido no enunciado: for,do while ou while.
            num=(3*aux-(aux-1))*Math.sqrt(4*aux+1);//Dica1: quando a variaçao for constante: aux*numero+-(ajuste para o primeiro termo)
            den=Math.pow(5,aux);//Dica2:quando a variacao nao for constante mas for multiplo do primeiro termo: Math.pow(numero,aux+-ajuste 1 termo);
            serie+=num/den;
       }
        serie=Math.pow(serie,2);//alguma outra equacao que engloba toda equacao fica fora da repeticao.
        //caso esteja pedindo raiz de 8, so elevar o numero a 1/8.0, e etc;
        System.out.println("Valor serie:"+serie);
        //Dica 3: sem variacao constante, sem multiplo do primeiro termo: Math.pow(aux,numero+- ajuste para o primeiro termo)
    }
}
