import java.util.ArrayList;
public class BancoDados {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public BancoDados(){
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();

    }
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
}
