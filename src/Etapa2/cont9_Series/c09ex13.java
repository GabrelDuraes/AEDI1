package Etapa2.cont9_Series;

public class c09ex13 {
    public static void main(String[] args) {
        double num=1,den,serie=0;
        for (int aux=1;aux<=10;aux++){
            num*=aux;
            den=Math.pow(2,aux)-1;
            if (aux%2!=0)
                serie+=num/den;
            else
                serie-=num/den;
        }
        System.out.println("Serie: "+serie);
    }
}
