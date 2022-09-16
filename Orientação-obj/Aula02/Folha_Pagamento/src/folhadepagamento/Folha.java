package folhadepagamento;

public class Folha {
    public static void main(String[] args) {

   Pessoa p0 = new Pessoa("Anna", "555.555.55.55", "anaa@outlook.com");

   Pessoa p1 = new Aluno("Joana","98909","Joana@email.com","01010101010");

   Pessoa p2 = new Horista("Anna","5555","aluno.Anna@", "0001","Engenharia",25,20);

   Pessoa p3 = new Mensalista("João","0000900","João@email.com","988","Investimento","Junior");

        p0.write();
        p1.write();
        p2.write();
        p3.write();


    }



}