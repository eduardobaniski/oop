class ContaCorrente{
    private String nome;
    private int numero, agencia;
    private double saldo, limite;
    public ContaCorrente(String nome, int numero, int agencia, double saldo, double limite){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
    }

    public ContaCorrente(String nome, int numero, int agencia, double saldo){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public ContaCorrente(String nome, int numero, int agencia){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }

    public String getNome(){
        return this.nome;
    }
    public int getNumero(){
        return this.numero;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public double getLimite(){
        return this.limite;
    }
}