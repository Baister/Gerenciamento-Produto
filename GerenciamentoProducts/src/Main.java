import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void menu(){
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        SistemaProdutos sistemaAtacadao = new SistemaProdutos();

        while(continuar){
            try {
                System.out.println("\n---- MENU ATACADÃO ----");
                System.out.println("1. Cadastrar produto;");
                System.out.println("2. Listar produto;");
                System.out.println("3. Atualizar produto;");
                System.out.println("4. Deletar produto;");
                System.out.println("5. Sair.");
                System.out.print("Digite uma opção: ");
                int opcao = sc.nextInt();
                switch (opcao){
                    case 1:
                        sistemaAtacadao.cadastrarProduto();
                        break;
                    case 2:
                        sistemaAtacadao.listarProduto();
                        break;
                    case 3:
                        sistemaAtacadao.atualizarProduto();
                        break;
                    case 4:
                        sistemaAtacadao.deletarProduto();
                        break;
                    case 5:
                        System.out.println("\nFinalizando...");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Favor selecionar uma OPÇÃO VÁLIDA!");
                        break;
                }
            }catch (InputMismatchException e){
                sc.next();
                System.err.println("Valor inválido!");
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
