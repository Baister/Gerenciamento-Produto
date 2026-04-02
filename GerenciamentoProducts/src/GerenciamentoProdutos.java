import java.util.ArrayList;
import java.util.Scanner;


public class GerenciamentoProdutos {
    ArrayList <String> listaProduto = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String nomeProduto;
    double preco;

    public void CadastrarProduto(int quantidade) {
        try{
             for (int i = 0; i < quantidade; i++) {
                 System.out.printf("Informe o %d° produto:", i+1);
                    nomeProduto = sc.nextLine();
                    listaProduto.add(nomeProduto);
                 System.out.println("Produto Cadastrado!");
                }
        }catch(Exception error){
            System.out.println("Produto não cadastrado, tente novamente!");
            }
    }

    public void ListarProdutos(){

        try {
            for (String listar : listaProduto) {
                System.out.println(listar);
            }
            System.out.println("Produtos listados com sucesso!");
        }catch (Exception error){
            System.out.println("Erro ao listar, tente novamente!");
            }
        }
}
