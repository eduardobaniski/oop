public class Funcionario extends Pessoa {
    private String registro;
    private double salario;

    public double bonificar(){
        return this.salario * 0.1;
    }
    public double getSalarioComBonificacao(){
        return this.salario + bonificar();
    }
    
    public String getRegistro() {
        return registro;
    }
    public Funcionario(String nome, Data nascimento, String registro, double salario) {
        super(nome, nascimento);
        this.registro = registro;
        this.salario = salario;
    }
    public Funcionario(String nome, String telefone, Data nascimento, String registro, double salario) {
        super(nome, telefone, nascimento);
        this.registro = registro;
        this.salario = salario;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String toString(){
        return super.toString()+"\nRegistro: "+registro+"\nSalário: "+salario;
      }
      

}
