public class Chefe extends Funcionario {
    private String cargo;

    public Chefe(String nome, String cpf, double salario, String cargo) {
        super(nome, cpf, salario);
        this.cargo = cargo;
    }

    public double bonificar(){  //Sobreposição do método
        return salario * 0.2;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
