public class Comprador {

    private String nome;
    private double saldo;


    public Comprador(String nome,double saldo)
    {
        this.nome  = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie)
    {
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCOmpra();
        System.out.println("Cliante comprou um " + brownie.getNome());
    }


}
