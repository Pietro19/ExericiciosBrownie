public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome,double preco,String sabor)
    {
        super(nome,preco,sabor);
    }

    public void adicionarNutella()
    {
        System.out.println(" + Nutella");
    }

    @Override
    public void addCarrinhoDeCompras()
    {
        System.out.println("Adicionando brownie de nutella");
    }


}
