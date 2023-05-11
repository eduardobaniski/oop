public class Professor extends Funcionario{
    private int horasAula;

    public int getHorasAula() {
        return horasAula;
    }

    public double calcularBonificacao(){
        return 10*horasAula;
    }
    public double getSalarioComBonificacao(){
        return this.getSalario() + calcularBonificacao();
    }

    public Professor(String nome, Data nascimento, String registro, double salario, int horasAula) {
        super(nome, nascimento, registro, salario);
        this.horasAula = horasAula;
    }

    public Professor(String nome, String telefone, Data nascimento, String registro, double salario, int horasAula) {
        super(nome, telefone, nascimento, registro, salario);
        this.horasAula = horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }
    public String toString(){
        return super.toString() +"\nHoras de aula: "+horasAula;
     }
}
