import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira os dados da pessoa:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Altura (em metros, ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Peso (em kg, ex: 70.5): ");
        double peso = scanner.nextDouble();

        scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

        pessoa.CalculaIMC();

        System.out.println("\n--- Resultado do IMC ---");
        System.out.printf("Nome Completo: %s %s\n", pessoa.getNome(), pessoa.getSobrenome());
        System.out.printf("IMC: %.2f\n", pessoa.getImc());
        System.out.printf("Classificação Corporal: %s\n", pessoa.InformaObesidade());

        scanner.close();
    }
} 