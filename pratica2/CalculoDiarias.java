import java.util.Scanner;

public class CalculoDiarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número de diárias: ");
        int diarias = sc.nextInt();
        
        double diaria = 500.00;
        double taxa;
        
        if (diarias < 15) {
            taxa = 15.00;
        } else if (diarias == 15) {
            taxa = 10.00;
        } else {
            taxa = 5.00;
        }
        
        double total = (diaria + taxa) * diarias;
        System.out.println("O total a ser pago é: R$ " + total);

        System.exit(0);
    }
}

