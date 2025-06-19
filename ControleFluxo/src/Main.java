public class Main {
    public static void main(String[] args) {

        System.out.println("Inicio da execução!");

        iniciar();

        System.out.println("Fim da execução!");
    }

    private static void iniciar(){
        try{
            var numero1 = Terminal.getNumber("Digite o primeiro número");
            var numero2 = Terminal.getNumber("Digite o segundo número");
            contar(numero1, numero2);
        }catch(ParametrosInvalidosException ex){
            System.out.println(ex.getMessage());
            iniciar();
        }
    }

    private static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro número informado não pode ser maior que o segundo número informado.");
        }

        if(parametroUm == parametroDois){
            System.out.println("Os números são iguais, não haverá contagem.");
            return;
        }

        int contagem = parametroDois - parametroUm;



        for(var i = 0; i < contagem; i++){
            System.out.println("Contagem: " + (i + 1));
        }
    }
}