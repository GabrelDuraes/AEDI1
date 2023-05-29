package Etapa2.cont9_Series;
public class c09ex01 {
    public static void main(String[] args) {
        double num,dem,serie=0;
        for (int aux = 1; aux<=39;aux++){
            num=(39-(aux+1))*(39-aux);
            dem=aux;
            serie+=num/dem;
        }
        System.out.println("Serie: "+serie);
    }
}
