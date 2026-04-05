public class GuardaProduto {
String nomeProduto;
int quantidade;
double preco;


     GuardaProduto (String nomeProduto, int quantidade, double preco){
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String toString() {
        return "Nome: " + nomeProduto + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }

}
