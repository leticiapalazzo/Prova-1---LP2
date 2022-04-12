import java.util.Scanner;

// 1. Faça um programa que simule o comportamento de uma calculadora. O usuário deve escolher qual operação ele deseja realizar
// (soma, subtração, multiplicação ou divisão), e informar dois números inteiros para o cálculo. (Utilize o swich na resolução).

public class Questao1prova {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Digite a operação desejada (+ , - , * ou /): ");
        char operacao = entrada.next().charAt(0);

        switch (operacao) {
            case '+':
                double soma = numero1 + numero2;
                System.out.print("O resultado da soma é: " + soma + ".");
                break;
            case '-':
                double subtracao = numero1 - numero2;
                System.out.print("O resultado da subtração é: " + subtracao + ".");
                break;
            case '*':
                double multiplicacao = numero1 * numero2;
                System.out.print("O resultado da multiplicação é: " + multiplicacao + ".");
                break;
            case '/':
                double divisao = numero1 / numero2;
                System.out.print("O resultado da divisão é: " + divisao + ".");
        }  

    }

}
