package Etapa2.cont9_Series;
public class c09ex06 {
    public static void main(String[] args) {
        double den,num,serie=0;
        for (int aux=1;aux<=20;aux++){
            num=aux;
            den=Math.sqrt(2*aux);
            serie+=num/den;
        }
        serie=10+serie;
        System.out.println("Serie: "+serie);
    }
}
