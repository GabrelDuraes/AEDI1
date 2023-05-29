package Etapa2.cont9_Series;

public class c09ex11f {
    public static void main(String[] args) {
        double num,den,serie=0;
        for (int aux=1;aux<=100;aux++){
            num=(aux*2-1)*Math.pow(2,aux+1);
            den=Math.pow(((6*aux-4)-(aux-1)),2);
            serie+=num/den;
        }
        serie=5*Math.sqrt(serie);
        System.out.println("Serie: "+serie);
    }
}
