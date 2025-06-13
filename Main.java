import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[10];
        int contador = 0;
        boolean continuar = true;

        while (continuar && contador < 10) {
            System.out.println("\nCadastro " + (contador + 1) + ":");
            
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite o sobrenome: ");
            String sobrenome = scanner.nextLine();

            if (contador > 0) {
                String nomeAnterior = pessoas[contador - 1].getNome() + pessoas[contador - 1].getSobrenome();
                String nomeAtual = nome + sobrenome;
                if (nomeAnterior.equalsIgnoreCase(nomeAtual)) {
                    continuar = false;
                    continue;
                }
            }

            System.out.print("Digite a data de nascimento (DD/MM/AAAA): ");
            String dataStr = scanner.nextLine();
            String[] partesData = dataStr.split("/");
            Data dataNascimento = new Data(
                Integer.parseInt(partesData[0]),
                Integer.parseInt(partesData[1]),
                Integer.parseInt(partesData[2])
            );

            System.out.print("Digite a altura (em metros): ");
            double altura = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite o peso (em kg): ");
            double peso = Double.parseDouble(scanner.nextLine());

            pessoas[contador] = new Pessoa(nome, sobrenome, dataNascimento, altura, peso);
            pessoas[contador].CalculaIMC();
            contador++;
        }

        System.out.println("\n=== Dados Cadastrados ===");
        for (int i = 0; i < contador; i++) {
            System.out.println("\nCadastro " + (i + 1) + ":");
            System.out.println("Nome completo: " + pessoas[i].getNomeCompleto());
            System.out.println("Nome de referência: " + pessoas[i].getNomeReferencia());
            System.out.println("Idade: " + pessoas[i].calculaIdade());
            System.out.println("Peso: " + pessoas[i].getPeso());
            System.out.println("Altura: " + pessoas[i].getAltura());
            System.out.println("IMC: " + String.format("%.2f", pessoas[i].getImc()));
            System.out.println("Classificação: " + pessoas[i].InformaObesidade());
        }

        scanner.close();
    }
} 