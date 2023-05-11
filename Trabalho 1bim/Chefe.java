public class Chefe extends Funcionario {
    private String cargo;

    public Chefe(String nome, Data nascimento, String registro, double salario, String cargo) {
        super(nome, nascimento, registro, salario);
        this.cargo = cargo;
    }

    public Chefe(String nome, String telefone, Data nascimento, String registro, double salario, String cargo) {
        super(nome, telefone, nascimento, registro, salario);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double bonificar(){
        return this.getSalario() * 0.2;
    }
    public double getSalarioComBonificacao(){
        return getSalario() + bonificar();
    }
    public String toString(){
        return super.toString() +"\nCargo: "+cargo;
     }
}
