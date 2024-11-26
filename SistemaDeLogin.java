import javax.swing.JOptionPane;

public class SistemaDeLogin {
    public static void main(String[] args) {
        final String usuarioCorreto = "java8";
        final String senhaCorreta = "java8";
        int tentativas = 3;

        while (tentativas-- > 0) {
            String usuario = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido!");
                return; // Sai do programa após login bem-sucedido
            }

            String mensagemErro = "Login ou senha incorretos. Você ainda tem " + tentativas + " tentativa(s).";
            if (tentativas == 0) {
                mensagemErro += "\nAcesso negado.";
            }
            JOptionPane.showMessageDialog(null, mensagemErro);
        }
    }
}