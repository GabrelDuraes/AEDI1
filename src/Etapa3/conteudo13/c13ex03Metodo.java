package Etapa3.conteudo13;

public class c13ex03Metodo {
    public static String NumPosicao(String num, int posicao) {
        String NumPosicao;
        String digitos[]=num.split("");
        NumPosicao=digitos[digitos.length-posicao];
        return NumPosicao;
    }
}
