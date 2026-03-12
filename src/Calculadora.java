import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int num1, num2;
        String operacao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números (clique em 'Enter' a cada número digitado): ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a operação que deseja realizar (+,-,*,/): ");
        operacao = scanner.nextLine();

        if (operacao.equals("+")){
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

        } else if (operacao.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));

        } else if (operacao.equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));

        } else if (operacao.equals("/")) {
            if (num2 == 0){
                System.out.println("Não é possível realizar divisão por 0");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + (double) (num1) / num2);
            }

        } else {
            System.out.println("Operação inválida");
        }

    }
}
