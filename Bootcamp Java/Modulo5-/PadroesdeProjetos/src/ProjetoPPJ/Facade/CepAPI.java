package ProjetoPPJ.Facade;

import ProjetoPPJ.Singleton.SingletonEager;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI(){
        super();

    }

    public static CepAPI getInstancia(){
        return instancia;

    }
    public String recuperareCidade(String cep){
        return "Pindamonhangaba";
    }
    public String recuperareEstado(String cep){
        return "SP";
    }

}
