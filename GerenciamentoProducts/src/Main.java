import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciamentoProdutos gProdutos = new GerenciamentoProdutos();
        Scanner sc = new Scanner(System.in);
        int quantidade;
        int opcaoUsuario;
        boolean continuarRodando = true;

        System.out.println("Bem vindo ao gerenciamento de proudutos!");
do {
    System.out.println("Escolha uma dessas opções abaixo:");
    System.out.println("1- Cadastrar produto.");
    System.out.println("2- Listar produto.");
    System.out.println("0- Encerrar programa.");
    opcaoUsuario = sc.nextInt();

    switch (opcaoUsuario) {
        case 1:
            System.out.println("Informe a quantidade de produtos que deseja incluir.");
            quantidade = sc.nextInt();
            gProdutos.CadastrarProduto(quantidade);
            break;
        case 2:
            gProdutos.ListarProdutos();
            break;
        case 0:
            continuarRodando = false;
            break;
        default:
            System.out.println("Opção incorreta!");
    }
}while(continuarRodando);

    }
}
