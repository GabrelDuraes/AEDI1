package Etapa2.cont9_Series;

public class c09ex11b {
    public static void main(String[] args) {
        double den,num,serie=0;
        for (int aux=1;aux<=100;aux++){
            num=(aux*3)-2;
            den=Math.sqrt((4*aux)+(3-(aux-1)));
            serie+=num/den;
        }
        serie=(5/3.0)*serie;
        System.out.println("Serie: "+serie);
    }
}
