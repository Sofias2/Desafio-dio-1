package folhapagamento;

import funcionario.*;

public class MainFolhaPagamento {
    public static void main(String[] args) {
        Pessoa p0 = new Pessoa("3455646","Sofia","Sofia@email.com","Rua Bonita.01");
        Funcionario f0 = new Mensalista("gerente","797","728","56535653","José","jose@email.com","Rua Tiria, 204");
        Funcionario f1 = new Horista("434","3345", "235446","George", "george@email.com", "Rua caixias,256", 40,150);
        Funcionario f2 = new ProfessorHorista("434","3345", "235446","George", "george@email.com", "Rua caixias,256", 40,"especialista");

        /*System.out.println(p0);
        System.out.println(f0.calculaSalarioBruto() +  ", " + f0.calculaIRRF() + ", " + f0.calculaINSS() + " = " + f0.calculaSalario());
        System.out.println(f1.calculaSalarioBruto());*/

        Pessoa v[] = new Pessoa[4];
        v[0] = p0;
        v[1] = f0;
        v[2] = f1;
        v[3] = f2;


        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
            if (v[i].getClass().equals(Mensalista.class) || v[i].getClass().equals(Horista.class) || v[i].getClass().equals(ProfessorHorista.class)){
                System.out.println(((Funcionario)v[i]).calculaSalario());
            }

        }



    }
}
