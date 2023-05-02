package ContaCorrente;
public class ContaCorrente {
    private int numero, agencia;
    private double saldo;  
    private String nome;
    
    

    public ContaCorrente(int numero, int agencia, double saldo, String nome) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nome = nome;
    }
    
    public ContaCorrente(int numero, int agencia, String nome) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
      
}