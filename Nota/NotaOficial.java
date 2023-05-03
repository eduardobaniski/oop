public class NotaOficial extends Nota {
    private String cpf;

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
