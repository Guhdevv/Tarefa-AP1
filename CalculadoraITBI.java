import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {

        String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor da transação:");
        double valorTransacao = Double.parseDouble(valorTransacaoStr);


        String valorVenalStr = JOptionPane.showInputDialog("Digite o valor do imóvel:");
        double valorVenal = Double.parseDouble(valorVenalStr);


        String porcentagemStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto:");
        double porcentagemITBI = Double.parseDouble(porcentagemStr) / 100;


        double maiorValor = Math.max(valorTransacao, valorVenal);
        double impostoITBI = maiorValor * porcentagemITBI;


        String mensagem = String.format("Valor de Transação: R$ %.2f%nValor Venal: R$ %.2f%nImposto ITBI: R$ %.2f", valorTransacao, valorVenal, impostoITBI);
        JOptionPane.showMessageDialog(null, mensagem, "Resultado do Cálculo do ITBI", JOptionPane.INFORMATION_MESSAGE);
    }
}