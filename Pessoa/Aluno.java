public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String cpf, String curso){
        super(nome, cpf);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
