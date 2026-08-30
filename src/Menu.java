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
                    return;
                } else {
                   
                    System.out.println("Livro indisponivel!");
                    return;
                }
            }
           
        }
         System.out.println("Livro não encontrado.");
    }

    public static void devolverLivro(){
        System.out.println("Digite o titulo do livro que deseja devolver: ");
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
    
    public static void cadastrarLivro(){
        System.out.println("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano de publicação: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();

        Livro livro = new Livro(titulo,autor,anoPublicacao, true);

        BancoDados.adicionarLivro(livro);

        System.out.println("Livro cadastrado com sucesso!");

    }
    public static void cadastrarUsuario(){
        System.out.println("============== *CADASTRAR USUARIO* ============== ");
        System.out.println("1 - Aluno");
        System.out.println("2 - Funcionario");
        System.out.println("Escolha o tipo de usuario: ");

        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite o e-mail: ");
        String email = scanner.nextLine();

        if (tipo ==1){
            System.out.println("Digite o curso: ");
            String curso = scanner.nextLine();

            System.out.println("Digite a turma: ");
            String turma = scanner.nextLine();

            Aluno aluno = new Aluno(nome, cpf, email, curso,turma);

            BancoDados.adicionarUsuario(aluno);
        }
        else if (tipo == 2){
           System.out.println("Digite o cargo: ");
           String cargo = scanner.nextLine();

           Funcionario funcionario = new Funcionario(nome,cpf,email,cargo);

           BancoDados.adicionarUsuario(funcionario);

        }
        else {
            System.out.println("Opção invalida. ");
            return;
        }
        System.err.println("Usuario Cadastrado com sucesso!");
    }
    public static void exibirMenu() {
    int opcao;

    do {
        System.out.println("\n========== *SISTEMA DA BIBLIOTECA* ==========");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Listar Livros");
        System.out.println("3 - Cadastrar Usuário");
        System.out.println("4 - Listar Usuários");
        System.out.println("5 - Pegar Livro");
        System.out.println("6 - Devolver Livro");
        System.out.println("7 - Sair");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                cadastrarLivro();
                break;

            case 2:
                BancoDados.listarLivros();
                break;

            case 3:
                cadastrarUsuario();
                break;

            case 4:
                BancoDados.listarUsuarios();
                break;

            case 5:
                realizarEmprestimo();
                break;

            case 6:
                devolverLivro();
                break;

            case 7:
                System.out.println("Saindo do sistema...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

    } while (opcao != 7);
}
}