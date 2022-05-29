package ProjetoPPJ.Facade;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CrmService.getInstancia().recuperarCidade(cep);
        String estado = CrmService.getInstancia().recuperarEstado(cep);
    CrmService.gravarCliente(nome,cep,cidade,estado);

    }
}
