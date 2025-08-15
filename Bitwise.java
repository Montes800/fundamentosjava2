public class Main {

    // O método main é static porque deve ser acessível pela JVM sem precisar criar um objeto da classe Main.
    public static void main(String[] args) {
        
        var value1 = 6; // Primeiro número inteiro
        var binary1 = Integer.toBinaryString(value1); // Converte para representação binária

        // System.out.printf → imprime com formatação (placeholders como %s e %d)
        System.out.printf("Primeiro numero da Operação %s (representa binario %s)\n", value1, binary1);

        var value2 = 5; // Segundo número inteiro
        var binary2 = Integer.toBinaryString(value2);

        System.out.printf("Segundo numero da Operação %s (representa binario %s)\n", value2, binary2);

        // Operação bitwise OR (|)
        System.out.printf("%s | %s = %s\n", value1, value2, value1 | value2);

        var result = value1 | value2; // Resultado da operação
        var binaryResult = Integer.toBinaryString(result); // Converte resultado para binário

        System.out.printf("%s | %s = %s (representação binaria %s)\n", value1, value2, result, binaryResult);
    }

    /*
      Observações sobre a operação OR (|):
      - 6 em binário = 110
      - 5 em binário = 101
      - OR compara bit a bit:
            1 1 0
          | 1 0 1
          --------
            1 1 1  → que é 7 em decimal
    */
}
