public class main {
    public static void main(String[] args) {
        Produto vet;
        vet = new Produto("igor", 1, 50.99);
        vet.imprimir();
        vet.vender(2);
        vet.imprimir();
    }
}