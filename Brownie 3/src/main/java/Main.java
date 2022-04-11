public class Main {
    public static void main(String[] args) {

        BrownieCafe bCafe = new BrownieCafe("Brownie de Café", 10, "Café");

        BrownieNutella bNutella = new BrownieNutella("Brownie de Nutella", 25, "Nutella");

        BrownieDoceDeLeite bDoceLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 18, "Doce de leite");

        Comprador comprador = new Comprador("cliente", 50.00);

        comprador.efetuarCompra(bCafe);
        comprador.efetuarCompra(bNutella);
        comprador.efetuarCompra(bDoceLeite);

    }
}
