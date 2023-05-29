package Etapa2.cont9_Series;

public class c09ex11a {
    public static void main(String[] args) {
        double num,den,serie=0;
        for (int aux=1;aux<=100;aux++){
            num=aux+(((aux*6)-5)+aux-1);
            den=Math.pow(4,aux-1);
            serie+=num/den;
        }
        serie=Math.cbrt(serie);
        System.out.println("Serie: "+serie);
    }
}
