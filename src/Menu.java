import java.util.Scanner;
public class Menu{
    public static void realizarEmprestimo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do livro que deseja pegar: ");

        String titulo = scanner.nextLine();

        for (Livro livro : BancoDados.getLivros()) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponibilidade()) {
                    livro.emprestar();

                    System.out.println("Empréstimo realizado com sucesso.");
                } else {
                    return;
                }
            }
            System.out.println("Livro não encontrado.");
        }
        scanner.close();
    }
    
}