import javax.swing.JOptionPane;

public class login {
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Digite o seu usuario: ");       
        String senhaOficial = "java8";          
        int tentativa = 0;

        while (tentativa < 3) {
            String senha = JOptionPane.showInputDialog("Digite a sua senha empresarial: ");
            if (senha.equals(senhaOficial)){
                JOptionPane.showMessageDialog(null,
                "Bem-vindo " +  usuario);
                break;
            }
            else if (senha == null){
                break;
            }
            else{
                tentativa ++;
                JOptionPane.showMessageDialog(null, 
                String.format("Senha incorreta, tente novamente! Tentativa %d de 3!", tentativa));
                continue;
                
            }
        }
    }
}
