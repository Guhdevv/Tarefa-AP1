import javax.swing.JOptionPane;

public class AvaliacaoSistema {
    public static void main(String[] args) {
        String primeiraNotaStr = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        String segundaNotaStr = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        String notaTrabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");

        double primeiraNota = Double.parseDouble(primeiraNotaStr);
        double segundaNota = Double.parseDouble(segundaNotaStr);
        double notaTrabalho = Double.parseDouble(notaTrabalhoStr);

        double mediaFinal = (primeiraNota + segundaNota + notaTrabalho) / 3;

        String status;
        if (mediaFinal >= 6) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }

        JOptionPane.showMessageDialog(null, "Média: " + mediaFinal + "\nSituação: " + status);
    }
}