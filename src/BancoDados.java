import java.util.ArrayList;
public class BancoDados {
    private static ArrayList<Livro> livros;
    private static ArrayList<Usuario> usuarios;

    public static void inicializarBancoDados(){
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();

       Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, true);
        adicionarLivro(livro1);

        Livro livro2 = new Livro("A Hora da Estrela", "Clarice Lispector", 1977, true);
        adicionarLivro(livro2);

        Livro livro3 = new Livro("Vidas Secas", "Graciliano Ramos", 1938, true);
        adicionarLivro(livro3);

        Livro livro4 = new Livro("Capitães da Areia", "Jorge Amado", 1937, true);
        adicionarLivro(livro4);

        Livro livro5 = new Livro("O Cortiço", "Aluísio Azevedo", 1890, true);
        adicionarLivro(livro5);


    }
    public static void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public static void buscarLivro(Livro livro){
        if (livro.isDisponibilidade()){
            System.out.println("O livro está disponível para empréstimo!.");}
            else {
                System.out.println("O livro está indisponivel no momento! Tente novamente mais tarde.");
            }
        }

        public static void listarLivros(){
            for(Livro livro : livros){
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano de publicação: " + livro.getanoPublicacao());
                System.out.println("Disponibilidade: " + livro.isDisponibilidade());
                System.out.println("============================================="); 
            }

        }
        public static void listarUsuarios() {
            for (Usuario usuario : usuarios){
                usuario.listarInformacoes();
            System.out.println("=============================================");
            }
        }
    }

