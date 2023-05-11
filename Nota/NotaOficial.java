public class NotaOficial extends Nota {
    protected String cpf;

    

    public NotaOficial(String nome, double valor, String cpf) {
        super(nome, valor);
        this.cpf = cpf;
    }

    public void desconto(){
        this.valor *= 0.9;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
