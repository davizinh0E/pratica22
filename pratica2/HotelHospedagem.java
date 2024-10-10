import java.util.Scanner;

public class HotelHospedagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tipo de apartamento (1 - Simples, 2 - Duplo): ");
        int tipo = sc.nextInt();
        System.out.print("Informe o número de diárias: ");
        int diarias = sc.nextInt();
        
        double total;
        
        if (tipo == 1) { // Apto Simples
            if (diarias < 10) {
                total = 100.00 * diarias;
            } else if (diarias <= 15) {
                total = 90.00 * diarias;
            } else {
                total = 80.00 * diarias;
            }
        } else if (tipo == 2) { // Apto Duplo
            if (diarias < 10) {
                total = 140.00 * diarias;
            } else if (diarias <= 15) {
                total = 120.00 * diarias;
            } else {
                total = 100.00 * diarias;
            }
        } else {
            System.out.println("Tipo de apartamento inválido!");
            return;
        }
        
        System.out.println("O total a ser pago é: R$ " + total);
    }
}
