package Etapa2.cont9_Series;
public class c09ex03 {
    public static void main(String[] args) {
        double serie=0,den,num;
        for (int aux=1;aux<=20;aux++){
            num=1+Math.sqrt(aux*4);
            den=aux*3;
            serie+=num/den;
        }
        System.out.println("Serie: "+serie);
    }
}
