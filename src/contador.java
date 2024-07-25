import java.util.Scanner;

public class contador {
    public static void main(String[] args) throws Exception {
        try {Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parametro:");
        int parametroDois = terminal.nextInt();

        contar(parametroUm, parametroDois);
        terminal.close();
        }catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro, por favor, tente novamente");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for (int valorInicial = 1; valorInicial <= contagem; valorInicial++ ) {
                System.out.println(valorInicial);
            }
        }
    }
}