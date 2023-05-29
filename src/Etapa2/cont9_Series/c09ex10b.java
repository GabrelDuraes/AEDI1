package Etapa2.cont9_Series;

public class c09ex10b {
    public static void main(String[] args) {
        double num,den,serie=0;
        for (int aux=1;aux<=100;aux++){
            num=aux*2;
            den=aux*3;
            serie+=num/den;
        }
        serie=1+Math.sqrt(serie);
        System.out.println("Serie: "+serie);
    }
}
