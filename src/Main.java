import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        int opcao;
        while (true) {

            System.out.print("-> Sistema de Gestão Comercial Integrado <-\n" +
                    "1 - Cadastrar produto\n" +
                    "2 - Listar produtos\n" +
                    "3 - Atualizar quantidade\n" +
                    "4 - Remover produto\n" +
                    "5 - Sair\n" +
                    "> ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("Nome do produto: ");
                    String nome = input.nextLine();
                    System.out.print("Descriço do produto: ");
                    String descricao = input.nextLine();
                    System.out.print("Quantidade do produto: ");
                    int quantidade = input.nextInt();
                    input.nextLine();

                    produtos.add(new Produto(nome, descricao, quantidade));

                    break;

                case 2:
                    System.out.print("========================================\n" +
                            "          LISTA DE PRODUTOS\n" +
                            "========================================\n");

                    for (int i = 0; i < produtos.size(); i++) {

                    }

                    break;
            }
        }
    }
}