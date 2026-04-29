import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList produtos = new ArrayList();

        int opcao;

        do {
            System.out.println("\n========================================");
            System.out.println("   SISTEMA DE LISTA DE COMPRAS");
            System.out.println("========================================");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Remover item pelo nome");
            System.out.println("3 - Consultar item pelo nome");
            System.out.println("4 - Exibir todos os itens");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = input.nextLine();

                    System.out.print("Quantidade do produto: ");
                    int quantidade = input.nextInt();
                    input.nextLine();

                    Produto novoProduto = new Produto(nome, quantidade);
                    produtos.add(novoProduto);

                    System.out.println("Produto cadastrado com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite o nome do produto que deseja remover: ");
                    String nomeRemover = input.nextLine();

                    boolean removido = false;

                    for (int i = 0; i < produtos.size(); i++) {
                        Produto produto = (Produto) produtos.get(i);

                        if (produto.getNome().equalsIgnoreCase(nomeRemover)) {
                            produtos.remove(i);
                            removido = true;
                            System.out.println("Produto removido com sucesso.");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do produto que deseja consultar: ");
                    String nomeConsulta = input.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < produtos.size(); i++) {
                        Produto produto = (Produto) produtos.get(i);

                        if (produto.getNome().equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("\nProduto encontrado:");
                            System.out.println("Nome: " + produto.getNome());
                            System.out.println("Quantidade: " + produto.getQuantidade());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n========================================");
                    System.out.println("         LISTA DE PRODUTOS");
                    System.out.println("========================================");

                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (int i = 0; i < produtos.size(); i++) {
                            Produto produto = (Produto) produtos.get(i);

                            System.out.println((i + 1) + ". Nome: " + produto.getNome());
                            System.out.println("   Quantidade: " + produto.getQuantidade());
                            System.out.println("----------------------------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        input.close();
    }
}