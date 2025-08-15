import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do teclado.
        Scanner scanner = new Scanner(System.in);

        // --- Primeira Pessoa ---
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine(); // Lê o nome completo.

        System.out.print("Digite a idade de " + nome1 + ": ");
        int idade1 = scanner.nextInt(); // Lê a idade.
        scanner.nextLine(); // Consome a quebra de linha pendente.

        // --- Segunda Pessoa ---
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine(); // Lê o nome completo.

        System.out.print("Digite a idade de " + nome2 + ": ");
        int idade2 = scanner.nextInt(); // Lê a idade.

        // Calcula a diferença de idade, usando Math.abs() para garantir que seja um valor positivo.
        int diferencaIdade = Math.abs(idade1 - idade2);

        // Exibe o resultado.
        System.out.printf("A diferença de idade entre %s e %s é de %d anos.%n", nome1, nome2, diferencaIdade);

        // Fecha o Scanner para liberar os recursos do sistema.
        scanner.close();
    }
}