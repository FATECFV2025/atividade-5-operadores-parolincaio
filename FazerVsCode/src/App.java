import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operadores calc = new Operadores();
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Operadores Aritméticos");
            System.out.println("2 - Operadores de Atribuição");
            System.out.println("3 - Operadores Lógicos");
            System.out.println("4 - Operadores de Comparação");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calc.operadoresAritmeticos();
                    break;
                case 2:
                    calc.operadoresAtribuicao();
                    break;
                case 3:
                    calc.operadoresLogicos();
                    break;
                case 4:
                    calc.operadoresComparacao();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
