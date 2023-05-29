package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex15 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nome,cargo,nomeMaior="",cargoMaior="";
        int idade,rep,cont=0;
        double salario,soma=0,salarioMaior=0,media;
        System.out.println("Informe a quantidade de funcionarios: ");
        rep=teclado.nextInt();
        for (int aux=1;aux<=rep;aux++){
            teclado.nextLine();
            System.out.println("Informe o seu nome: ");
            nome=teclado.nextLine();
            System.out.println("Informe o cargo de "+nome+": ");
            cargo=teclado.nextLine();
            System.out.println("Informe o salario de "+nome+": ");
            salario=teclado.nextDouble();
            System.out.println("Informe a idade de "+nome+": ");
            idade=teclado.nextInt();
            if (cargo.equalsIgnoreCase("senior")&&salario>10000&&idade>50)
                System.out.println("Funcionario Senior com salario maior que R$10.000,00 e idade maior que 50 anos.");
            if (idade<=18) {
                soma += salario;
                cont++;
            }
            if (aux==1||salario>salarioMaior){
                salarioMaior=salario;
                nomeMaior=nome;
                cargoMaior=cargo;
            }
        }
        media=soma/cont;
        System.out.println("Media dos salarios dos funcionarios com ate 18 anos: "+media+"\n" +
                "Nome e cargo do funcionario que tem o maior salario: "+nomeMaior+", "+cargoMaior);
        teclado.close();
    }
}
