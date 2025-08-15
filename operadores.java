// Classe principal do programa
public class Main {

    // O método main é o ponto de entrada do programa em Java.
    // static → significa que este método pertence à classe e não a um objeto específico.
    // Isso permite que o Java execute este método sem precisar criar uma instância (objeto) da classe Main.
    // void → indica que o método não retorna nenhum valor.
    // String[] args → parâmetro que pode receber argumentos passados pela linha de comando.
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar entradas do teclado.
        // "var" permite inferência de tipo (o compilador entende que scanner é do tipo Scanner).
        var scanner = new java.util.Scanner(System.in);

        // System → classe que fornece acesso a recursos do sistema.
        // .out → é um campo (objeto) de saída padrão, geralmente o console.
        // println → método que imprime o texto no console e pula para a próxima linha.
        System.out.println("Digite o primeiro numero: ");

        // Lê um número inteiro digitado pelo usuário e armazena em value1.
        var value1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        var value2 = scanner.nextInt();

        // printf → imprime texto formatado.
        // %s → espaço reservado (placeholder) para inserir valores como String.
        // "\n" → quebra de linha.
        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);

        // Comentário de lógica:
        // O operador % (módulo) poderia ser usado para obter o resto de uma divisão inteira.
        // Exemplo: 10 % 3 retorna 1, pois 10 dividido por 3 sobra 1.
    }
}
