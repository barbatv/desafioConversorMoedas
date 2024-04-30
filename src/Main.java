import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, InputMismatchException {

        Scanner sc = new Scanner(System.in);
        ConversorMoedas conversorMoedas = new ConversorMoedas();

        String menu = """
                                
                            ┌┐ ┌─┐┌─┐┌─┐   ┬  ┬┬┌┐┌┌┬┐┌─┐┌─┐
                            ├┴┐│ │├─┤└─┐───└┐┌┘││││ ││├─┤└─┐
                            └─┘└─┘┴ ┴└─┘    └┘ ┴┘└┘─┴┘┴ ┴└─┘
                                         ┌─┐┌─┐
                                         ├─┤│ │
                                         ┴ ┴└─┘
                                
                ╔═╗┌─┐┌┐┌┬  ┬┌─┐┬─┐┌─┐┌─┐┬─┐  ┌┬┐┌─┐  ╔╦╗┌─┐┌─┐┌┬┐┌─┐┌─┐
                ║  │ ││││└┐┌┘├┤ ├┬┘└─┐│ │├┬┘   ││├┤   ║║║│ │├┤  ││├─┤└─┐
                ╚═╝└─┘┘└┘ └┘ └─┘┴└─└─┘└─┘┴└─  ─┴┘└─┘  ╩ ╩└─┘└─┘─┴┘┴ ┴└─┘
                
                                         
                Escolha qual moeda deseja converter:
                                
                1) Dólar americano ==> Peso argentino
                2) Peso argentino ==> Dólar Americano
                3) Dólar Americano ==> Real brasileiro
                4) Real brasileiro ==> Dólar americano
                5) Dólar americano ==> Peso colombiano
                6) Peso colombiano ==> Dólar americano
                7) Sair
                                
                Escolha uma opção válida:
                """;

        boolean sair = false;

        while (!sair) {
            System.out.print(menu);
            int opcaoMenu = sc.nextInt();
            String currency1, currency2;
            double amount;

            switch (opcaoMenu) {
                case 1:
                    currency1 = "USD";
                    currency2 = "ARS";
                    System.out.println("Digite o valor que deseja converter: ");
                    try {
                        amount = sc.nextDouble();
                        System.out.println(conversorMoedas.converterMoeda(currency1, currency2, amount));
                        pausar(2000);
                    } catch (InputMismatchException e) {
                        System.out.println("Caractere inválido. Digite um valor correto!");
                        sc.nextLine();
                    }
                    break;


                case 2:
                    currency1 = "ARS";
                    currency2 = "USD";
                    System.out.println("Digite o valor que deseja converter: ");
                    try {
                        amount = sc.nextDouble();
                        System.out.println(conversorMoedas.converterMoeda(currency1, currency2, amount));
                        pausar(2000);
                    } catch (InputMismatchException e) {
                        System.out.println("Caractere inválido. Digite um valor correto!");
                        sc.nextLine();
                    }
                    break;

                case 3:
                    currency1 = "USD";
                    currency2 = "BRL";
                    System.out.println("Digite o valor que deseja converter: ");
                    try {
                        amount = sc.nextDouble();
                        System.out.println(conversorMoedas.converterMoeda(currency1, currency2, amount));
                        pausar(2000);
                    } catch (InputMismatchException e) {
                        System.out.println("Caractere inválido. Digite um valor correto!");
                        sc.nextLine();
                    }
                    break;

                case 4:
                    currency1 = "BRL";
                    currency2 = "USD";
                    System.out.println("Digite o valor que deseja converter:");
                    try {
                        amount = sc.nextDouble();
                        System.out.println(conversorMoedas.converterMoeda(currency1, currency2, amount));
                        pausar(2000);
                    } catch (InputMismatchException e) {
                        System.out.println("Caractere inválido. Digite um valor correto!");
                        sc.nextLine();
                    }
                    break;


                case 5:
                    currency1 = "USD";
                    currency2 = "COP";
                    System.out.println("Digite o valor que deseja converter: ");
                    try {
                        amount = sc.nextDouble();
                        System.out.println(conversorMoedas.converterMoeda(currency1, currency2, amount));
                        pausar(2000);
                    } catch (InputMismatchException e) {
                        System.out.println("Caractere inválido. Digite um valor correto!");
                        sc.nextLine();
                    }
                    break;

                case 6:
                    currency1 = "COP";
                    currency2 = "USD";
                    System.out.println("Digite o valor que deseja converter: ");
                    try {
                        amount = sc.nextDouble();
                        System.out.println(conversorMoedas.converterMoeda(currency1, currency2, amount));
                        pausar(2000);
                    } catch (InputMismatchException e) {
                        System.out.println("Caractere inválido. Digite um valor correto!");
                        sc.nextLine();
                    }
                    break;

                case 7:
                    sair = true;
                    System.out.println("Saindo do sistema...");
                    pausar(2000);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;

            }


        }


    }

    public static void pausar(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

