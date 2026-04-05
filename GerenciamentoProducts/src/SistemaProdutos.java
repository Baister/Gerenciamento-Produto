import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaProdutos {
    Scanner sc = new Scanner(System.in);
    ArrayList<Produto> sistemaProduto = new ArrayList<>();

    void cadastrarProduto(){
        try{
            System.out.println("\n---- Cadastrando Produto ----\n");
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = sc.next();
            System.out.print("Digite o preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Digite a quantidade do produto: ");
            int quantidadeProduto = sc.nextInt();

            sistemaProduto.add(new Produto(nomeProduto, precoProduto, quantidadeProduto));
        }catch(InputMismatchException e){
            sc.next();
            System.out.println("Favor digitar o VALOR CORRETO!");
        }

    }

    void listarProduto(){
        System.out.println("\n---- Listando Produtos ----");
        for(Produto produto:sistemaProduto){
            System.out.printf("\nDescrição: %s | Preço: R$%s | Quantidade: %s\n", produto.nome, produto.preco, produto.quantidade);
        }
    }

    void atualizarProduto(){
        boolean continuar = true;

        while (continuar){
            System.out.println("\n---- Atualizando Produto ----");
            System.out.println("1. Descrição Produto;");
            System.out.println("2. Preço Produto;");
            System.out.println("3. Quantidade Produto;");
            System.out.println("4. Sair;");

            try{
                System.out.print("Digite o que deseja alterar:");
                int opcao = sc.nextInt();

                switch (opcao){
                    case 1:
                        atualizaNome();
                        break;
                    case 2:
                        atualizaPreco();
                        break;
                    case 3:
                        atualizaQuantidade();
                        break;
                    case 4:
                        System.out.println("\nSaindo da atualização...");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Favor selecionar uma das opções VÁLIDAS!");
                }
            }catch (InputMismatchException e){
                sc.next();
                System.err.println("Valor inválido!");
            }
        }
    }

    Produto buscaProduto(){
        System.out.println("============================");
        System.out.print("\nDigite o nome do produto: ");
        String nomeProduto = sc.next();

        for (Produto produto:sistemaProduto){
            if(produto.nome.equalsIgnoreCase(nomeProduto)){
                System.out.println("Produto encontrando com sucesso!");
                return produto;
            }
        }
        System.out.println("Produto não encontrado...");
        return null;
    }

    void atualizaNome(){
        Produto produtoAlterar = buscaProduto();
        if(produtoAlterar != null){
            System.out.print("Digite a nova descrição:");
            produtoAlterar.nome = sc.next();
            System.out.println("Descrição alterada com sucesso!\n");
        }

    }
    void atualizaPreco(){
        Produto produtoAlterar = buscaProduto();
        if (produtoAlterar != null){
            System.out.print("Digite o novo preço: R$");
            double novoPreco = sc.nextDouble();
            if(novoPreco > 0){
                produtoAlterar.preco = novoPreco;
                System.out.println("Preço alterado com sucesso!");
            }else {
                System.out.println("Preço inválido!");
            }

        }

    }
    void atualizaQuantidade(){
        Produto produtoAlterar = buscaProduto();
        if (produtoAlterar != null){
            System.out.print("Digite a nova quantidade:");
            int novaQuantidade = sc.nextInt();
            if (novaQuantidade > 0){
                produtoAlterar.quantidade = novaQuantidade;
                System.out.println("Quantidade alterada com sucesso!");
            }else {
                System.out.println("Quantidade inválida!");
            }

        }
    }

    void deletarProduto(){
        Produto produtoDeletar = buscaProduto();
        if (produtoDeletar != null){
            sistemaProduto.remove(produtoDeletar);
            System.out.println("Produto deletado com sucesso!");
        }

    }

}
