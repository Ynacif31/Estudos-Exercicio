
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double area;
        double n = 3.14159;

        System.out.println("Digite a o valor do raio: ");
        double raio = scanner.nextDouble();

        double quadrado = raio * raio;

        area = n * quadrado;

        System.out.println("A=" + area);


        scanner.close();

    }
}
