package conteudo15;

public class Local {
    private String pontoTu,cep,nome,estado;
    private int popu;

    public Local(String nome,String cep,String estado,int popu,String pontoTu) {
        this.pontoTu=pontoTu;
        this.cep=cep;
        this.nome=nome;
        this.estado=estado;
        this.popu=popu;
    }
    public void Imprimir(){
        System.out.println("Cidade: "+this.nome+"\n" +
                "Estado: "+this.estado+"\n" +
                "CEP de "+this.nome+": "+this.cep+"\n" +
                "População do local: "+this.popu+"\n" +
                "Ponto turistico da cidade "+this.nome+": "+this.pontoTu);
    }
    public int AnoCid(int anoFun,int anoAtu){
        int anoCid;
        anoCid=anoAtu-anoFun;
        return anoCid;
    }
    public String getCep() {
        return this.cep;
    }
    public String getEstado() {
        return this.estado;
    }
    public String getNome() {
        return this.nome;
    }
    public String getPontoTu() {
        return this.pontoTu;
    }
    public int getPopu() {
        return this.popu;
    }
    public String setCep() {
        return this.cep;
    }
    public String setEstado() {
        return this.estado;
    }
    public String setNome() {
        return this.nome;
    }
    public String setPontoTu() {
        return this.pontoTu;
    }
    public int setPopu() {
        return this.popu;
    }
}
