public class Aluno extends Usuario {
   private String curso;
   private String turma;

    public void setCurso(String curso){
    this.curso = curso;
   }

    public String getCurso(){
    return curso;
   }

   public void setTurma(String turma){
    this.curso = turma;
   }

    public String getTurma(){
    return turma;
   }

   public Aluno(String nome,String cpf, String email, String curso, String turma){
    super(nome,cpf,email);
    this.curso = curso;
    this.turma = turma;
   }

    @Override
   public void listarInformacoes(){

   } 
}
