public class BrownieCafe extends Brownie{


    public BrownieCafe(String nome,double preco,String sabor)
    {
        super(nome,preco,sabor);
    }

    public void adicionarCafe()
    {
        System.out.println(" + Café");
    }

    @Override
    public void addCarrinhoDeCompras()
    {
        System.out.println("Adicionando brownie de café");
    }


}
