import javax.swing.JOptionPane;

public abstract class Livro {
    private String nome, autor;
    private int ano, avaliacao;
    public Livro(String nome, String autor, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }
    public void imprimirPreco(){}
    public void emprestar(){}
    public void devolver(){}

    public void avaliar()throws MinhaExcecao{
        
            avaliacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a avaliação do livro "+nome+", de "+autor));
            if(avaliacao > 10 || avaliacao < 0){
                throw new MinhaExcecao("Numero invalido");
            }
        
       
        
    }

    public String toString() {
        return "Nome=" + nome + "\n Autor=" + autor + "\n Ano=" + ano + "\n Avaliacao=" + avaliacao;
    }
    
}
