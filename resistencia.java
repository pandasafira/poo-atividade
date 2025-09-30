import java.util.Scanner;

public class resistencia {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.println("Valor resistência 1: ");
        double R1 = dado.nextDouble();
        System.out.println("Valor resistência 2: ");
        double R2 = dado.nextDouble();
        System.out.println("Valor resistência 3: ");
        double R3 = dado.nextDouble();
        System.out.println("Valor resistência 4: ");
        double R4 = dado.nextDouble();

        double emSerie = R1 + R2 + R3 + R4;
        double[] resistencias = { R1, R2, R3, R4 };

        double maior = resistencias[0];
        for (double r : resistencias) {
            if (r > maior) {
                maior = r;
            }
        }
        System.out.println("A resistência maior é no valor de: " + maior);

        double menor = resistencias[0];
        for (double r : resistencias) {
            if (r < menor) {
                menor = r;
            }
        }
        System.out.println("A menor resistência é: " + menor);
        dado.close();

    }
}
