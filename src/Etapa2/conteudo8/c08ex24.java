package Etapa2.conteudo8;
public class c08ex24 {
    public static void main(String[] args) {
        double serie,conta,soma=0;
        for (int aux=1;aux<=99;aux+=2){
            conta=(Math.pow(2,aux));
            soma+=conta;
        }
        serie=(1/3.0)*soma;
        System.out.println("Valor da serie: "+serie);
    }
}