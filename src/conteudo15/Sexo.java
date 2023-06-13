package conteudo15;

public class Sexo extends Local {
    private int homens;
    private int mulheres;
    private int contH=0;
    private int contM=0;

    public Sexo(String nome,String cep,String estado,int popu,String pontoTu,int homens,int mulheres){
        super(nome,cep,estado,popu,pontoTu);
        this.homens=homens;
        this.mulheres=mulheres;
    }
    public void quantidade(int homens, int mulheres){
        int quantidade;
        quantidade=homens+mulheres;
        if (homens>0)
            contH++;
        if (mulheres>0)
            contM++;
        System.out.println("Tem "+quantidade+" pessoas na sua casa.");
    }
    public int getContH() {
        return contH;
    }
    public int getContM() {return contM;}
    public int getHomens() {return homens;}
    public int getMulheres() {
        return mulheres;
    }
    public void setContH(int contH) {this.contH = contH;}
    public void setContM(int contM) {this.contM = contM;}
    public void setHomens(int homens) {this.homens = homens;}
    public void setMulheres(int mulheres) {this.mulheres = mulheres;}
}
