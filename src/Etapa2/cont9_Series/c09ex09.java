package Etapa2.cont9_Series;
public class c09ex09 {
    public static void main(String[] args) {
        double num,den,serie=0;
        for(int aux=1;aux<=30;aux++){
            num=Math.pow(3,aux+1);
            den=(9+aux)*Math.sqrt(Math.pow(aux,4));
            serie+=num/den;
        }
        serie=100-Math.pow(serie,3);
        System.out.println("Serie: "+serie);
    }
}
