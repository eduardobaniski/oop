public class Aluno extends Pessoa {
    private String ra;
    private int disciplinas;
    private boolean matricula = false;
    public Aluno(String nome, String telefone, Data nascimento, String ra) {
        super(nome, telefone, nascimento);
        this.ra = ra;
    }
    public Aluno(String nome, Data nascimento, String ra) {
        super(nome, nascimento);
        this.ra = ra;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public int getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(int disciplinas) {
        this.disciplinas = disciplinas;
    }
    public void matricular(int num){
        this.matricula = true;
        this.disciplinas += num;
    }
    
    public double getCargaSemanal(){
        return this.disciplinas * 4;
    }
    public String toString(){
        return super.toString()+"\nRA: "+ra;
      }
}
