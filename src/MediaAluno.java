import java.util.Scanner;

public class MediaAluno {
        public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
                int nota1, nota2, nota3, nota4, result;

                System.out.print("Digite a primeira nota: ");
                nota1 = sc.nextInt();

                System.out.print("Digite a segunda nota: ");
                nota2 = sc.nextInt();

                System.out.print("Digite a terceira nota: ");
                nota3 = sc.nextInt();

                System.out.print("Digite a quarta nota: ");
                nota4 = sc.nextInt();

                result = (nota1 + nota2 + nota3 + nota4) / 4;

                System.out.println("Sua média é de: " + result);

                sc.close();
        }
}