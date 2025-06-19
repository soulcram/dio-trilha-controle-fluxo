import java.util.Scanner;

public class Terminal {
    private Terminal(){}

    public static int getNumber(String msg){
        try {
            String mensagemDefinida = mensagemInvalida(msg) ? "Digite um número" : msg;
            System.out.println(mensagemDefinida);
            var sc = new Scanner(System.in);
            return sc.nextInt();
        }catch(Exception e){
            System.out.println("Número digitado inválido. Digite Novamente");
            return getNumber(msg);
        }
    }

    private static boolean mensagemInvalida(String msg){
        return msg == null || msg.isBlank();
    }
}
