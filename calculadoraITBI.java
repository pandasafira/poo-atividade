import javax.swing.JOptionPane;

public class calculadoraITBI {
    public static void main(String[] args) {
        String inputTransacao = JOptionPane.showInputDialog("Digite o valor da transação do imóvel:");
        String inputVenal = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        String inputPercentual = JOptionPane.showInputDialog("Agora digite o percentual do imposto ITBI:");

        double transacaoImovel = Double.parseDouble(inputTransacao);
        double valorVenal = Double.parseDouble(inputVenal);
        double percentualITBI = Double.parseDouble(inputPercentual);

        double maiorValor = Math.max(transacaoImovel, valorVenal);

        double valorImposto = maiorValor * (percentualITBI / 100);

        JOptionPane.showMessageDialog(null, 
            "O imposto ITBI a pagar é: R$ " + valorImposto
        );
    }
}
