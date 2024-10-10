import java.util.Scanner;

public class ComandosGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o comando Git (clone, fetch, pull): ");
        String comando = sc.next();
        
        switch (comando.toLowerCase()) {
            case "clone":
                System.out.println("git clone: Clona um repositório para o diretório local.");
                System.out.println("Exemplo: git clone https://github.com/user/repo.git");
                break;
            case "fetch":
                System.out.println("git fetch: Obtém as atualizações mais recentes de um repositório remoto.");
                System.out.println("Exemplo: git fetch origin");
                break;
            case "pull":
                System.out.println("git pull: Faz o fetch e merge das alterações em um único comando.");
                System.out.println("Exemplo: git pull origin main");
                break;
            default:
                System.out.println("Comando inválido!");
                break;
        }

        System.exit(0);
    }
}
