import javax.swing.JOptionPane;

public class Avaliacao {
    public static void main(String[] args) {
        String inputprova1 = JOptionPane.showInputDialog("Digite a sua primeira nota: ");
        String inputprova2 = JOptionPane.showInputDialog("Digite a sua segunda nota: ");
        String inputTrabalho = JOptionPane.showInputDialog("Digite sua nota do trabalho: ");

        int notaProva1 = Integer.parseInt(inputprova1);
        int notaProva2 = Integer.parseInt(inputprova2);
        int notaTrabalho = Integer.parseInt(inputTrabalho);

        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

        if (media >= 6){
            JOptionPane.showMessageDialog(null, 
            "Parabéns! Você foi aprovado com a média de: " + media);
        }
        else{
            JOptionPane.showMessageDialog(null,
    "Você foi reprovado, tente novamento ano que vem! Média final: " + media);
        }

    }
    
}
