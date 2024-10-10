import java.util.Scanner;

public class FuncaoExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um valor para x: ");
        double x = sc.nextDouble();
        
        // Função f(x) = x^2 + 2x + 1
        double resultado = Math.pow(x, 2) + 2 * x + 1;
        
        System.out.println("O valor da função para x = " + x + " é: " + resultado);
    }
}
