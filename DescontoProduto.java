import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o preço do produto: R$ ");
        double valorProduto = scanner.nextDouble();


        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();


        double valorDesconto = (porcentagemDesconto / 100) * valorProduto;


        double precoFinal = valorProduto - valorDesconto;


        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final do produto: R$ %.2f%n", precoFinal);

       
        scanner.close();
    }
}