import java.util.Scanner;

public class Expoente {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        double result;

        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        num2 = scanner.nextInt();

        result = Math.pow(num1, num2);

        System.out.println("O resultado de " + num1 + " elevado a " + num2 + " é: " + result);

        scanner.close();
    }
}