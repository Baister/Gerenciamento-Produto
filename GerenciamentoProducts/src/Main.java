import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
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
            case "2":
            case "3":
            case "4":
            case "5":
            default:
                System.out.println("Favor selecionar uma das escolhas corretas");
        }


    }

}
