public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;


    public Brownie(String nome,double preco,String sabor)
    {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;

    }

    public void addCarrinhoDeCompras()
    {
        System.out.println("Adicionando" + nome + " ao carrinho");
    }
    public void calculaValorTotalCOmpra()
    {
        System.out.println("Calculando valor total de compra: " + preco);
    }
    public void mostraInfo()
    {
        System.out.println("Nome do produto : " + nome);
        System.out.println("Preço do produto :" + preco);
        System.out.println("Sabor do produto :" + sabor);
    }

    //getter e setter


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
