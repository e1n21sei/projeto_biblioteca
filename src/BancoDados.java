import java.util.ArrayList;
public class BancoDados {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public BancoDados(){
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
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

}