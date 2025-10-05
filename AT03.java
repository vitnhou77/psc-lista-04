import java.util.Scanner;

public class AT03 {

    public static String obterNome(Scanner scanner) {
        String nome;
        while (true) {
            System.out.print("Digite seu nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
            if (nome.length() > 3) {
                return nome;
            } else {
                System.out.println("Nome inválido. O nome deve ter mais de 3 caracteres.");
            }
        }
    }

    public static int obterIdade(Scanner scanner) {
        int idade;
        while (true) {
            System.out.print("Digite sua idade (entre 0 e 150): ");
            try {
                idade = Integer.parseInt(scanner.nextLine());
                if (idade >= 0 && idade <= 150) {
                    return idade;
                } else {
                    System.out.println("Idade inválida. A idade deve estar entre 0 e 150.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido para a idade.");
            }
        }
    }

    public static double obterSalario(Scanner scanner) {
        double salario;
        while (true) {
            System.out.print("Digite seu salário (maior que 0): ");
            try {
                salario = Double.parseDouble(scanner.nextLine());
                if (salario > 0) {
                    return salario;
                } else {
                    System.out.println("Salário inválido. O salário deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido para o salário.");
            }
        }
    }

    public static char obterSexo(Scanner scanner) {
        char sexo;
        while (true) {
            System.out.print("Digite seu sexo ('f' para feminino ou 'm' para masculino): ");
            sexo = scanner.nextLine().toLowerCase().charAt(0);
            if (sexo == 'f' || sexo == 'm') {
                return sexo;
            } else {
                System.out.println("Sexo inválido. Digite 'f' para feminino ou 'm' para masculino.");
            }
        }
    }

    public static char obterEstadoCivil(Scanner scanner) {
        char estadoCivil;
        while (true) {
            System.out.print("Digite seu estado civil ('s' para solteiro, 'c' para casado, 'v' para viúvo, 'd' para divorciado): ");
            estadoCivil = scanner.nextLine().toLowerCase().charAt(0);
            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
                return estadoCivil;
            } else {
                System.out.println("Estado civil inválido. Digite 's', 'c', 'v' ou 'd'.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = obterNome(scanner);
        int idade = obterIdade(scanner);
        double salario = obterSalario(scanner);
        char sexo = obterSexo(scanner);
        char estadoCivil = obterEstadoCivil(scanner);

        System.out.println("\nInformações cadastradas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + (estadoCivil == 's' ? "Solteiro" :
                estadoCivil == 'c' ? "Casado" :
                        estadoCivil == 'v' ? "Viúvo" : "Divorciado"));
    }
}
