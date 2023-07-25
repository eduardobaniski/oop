import javax.swing.JOptionPane;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean disponivel = true;
    
    
    
    
    public String toString() {
        return super.toString()+"\nDisponível: " +disponivel;
    }
    public LivroDeBiblioteca(String nome, String autor, int ano) {
        super(nome, autor, ano);
    }
    public void emprestar(){
        try{

            if(!disponivel){
                throw new MinhaExcecao("Ja emprestado");
            }
            else{
                disponivel = false;
            }
        } catch(MinhaExcecao ex){
            JOptionPane.showMessageDialog(null, "Livro já emprestado, não foi possivel realizar o emprestimo");
        }
    }
    public void devolver() {
        try{
            if(!disponivel){
                disponivel = true;
            }
            else{
                throw new MinhaExcecao("Livro não emprestado");
            }
        } catch(MinhaExcecao ex){
            JOptionPane.showMessageDialog(null, "Livro não emprestado, já está disponivel");
        }
    }
    public boolean emprestado(){
        return disponivel;
    }
}
