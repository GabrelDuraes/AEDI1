package Etapa2.cont9_Series;
public class c09ex02 {
    public static void main(String[] args) {
        double dem,num,serie=0;
        for (int aux=1;aux<=100;aux++){
            num=aux;
            dem=(Math.pow(aux,2)+(aux-1));
            serie+=num/dem;
        }
        System.out.println("Serie: "+serie);
    }
}
