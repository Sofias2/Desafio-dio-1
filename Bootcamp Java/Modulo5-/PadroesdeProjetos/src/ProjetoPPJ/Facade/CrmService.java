package ProjetoPPJ.Facade;

public class CrmService {

    private CrmService{
        super();
    }
    public static void  gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente Salvo no Sistema com Sucesso!");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }

}
