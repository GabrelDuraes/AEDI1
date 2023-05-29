package Etapa2.conteudo11;

public class c11ex14 {
    public static void main(String[] args) {
        double num,den,conta=0,cont=0,serie;
        do{
            cont++;
            num=1;
            den=cont*2-1;
            if ((cont%2)!=0)
                conta+=num/den;
            else
                conta-=num/den;
            serie=4*conta;
        }while (!(serie>3.1416&&serie<3.1417));
        System.out.println("Valor de pi: "+serie+"\n" +
                "Termos necessarios: "+cont);
    }
}
