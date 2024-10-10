import java.util.Scanner;

public class OperacoesMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Informe o segundo número: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Multiplicar");
        System.out.println("3 - Subtrair o maior pelo menor");
        System.out.println("4 - Dividir o primeiro pelo segundo");
        
        int opcao = sc.nextInt();
        double resultado;
        
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = Math.abs(num1 - num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
