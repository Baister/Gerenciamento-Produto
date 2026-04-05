import java.util.ArrayList;
import java.util.Scanner;


public class GerenciamentoProdutos {
    ArrayList <GuardaProduto> listaProduto = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String nome;
    int qtd;
    double preco;


    public void CadastrarProduto(int quantidade) {
        try{
             for (int i = 0; i < quantidade; i++) {
                 System.out.printf("Informe o nome do %d° produto: ", i+1);
                 nome = sc.nextLine();

                 System.out.printf("Informe a quantidade do %d° produto: ", i+1);
                 qtd = sc.nextInt();

                 System.out.printf("Informe o preço do %d° produto: ", i+1);
                 preco = sc.nextDouble();

                 listaProduto.add(new GuardaProduto(nome, qtd, preco));
                 sc.nextLine();
                 System.out.println("Produto Cadastrado!");
                }
        }catch(Exception error){
            System.out.println("Produto não cadastrado, tente novamente!");
            }
    }

    public void ListarProdutos(){

        try {
            for (GuardaProduto listar : listaProduto) {
                System.out.println(listar);
            }
            System.out.println("Produtos listados com sucesso!");
        }catch (Exception error){
            System.out.println("Erro ao listar, tente novamente!");
            }
        }
}
