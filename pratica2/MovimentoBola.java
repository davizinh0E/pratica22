import java.util.Scanner;

public class MovimentoBola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha o planeta (1 - Terra, 2 - Marte, 3 - Júpiter): ");
        int planeta = sc.nextInt();
        
        double g;
        switch (planeta) {
            case 1:
                g = 9.8;  // Gravidade na Terra
                break;
            case 2:
                g = 3.7;  // Gravidade em Marte
                break;
            case 3:
                g = 24.8; // Gravidade em Júpiter
                break;
            default:
                System.out.println("Planeta inválido!");
                return;
        }
        
        System.out.print("Informe a velocidade inicial (v0) em m/s: ");
        double v0 = sc.nextDouble();
        System.out.print("Informe o instante de tempo (t) em segundos: ");
        double t = sc.nextDouble();
        
        double v = v0 - g * t;  // Velocidade no instante t
        double h = v0 * t - 0.5 * g * Math.pow(t, 2);  // Altura no instante t
        
        System.out.println("Velocidade no instante t: " + v + " m/s");
        System.out.println("Altura no instante t: " + h + " metros");
    }
}
