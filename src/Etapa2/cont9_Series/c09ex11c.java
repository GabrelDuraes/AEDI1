package Etapa2.cont9_Series;

public class c09ex11c {
    public static void main(String[] args) {
        double num,den,serie=0;
        for (int aux=1;aux<=100;aux++){
            num=((aux*2)+1)*Math.sqrt((4*aux)+1);
            den=Math.pow(5,aux);
            serie+=num/den;
        }
        serie=Math.pow(serie,2);
        System.out.println("Serie: "+serie);
    }
}
