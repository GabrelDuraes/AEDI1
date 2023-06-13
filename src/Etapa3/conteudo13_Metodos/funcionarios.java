package Etapa3.conteudo13_Metodos;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class funcionarios {

    public static void main(String[] args) {
        List<String>nomeOr=new ArrayList<String>();
        List<Double>impostoOr=new ArrayList<Double>();
        String nome,temp;
        double salario,imposto,temp1;
        int dependentes,cont=0;
        Scanner tec=new Scanner(System.in);
        System.out.println("Informe X em nome para encerrar o programa.");
        do{
            cont++;
            System.out.println("Informe o nome do funcionario "+cont+"�: ");
            nome=tec.nextLine();
            if(nome.equalsIgnoreCase("X")||nome.equalsIgnoreCase("x"))
                break;
            nomeOr.add(nome);
            System.out.println("Informe o salario desse funcionario: ");
            salario=tec.nextDouble();
            System.out.println("Informe a quantidade de dependentes do funcionario: ");
            dependentes=tec.nextInt();
            imposto=CalculoImpost.aliquota(salario,dependentes);
            impostoOr.add(imposto);
            tec.nextLine();
        }while (!(nome.equalsIgnoreCase("X")||nome.equalsIgnoreCase("x")));
        for (int aux=0;aux<nomeOr.size()-1;aux++){
            for (int x=0;x<nomeOr.size()-1;x++){
                if (nomeOr.get(x).compareToIgnoreCase(nomeOr.get(x+1))>0){
                    temp=nomeOr.get(x);
                    nomeOr.set(x,nomeOr.get(x+1));
                    nomeOr.set(x+1,temp);
                    temp1=impostoOr.get(x);
                    impostoOr.set(x,impostoOr.get(x+1));
                    impostoOr.set(x+1,temp1);
                }
            }
        }
        System.out.println("Ordenacao em ordem alfabetica: ");
        for (int aux=0;aux<nomeOr.size();aux++){
            System.out.println("Funcionario: "+nomeOr.get(aux)+"-- Quanto pagar de imposto: "+impostoOr.get(aux));
        }
        tec.close();
    }
}
