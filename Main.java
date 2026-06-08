import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ViolaoRegistry fabrica = new ViolaoRegistry();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bem-vindo à Fábrica de Violões (Shallow Clone) ===");
        System.out.println("Opções disponíveis: Classico, Folk, Flet, Jumbo, 7Cordas, 12Cordas, Zero, DuploZero, TriploZero");
        System.out.print("Digite o modelo que deseja produzir (digite exatamente como escrito acima): ");
        
        String escolha = scanner.nextLine();
        Violao violaoCliente = fabrica.getViolao(escolha);

        if (violaoCliente != null) {
            System.out.println("\nSucesso! Seu violão foi clonado do protótipo:");
            violaoCliente.exibirInfo();
        } else {
            System.out.println("\nErro: Modelo '" + escolha + "' não encontrado no catálogo.");
        }

        scanner.close();
    }
}