import java.util.Scanner; // Importando o Scanner — ferramenta pra capturar o que o usuário digita no teclado

public class Main {
    public static void main(String[] args) {
        
        // Scanner é o leitor de input. Ele fica ali esperando o que o user vai digitar.
        Scanner scanner = new Scanner(System.in);

        // Solta a pergunta na tela — direto ao ponto
        System.out.println("Você é maior de idade?");

        // Recebe a idade digitada (tipo: 17, 18, etc)
        int age = scanner.nextInt();

        // Mais uma pergunta na sequência
        System.out.println("Você é emancipado?");

        // Captura se a pessoa digitou true ou false — boolean vibes
        var isEmancipated = scanner.nextBoolean();

        // Aqui vem a lógica: pode dirigir se for maior de idade (18+)
        // OU se for emancipado E tiver pelo menos 16 anos
        // || = OU → só precisa que UMA das condições seja true
        // && = E → precisa que AMBAS as condições sejam true
        boolean canDrive = age >= 18 || (isEmancipated && age >= 16);

        // Exibe se a pessoa pode dirigir com base nas condições acima
        System.out.printf("Você pode dirigir? %s%n", canDrive ? "Sim" : "Não");

        // Fecha o Scanner — evita deixar recursos abertos à toa (boas práticas sempre)
        scanner.close();
    }
}


System.out.printf("true && true  = %s\n", true && true);   // true
// Ambas as condições são verdadeiras -> resultado é true

System.out.printf("true && false = %s\n", true && false);  // false
// Uma das condições é falsa -> resultado é false

System.out.printf("false && false = %s\n", false && false); // false
// Ambas são falsas -> resultado é false

System.out.printf("false && true  = %s\n", false && true);  // false
// Uma é falsa -> resultado é false


