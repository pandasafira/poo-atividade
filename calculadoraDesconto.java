// calculadora desconto

import java.util.Scanner;

public class calculadoraDesconto {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = dado.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double desconto = dado.nextDouble();

        double valorDesconto = valor * (desconto / 100);

        double precoFinal = valor - valorDesconto;

        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Preço final do produto: R$ " + precoFinal);

        dado.close();
    }

}
