package Etapa2.cont9_Series;
public class c09ex07 {
    public static void main(String[] args) {
        double den,num,conta,serie=0;
        for (int aux=1;aux<=6;aux++){
            num=((aux*2)-2)+(3*aux);
            den=(5*aux)+aux+1;
            serie+=num/den;
        }
        System.out.println("Serie: "+serie);
    }
}
