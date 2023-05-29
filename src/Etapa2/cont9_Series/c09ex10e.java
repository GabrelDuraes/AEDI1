package Etapa2.cont9_Series;

public class c09ex10e {
    public static void main(String[] args) {
        double den,num,serie=0;
        for(int aux=1;aux<=100;aux++){
            num=aux;
            den=3*aux*2;
            serie+=num/den;
        }
        System.out.println("Serie: "+serie);
    }
}
