import java.util.Scanner;

public class calculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        int IdadeMinimaMulher = 59;
        int IdadeMinimaHomem = 65;
        int anosContribuirMulher = 30;
        int anosContribuirHomem = 35;

        System.out.println("Digite a sua idade: ");
        int idade = dado.nextInt();

        System.out.println("Digite seu sexo com F ou M: ");
        char sexo = Character.toUpperCase(dado.next().charAt(0));

        System.out.print("Digite quantos anos de contribuição você tem: ");
        int anos = dado.nextInt();
        
        if (sexo == 'F') {
            int faltaContribuicao = anosContribuirMulher - anos;
            int faltaIdade = IdadeMinimaMulher - idade;

            if (faltaContribuicao <= 0 && faltaIdade <= 0) {
                System.out.println("Você já pode se aposentar!");
            } else if (faltaContribuicao > 0 && faltaIdade > 0) {
                System.out.println("Necessário aguardar ter " + IdadeMinimaMulher + " anos ou mais e contribuir mais " + faltaContribuicao + " anos!");
            } else if (faltaContribuicao > 0) {
                System.out.println("Necessário contribuir mais " + faltaContribuicao + " anos!");
            } else { // faltaIdade > 0
                System.out.println("Necessário aguardar ter " + IdadeMinimaMulher + " anos!");
            }

        } else if (sexo == 'M') {
            int faltaContribuicao = anosContribuirHomem - anos;
            int faltaIdade = IdadeMinimaHomem - idade;

            if (faltaContribuicao <= 0 && faltaIdade <= 0) {
                System.out.println("Você já pode se aposentar!");
            } else if (faltaContribuicao > 0 && faltaIdade > 0) {
                System.out.println("Necessário aguardar ter " + IdadeMinimaHomem + " anos ou mais e contribuir mais " + faltaContribuicao + " anos!");
            } else if (faltaContribuicao > 0) {
                System.out.println("Necessário contribuir mais " + faltaContribuicao + " anos!");
            } else { // faltaIdade > 0
                System.out.println("Necessário aguardar ter " + IdadeMinimaHomem + " anos!");
            }

        } else {
            System.out.println("Sexo inválido! Digite apenas F ou M.");
        }

        dado.close();
    }
}
