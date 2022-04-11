public class Main {
    public static void main(String[] args) {

        BrownieCafe bCafe = new BrownieCafe("Brownie de Café", 10, "Café");

        BrownieNutella bNutella = new BrownieNutella("Brownie de Nutella", 25, "Nutella");

        BrownieDoceDeLeite bDoceLeite = new BrownieDoceDeLeite("Brownie Doce de Leite", 18, "Doce de leite");

        bDoceLeite.addCarrinhoDeCompras();
        bCafe.addCarrinhoDeCompras();
        bNutella.addCarrinhoDeCompras();

        System.out.println(" ");

        bNutella.adicionarNutella();
        bCafe.adicionarCafe();
        bDoceLeite.adicionarDoceDeLeite();

        System.out.println(" ");

        bCafe.mostraInfo();
        System.out.println(" ");
        bDoceLeite.mostraInfo();
        System.out.println(" ");
        bNutella.mostraInfo();

        System.out.println(" ");

        bNutella.calculaValorTotalCOmpra();
        bCafe.calculaValorTotalCOmpra();
        bDoceLeite.calculaValorTotalCOmpra();



    }
}
