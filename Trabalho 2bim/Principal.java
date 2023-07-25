import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Livro l[] = new Livro[2];
        l[0] = new LivroDeBiblioteca("The Art of War", "Sun Tzu", 1080);
        l[1] = new LivroDeLivraria("The Last Wish", "Andrzej Sapkowski", 1993, (float)9.99);
        try {
            l[1].avaliar();
            l[1].imprimirPreco();
            l[0].avaliar();
            l[0].emprestar(); //Empréstimo pela 1a vez      
            JOptionPane.showMessageDialog(null, l[0].toString());
            JOptionPane.showMessageDialog(null, l[1].toString());
        }  catch(MinhaExcecao ex){
            JOptionPane.showMessageDialog(null, "ERRO: "+ex.getMessage());
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um numero inteiro");
        }
    }
}
