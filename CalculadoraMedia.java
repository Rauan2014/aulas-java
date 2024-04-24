import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        // Criação do objeto Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a primeira nota
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        // Solicita ao usuário que digite a segunda nota
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Calcula a média das duas notas
        double media = (nota1 + nota2) / 2;

        // Exibe a média ao usuário
        System.out.println("A média das notas " + nota1 + " e " + nota2 + " é: " + media);

        // Fechar o objeto Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
