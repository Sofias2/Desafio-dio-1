package Dio.esxercicio;

public class Mensagem {
    public static void obterMensagem(int hora){

        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                 mensagemBomdia();
                 break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoatarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoanoite();
                break;
            default:
                System.out.println("Hora Invalida");
                break;


        }

    }

    public static void mensagemBomdia(){
        System.out.println("Bom diaa!");
    }
    public static void mensagemBoatardedia(){
        System.out.println("Boa Tardee!");
    }
    public static void mensagemBoanoite(){
        System.out.println("Boa Noitee!");
    }


}
