public class Produto{
    private String nome;
    private double preco;
    private int qtd;

    public Produto(String nome, int qtd, double preco){
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void vender(int qtd){
        if(this.qtd >= qtd){
            this.qtd -= qtd;
        }
    }

    public void comprar(int qtd){
        this.qtd += qtd;
    }
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Preco: "+this.preco);
        System.out.println("Qtd: "+this.qtd);
    }
}