
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;

        System.out.print("Digite o primeiro numero: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextInt();
        
        result = num1 + num2;

        System.out.println("O resultado da soma dos dois numeros é de: " + result);

        sc.close();
    }
}
