package Etapa2.cont9_Series;

public class c09ex10a {
    public static void main(String[] args) {
        double num,den,serie=0;
        for (int aux=1;aux<=100;aux++){
            num=aux;
            den=Math.sqrt(aux*2);
            serie+=num/den;
        }
        System.out.println("Serie: "+serie);
    }
}
