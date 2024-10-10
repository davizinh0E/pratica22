import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o coeficiente a: ");
        double a = sc.nextDouble();
        System.out.print("Informe o coeficiente b: ");
        double b = sc.nextDouble();
        System.out.print("Informe o coeficiente c: ");
        double c = sc.nextDouble();
        
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0) {
            double x = -c / b;
            System.out.println("Esta é uma equação de primeiro grau. Raiz: " + x);
        } else {
            System.out.println("Esta é uma equação de segundo grau.");
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
