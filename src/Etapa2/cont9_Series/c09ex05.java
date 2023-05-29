package Etapa2.cont9_Series;
public class c09ex05 {
    public static void main(String[] args) {
        double serie=0,den,num;
        for (int aux=1;aux<=10;aux++){
            num=((aux*2)-2)+(3*aux);
            den=(5*aux)+aux+1;
            serie+=num/den;
    }
        serie=5*serie;
        System.out.println("Serie: "+serie);
}}
