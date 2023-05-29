package Etapa2.teste;

public class serie2 {
    public static void main(String[] args) {
        double num,den,serie=0;
        for(int aux=1;aux<=100;aux++){
            num=(aux*2-1)*(Math.pow(2,aux+1));
            den=Math.pow(6*aux-4-(aux-1),2);
            serie+=num/den;
        }
        serie=5*Math.sqrt(serie);
        System.out.println("Valor de serie:"+serie);
    }
}
