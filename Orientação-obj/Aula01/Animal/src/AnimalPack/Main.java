package AnimalPack;

public class Main {
    public static void main(String[] args) {


        Animal gatoPreto = new Animal("Gato","Preto");
        Animal patoBranco = new Animal("Pato","Branco");
        Animal Galinha = new Animal();

        Galinha.setCor("Marron");
        Galinha.setTipo("Galinha");


        System.out.println( "Cor: " + gatoPreto.getCor() + ", " + " Tipo: " + gatoPreto.getTipo());
        System.out.println(patoBranco.toString());
        System.out.println(Galinha.toString());
    }
}