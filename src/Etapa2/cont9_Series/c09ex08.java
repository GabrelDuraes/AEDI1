package Etapa2.cont9_Series;

public class c09ex08 {
    public static void main(String[] args) {
        double den,num,serie=0;
        for (int aux=1;aux<=20;aux++){
            num=((aux*2)+1)*Math.sqrt((5*aux)-(aux-1));
            den=Math.pow(5,aux);
            serie+=num/den;
        }
        serie=Math.pow(serie,2);
        System.out.println("Serie: "+serie);
    }
}
