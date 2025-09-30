import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.println("Digite o número para ver a sua tabuada: ");
        int numeroTabu = dado.nextInt();
        for(int n = 0; n < 11; n++){
            int valor = numeroTabu * n;
            System.out.printf("%d X %d = %d\n",numeroTabu, n, valor);
        }
        dado.close();
    }
}
