package Etapa3.conteudo13_Metodos;

public class c13ex02Metodo {
    public static double funcaoX(double x){
    double funcaoX;
    if (x<4)
        funcaoX=(5*x+3)/(Math.sqrt(16-Math.pow(x,2)));
    else if (x>4)
        funcaoX=(5*x+3)/(Math.sqrt(Math.pow(x,2)-16));
    else
        funcaoX=0;
    return funcaoX;
}
}
