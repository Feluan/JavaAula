import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, result;

        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();

        result = num1 * num2;

        System.out.println("O resultado da multiplicação dos dois numeros é de: " + result);

        scanner.close();
    }
}