import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar nome");
            System.out.println("2. Remover nome");
            System.out.println("3. Consultar tamanho da lista");
            System.out.println("4. Pesquisar nome na lista");
            System.out.println("5. Imprimir lista");
            System.out.println("6. Limpar lista");
            System.out.println("7. Encerrar programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a ser adicionado: ");
                    String nomeAdicionar = scanner.nextLine();
                    nomes.add(nomeAdicionar);
                    System.out.println("Nome adicionado com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite o nome a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    if (nomes.remove(nomeRemover)) {
                        System.out.println("Nome removido com sucesso.");
                    } else {
                        System.out.println("Nome não encontrado na lista.");
                    }
                    break;

                case 3:
                    System.out.println("Tamanho da lista: " + nomes.size());
                    break;

                case 4:
                    System.out.print("Digite o nome a ser pesquisado: ");
                    String nomePesquisar = scanner.nextLine();
                    if (nomes.contains(nomePesquisar)) {
                        System.out.println("Nome encontrado na lista.");
                    } else {
                        System.out.println("Nome não encontrado na lista.");
                    }
                    break;

                case 5:
                    System.out.println("Lista de nomes:");
                    for (String nome : nomes) {
                        System.out.println(nome);
                    }
                    break;

                case 6:
                    nomes.clear();
                    System.out.println("Lista limpa com sucesso.");
                    break;

                case 7:
                    continuar = false;
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
