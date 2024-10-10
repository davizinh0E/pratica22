import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro lado: ");
        double a = sc.nextDouble();
        System.out.print("Informe o segundo lado: ");
        double b = sc.nextDouble();
        System.out.print("Informe o terceiro lado: ");
        double c = sc.nextDouble();
        
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("Os valores podem formar um triângulo.");
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }
    }
}
