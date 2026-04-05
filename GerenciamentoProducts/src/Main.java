import java.util.Scanner;

public class Main {

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        GerenciamentoProdutos gProdutos = new GerenciamentoProdutos();
        boolean continuar = true;
        int quantidade;
        while (continuar){
            String escolha;

            System.out.println("==== GERENCIANDO PRODUTOS ====");
            System.out.println("1. Cadastrar Produto;");
            System.out.println("2. Listar Produto;");
            System.out.println("3. Atualizar Produto;");
            System.out.println("4. Deletar;");
            System.out.println("5. Sair");
            System.out.print("Digite a sua escolha: ");
            escolha = sc.next();

            switch(escolha){
                case "1":
                    System.out.println("Informe a quantidade de produtos que deseja incluir.");
                    quantidade = sc.nextInt();
                    gProdutos.CadastrarProduto(quantidade);
                    break;
                case "2":
                    gProdutos.ListarProdutos();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    System.out.println("Finalizando o programa...");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Favor SELECIONAR uma das OPÇÕES VÁLIDAS...");
                    break;
            }       
        }
        sc.close();

    }
    public static void main() {
        menu();
    }
}