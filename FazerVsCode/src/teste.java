import java.util.Scanner;

public class Operadores {
    Scanner scanner = new Scanner(System.in);

    public void operadoresAritmeticos() {
        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));
    }

    public void operadoresAtribuicao() {
        System.out.print("Digite um número inicial: ");
        int x = scanner.nextInt();

        System.out.println("x += 5 → " + (x += 5));
        System.out.println("x -= 3 → " + (x -= 3));
        System.out.println("x *= 2 → " + (x *= 2));
        System.out.println("x /= 4 → " + (x /= 4));
        System.out.println("x %= 3 → " + (x %= 3));
    }

    public void operadoresLogicos() {
        System.out.print("Digite o primeiro valor booleano (true/false): ");
        boolean a = scanner.nextBoolean();
        System.out.print("Digite o segundo valor booleano (true/false): ");
        boolean b = scanner.nextBoolean();

        System.out.println("a && b → " + (a && b));
        System.out.println("a || b → " + (a || b));
        System.out.println("!a → " + (!a));
        System.out.println("!b → " + (!b));
    }

    public void operadoresComparacao() {
        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("a == b → " + (a == b));
        System.out.println("a != b → " + (a != b));
        System.out.println("a > b → " + (a > b));
        System.out.println("a < b → " + (a < b));
        System.out.println("a >= b → " + (a >= b));
        System.out.println("a <= b → " + (a <= b));
    }
}
