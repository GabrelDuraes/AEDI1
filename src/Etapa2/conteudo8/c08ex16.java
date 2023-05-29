package Etapa2.conteudo8;

public class c08ex16 {
    public static void main(String[] args) {
        int soma = 0, cont = 0;
        double media = 0;
        for (int aux = 1000; aux <= 2000; aux++) {
            if (aux % 2 != 0) {
                soma += aux;
                cont++;
            }
        }
        media = soma / cont;
        System.out.println("Media: " + media);
    }
}