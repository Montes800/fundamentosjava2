import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class Main { // Classe principal do programa
    public static void main(String[] args) { // Método principal, ponto de entrada do programa
        var scanner = new Scanner(System.in); // Cria um objeto Scanner para capturar a entrada do usuário

        System.out.println("Informe o primeiro número:"); // Solicita o primeiro número ao usuário
        var value1 = scanner.nextInt(); // Lê o primeiro número digitado

        System.out.println("Informe o segundo número:"); // Solicita o segundo número ao usuário
        var value2 = scanner.nextInt(); // Lê o segundo número digitado

        // Exibe a soma dos dois números. O uso de %d é mais adequado para inteiros.
        System.out.printf("%d + %d = %d\n", value1, value2, value1 + value2);

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}