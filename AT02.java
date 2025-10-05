import java.util.Scanner;

public class AT02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            usuario = input.nextLine();

            System.out.print("Digite a senha: ");
            senha = input.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário! Tente novamente.\n");
            }
        } while (senha.equals(usuario));

        System.out.println("Cadastro realizado com sucesso!");
        input.close();
    }
}
