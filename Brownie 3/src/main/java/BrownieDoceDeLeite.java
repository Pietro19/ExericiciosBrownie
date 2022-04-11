public class BrownieDoceDeLeite extends Brownie{


    public BrownieDoceDeLeite(String nome,double preco,String sabor)
    {
        super(nome,preco,sabor);
    }

    public void adicionarDoceDeLeite()
    {
        System.out.println(" + DoceDeLeite");
    }

    @Override
    public void addCarrinhoDeCompras()
    {
        System.out.println("Adicionando brownie de doce de leite");
    }

}
