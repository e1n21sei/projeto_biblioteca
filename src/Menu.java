import java.util.Scanner;
public class Menu{
    private static Scanner scanner = new Scanner(System.in);

    public static void realizarEmprestimo() {
        

        System.out.println("Digite o título do livro que deseja pegar: ");

        String titulo = scanner.nextLine();

        for (Livro livro : BancoDados.getLivros()) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {

                if (livro.isDisponibilidade()) {
                    livro.emprestar();

                    System.out.println("Empréstimo realizado com sucesso.");
                } else {
                   
                    System.out.println("Livro indisponivel!");
                    return;
                }
            }
            System.out.println("Livro não encontrado.");
        }
    }

    public static void devolverLivro(){
        System.out.println("Digite o titulo do livro que deseja remover: ");
        String titulo = scanner.nextLine();

        for (Livro livro : BancoDados.getLivros()){

            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livro.devolver();
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado!.");
    }
    
}