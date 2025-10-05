import java.util.Scanner;

public class AT05 {
    
    public static double lerNumeroPositivo(Scanner scanner, String mensagem) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Por favor, insira um número positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            double populacaoA = lerNumeroPositivo(scanner, "Digite a população inicial do país A: ");
            double populacaoB = lerNumeroPositivo(scanner, "Digite a população inicial do país B: ");
            double taxaCrescimentoA = lerNumeroPositivo(scanner, "Digite a taxa de crescimento anual do país A (em %): ") / 100;
            double taxaCrescimentoB = lerNumeroPositivo(scanner, "Digite a taxa de crescimento anual do país B (em %): ") / 100;

            int anos = 0;
            while (populacaoA < populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA; // Crescimento da população A
                populacaoB += populacaoB * taxaCrescimentoB; // Crescimento da população B
                anos++; // Incrementa o contador de anos
            }

            System.out.println("\nNúmero de anos necessários para a população do país A ultrapassar ou igualar a do país B: " + anos);
            System.out.printf("População de A: %.0f\n", populacaoA);
            System.out.printf("População de B: %.0f\n", populacaoB);

            System.out.print("\nDeseja calcular novamente? (s para sim, qualquer outra tecla para não): ");
            scanner.nextLine(); // Consumir o newline restante
            String resposta = scanner.nextLine().toLowerCase();

            if (!resposta.equals("s")) {
                continuar = false;
            }
        }

        System.out.println("Obrigado por usar o programa!");
        scanner.close();
    }
}
