import java.util.Scanner;

public class Questao3prova {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Digite o terceito número: ");
        double numero3 = entrada.nextDouble();

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.print("O menor número é " + numero1 + ".");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.print("O menor número é " + numero2 + ".");
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.print("O menor número é " + numero3 + ".");
        } else if (numero1 == numero2 && numero2 == numero3) {
            System.out.print("Números iguais!");
        } else {
            System.out.print("Tente novamente!");
        }

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.print("O maior número é " + numero1 + ".");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.print("O maior número é " + numero2 + ".");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.print("O maior número é " + numero3 + ".");
        }
    }

}
