package Etapa2.cont9_Series;
public class c09ex04 {
    public static void main(String[] args) {
        double serie=0,den,num;
        for (int aux=1;aux<=10;aux++){
            num=(4*aux-3)*(4*aux-2);
            den=((4*aux)-1)*(4*aux);
            serie+=num/den;
        }
        serie=Math.sqrt(serie);
        System.out.println("Serie: "+serie);
    }
}
