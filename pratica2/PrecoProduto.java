import java.util.Scanner;

public class PrecoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o código do produto (1 a 5): ");
        int codigo = sc.nextInt();
        
        if (codigo == 1) {
            System.out.println("Produto: Sapato - Preço: R$ 99,99");
        } else if (codigo == 2) {
            System.out.println("Produto: Bolsa - Preço: R$ 103,89");
        } else if (codigo == 3) {
            System.out.println("Produto: Camisa - Preço: R$ 49,98");
        } else if (codigo == 4) {
            System.out.println("Produto: Calça - Preço: R$ 89,72");
        } else if (codigo == 5) {
            System.out.println("Produto: Blusa - Preço: R$ 97,35");
        } else {
            System.out.println("Código inválido!");
        }
    }
}

