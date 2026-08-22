public class Livro implements Disponibilidade {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

     public void setTitulo(String titulo){
    this.titulo = titulo;
   }

    public String getTitulo(){
    return titulo;
    }

     public void setAutor(String autor){
    this.autor = autor;
   }

    public String getAutor(){
    return autor;
   }

    public void setanoPublicacao(int anoPublicacao){
    this.anoPublicacao = anoPublicacao;
   }

    public int getanoPublicacao(){
    return anoPublicacao;
   }

   public boolean isDisponibilidade(){
    return disponibilidade;
   }

   public void setDisponibilidade(boolean disponibilidade){
    this.disponibilidade = disponibilidade;
   }

   public Livro(String titulo, String autor, int anoPublicacao, boolean disponibilidade){
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.disponibilidade = disponibilidade;
   }

    @Override
    public void emprestar(){
        disponibilidade = false;
    }

    @Override
    public void devolver(){
        disponibilidade = true;
    }

}
