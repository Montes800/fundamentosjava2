import java.util.Scanner; // Importa a classe Scanner, necessária para ler a entrada do usuário.

public class AreaQuadrado {
    public static void main(String[] args) {

        // Cria um objeto Scanner para receber a entrada do teclado.
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem para o usuário, pedindo o tamanho do lado do quadrado.
        System.out.print("Digite o tamanho do lado do quadrado: ");

        // Lê o valor do lado, que pode ser um número decimal, e armazena na variável 'lado'.
        double lado = scanner.nextDouble();

        // Calcula a área usando a fórmula: lado * lado.
        double area = lado * lado;

        // Exibe o resultado na tela, formatando para mostrar duas casas decimais.
        System.out.printf("A área do quadrado é: %.2f%n", area);

        // Fecha o objeto Scanner para liberar os recursos do sistema.
        scanner.close();
    }
}