package Etapa2.conteudo8;
public class c08ex23 {
    public static void main(String[] args) {
        int div1,div2,div3,div4,contPa=0,soma=0;
        double media;
        for (int aux=1000;aux<=9999;aux++){
            div1=aux%10;
            div2=aux/10%10;
            div3=aux/100%10;
            div4=aux/1000;
            if (div1==div4&&div2==div3){
                System.out.println(aux);
                contPa++;
                soma+=aux;
            }
        }
        media=soma/contPa;
        System.out.println("Media dos palíndromos: "+media);
    }
}
