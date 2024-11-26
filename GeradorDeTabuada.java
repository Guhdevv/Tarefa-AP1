import javax.swing.JOptionPane;

public class GeradorDeTabuada {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número para ver a tabuada:");
        int numero = Integer.parseInt(input);
        StringBuilder tabuada = new StringBuilder("Tabuada do " + numero + ":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }

        JOptionPane.showMessageDialog(null, tabuada.toString());
    }
}