package Etapa2.cont9_Series;

public class c09ex11e {
    public static void main(String[] args) {
        double num,den,serie=0;
        for (int aux=1;aux<=100;aux++){
            num=Math.pow(aux,2)*Math.sqrt(2*aux+3);
            den=Math.pow(aux+1,aux);
            serie+=num/den;
        }
        serie=(2/3.0)*serie;
        System.out.println("Serie: "+serie);
    }
}
