import javax.swing.JOptionPane;

public class LivroDeLivraria extends Livro {
    private float preco;

    public LivroDeLivraria(String nome, String autor, int ano, float preco) {
        super(nome, autor, ano);
        this.preco = preco;
    }
    public String toString(){
        return super.toString()+ "\nPreço: R$"+preco;
    }
    
    public void imprimirPreco(){
        JOptionPane.showMessageDialog(null, "Preço: R$"+preco);
    }
}
