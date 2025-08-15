import java.time.LocalDate; // Importa a classe LocalDate para obter a data atual.
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário.

public class Main {

    public static void main(String[] args) {
        // Obtém o ano atual do sistema.
        var baseYear = LocalDate.now().getYear();

        // Cria um objeto Scanner para receber a entrada do teclado.
        var scanner = new Scanner(System.in);

        // Pede ao usuário que digite seu nome e armazena na variável 'name'.
        System.out.println("Digite o seu nome: ");
        var name = scanner.next();

        // Pede o ano de nascimento e armazena na variável 'year'.
        System.out.println("Informe seu ano de nascimento: ");
        var year = scanner.nextInt();

        // Calcula a idade subtraindo o ano de nascimento do ano atual.
        var age = baseYear - year;

        // Imprime a mensagem final, usando os valores de 'name' e 'age'.
        // %s é para string e %d é para número inteiro.
        System.out.printf("Olá %s, você tem %d anos \n", name, age);

        // Fecha o objeto Scanner para liberar os recursos.
        scanner.close();
    }
}