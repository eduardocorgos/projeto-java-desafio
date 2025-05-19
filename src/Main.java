import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome = "Eduardo";
        String tipoDeConta = "corrente";
        double saldo = 2500.00;
        Scanner sc = new Scanner(System.in);
        String mensagemInicio = String.format("""
                ***********************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """, nome, tipoDeConta, saldo);

        double valorReceber = 0;
        double valorEnviar = 0;
        System.out.println(mensagemInicio);
        int opcaoMenu =0;


        while (opcaoMenu != 4){
            String menu = String.format("""
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """);
            System.out.println(menu);
            opcaoMenu = sc.nextInt();
            switch (opcaoMenu){
                case 1:
                    System.out.println("Seu saldo é de:" + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber:");
                    valorReceber = sc.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Saldo atual:" + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir:");
                    valorEnviar = sc.nextDouble();
                    if (valorEnviar > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorEnviar;
                        System.out.println("Saldo atual: R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Até logo!");
                    break;
            }

        }
        sc.close();
    }
}