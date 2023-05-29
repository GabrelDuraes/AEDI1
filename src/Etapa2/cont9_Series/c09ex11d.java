package Etapa2.cont9_Series;

public class c09ex11d {
    public static void main(String[] args) {
        double num,den,serie=0;
        for(int aux=1;aux<=100;aux++){
            num=Math.pow(aux,3);
            den=Math.pow(10,aux-1);
            serie+=num/den;
        }
        System.out.println("Serie: "+serie);
    }
}
