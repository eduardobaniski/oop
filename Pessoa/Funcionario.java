public class Funcionario extends Pessoa {
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double bonificar(){
        return salario * 0.1;
    }    
}
