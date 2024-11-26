import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        String sexoStr = JOptionPane.showInputDialog("Digite seu sexo (M/F):").toUpperCase();
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        int anosContribuicao = Integer.parseInt(JOptionPane.showInputDialog("Digite os anos de contribuição:"));

        if (sexoStr.equals("M")) {
            verificarAposentadoriaMasculina(idade, anosContribuicao);
        } else if (sexoStr.equals("F")) {
            verificarAposentadoriaFeminina(idade, anosContribuicao);
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inválido. Por favor, insira 'M' para masculino ou 'F' para feminino.");
        }
    }

    private static void verificarAposentadoriaMasculina(int idade, int anosContribuicao) {
        if (idade >= 65 || anosContribuicao >= 35) {
            JOptionPane.showMessageDialog(null, "Você já pode se aposentar!");
        } else {
            int anosFaltandoIdade = 65 - idade;
            int anosFaltandoContribuicao = 35 - anosContribuicao;
            String mensagem = "Você não pode se aposentar ainda.\n";
            mensagem += "Faltam " + anosFaltandoIdade + " anos para aposentadoria por idade.\n";
            mensagem += "Faltam " + anosFaltandoContribuicao + " anos para aposentadoria por tempo de contribuição.";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    private static void verificarAposentadoriaFeminina(int idade, int anosContribuicao) {
        if (idade >= 62 || anosContribuicao >= 30) {
            JOptionPane.showMessageDialog(null, "Você já pode se aposentar!");
        } else {
            int anosFaltandoIdade = 62 - idade;
            int anosFaltandoContribuicao = 30 - anosContribuicao;
            String mensagem = "Você não pode se aposentar ainda.\n";
            mensagem += "Faltam " + anosFaltandoIdade + " anos para aposentadoria por idade.\n";
            mensagem += "Faltam " + anosFaltandoContribuicao + " anos para aposentadoria por tempo de contribuição.";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}