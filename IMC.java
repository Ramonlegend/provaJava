import java.util.Scanner;

class Pessoa {
    private double altura;
    private double peso;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean calculeIMC() {
        double imc = peso / (altura * altura);
        return imc > 24.9; // Retorna true se a pessoa estiver com sobrepeso
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Encerrar programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double altura, peso;

                    // Entrada da altura
                    System.out.print("Digite a altura da pessoa (em metros): ");
                    altura = scanner.nextDouble();
                    pessoa.setAltura(altura);

                    // Entrada do peso com validação
                    do {
                        System.out.print("Digite o peso da pessoa (em kg): ");
                        peso = scanner.nextDouble();
                        if (peso < 0 || peso > 200) {
                            System.out.println("Peso inválido, digite novamente.");
                        }
                    } while (peso < 0 || peso > 200);
                    pessoa.setPeso(peso);

                    // Verificação do IMC
                    if (pessoa.calculeIMC()) {
                        System.out.println("SOBREPESO");
                    } else {
                        System.out.println("PESO_NORMAL");
                    }
                    break;

                case 2:
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
