
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo a calculadora de IMC");
        System.out.println("Digite a sua Altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite o seu Peso: ");
        double peso = scanner.nextDouble();

        double imc = (peso / altura) / altura;
        
        if(imc > 25){
            System.out.println("Você esta com obesidade");
        }
        else if (imc <= 25 || imc >= 20) {
            System.out.println("Você está com eutrofia");
        }
        else{
            System.out.println("Você está com desnutrição");
        }




    



    }
}
