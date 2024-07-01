import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;
        
        do { 
            System.out.println("Digite a altura de 1 a 8: ");
            altura = scanner.nextInt();
        } while (altura < 1 || altura > 8);
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (altura - i - 2 < j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Pula para a próxima linha após o loop interno
        }
    }
}
