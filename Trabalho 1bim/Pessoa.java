
public class Pessoa {
    private String nome, telefone;
    private Data nascimento;

    

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    public Pessoa(String nome, String telefone, Data nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Data getNascimento() {
        return nascimento;
    }
    public void setNascimento(Data nascimento) {
        if(nascimento.getAno() > 2023){
            System.out.println("Data invalida");
            return;
        }
        this.nascimento = nascimento;
    }

    public String toString(){
        return "Nome: "+nome+"\nTelefone: "+telefone+"\nData de nascimento: "+nascimento;
      }
    
}
