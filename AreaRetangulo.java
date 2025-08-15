import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do teclado.
        Scanner scanner = new Scanner(System.in);

        // Pede a base do retângulo ao usuário.
        System.out.print("Digite o tamanho da base do retângulo: ");
        // Armazena o valor da base na variável 'base'.
        double base = scanner.nextDouble();

        // Pede a altura do retângulo ao usuário.
        System.out.print("Digite o tamanho da altura do retângulo: ");
        // Armazena o valor da altura na variável 'altura'.
        double altura = scanner.nextDouble();

        // Calcula a área do retângulo usando a fórmula: área = base * altura.
        double area = base * altura;

        // Exibe o resultado, formatando-o para mostrar duas casas decimais.
        System.out.printf("A área do retângulo é: %.2f%n", area);

        // Fecha o Scanner para liberar os recursos do sistema.
        scanner.close();
    }
}