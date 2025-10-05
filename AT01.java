import java.util.Scanner;

public class AT01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = input.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
        input.close();
    }
}
