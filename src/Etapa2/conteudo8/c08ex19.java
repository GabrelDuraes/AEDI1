package Etapa2.conteudo8;
public class c08ex19 {
    public static void main(String[] args) {
        double valor,soma=0;
        for (int aux=1;aux<=100;aux++){
            valor=Math.pow(aux,2);
            soma+=valor;
            System.out.println(valor);
        }
        System.out.println("Soma dos termos: "+soma);
    }
}
