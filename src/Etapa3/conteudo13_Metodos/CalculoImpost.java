package Etapa3.conteudo13_Metodos;

public class CalculoImpost {
    public static double aliquota(double salario,int dependentes){
        int qtdDepe;
        qtdDepe=dependentes*150;
        salario=salario-qtdDepe;
        double aliquota;
        if (salario<=1000){
            aliquota=0;
            return aliquota;
        }else if (salario<=5000){
            aliquota=salario*0.1;
            return aliquota;
        }else if (salario<=10000){
            aliquota=salario*0.15;
            return aliquota;
        } else {
            aliquota=salario*0.2;
            return aliquota;
        }
    }
}
