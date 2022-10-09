import java.util.Scanner;

public class javacalculator {

    public static void main(String[] args) {

        while (1 == 1) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro numero");
            int x = scanner.nextInt();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Digite o segundo numero");
            int y = scanner1.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Digite a operacao");
            String opera = scanner2.nextLine();

            if (opera.equals("somar")) {
                System.out.println(x + y);
            } else if (opera.equals("subtrair")) {
                System.out.println(x - y);
            } else if (opera.equals("multiplicar")) {
                System.out.println(x * y);
            } else if (opera.equals("dividir")) {
                System.out.println(x / y);
            }
        }
    }

}




