package TryCatch;

import javax.swing.JOptionPane;

/**
 * ExemploTryCatch
 */
public class ExemploTryCatch {

    public static void main(String[] args) {
        int operacao = 0;
        boolean rodando = true;

        Operacoes soma = new Operacoes();
        Operacoes subtracao = new Operacoes();
        Operacoes multiplicacao = new Operacoes();
        Operacoes divisao = new Operacoes();

        while (rodando) {
             while (operacao != 1 || operacao != 2 || operacao != 3 || operacao != 4); {
                operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma Operação \n 1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão"));
                if (operacao != 1 || operacao != 2 || operacao != 3 || operacao != 4){
                    JOptionPane.showMessageDialog(null, "Operação inválida!");
                } 
            } 

            if (operacao==1) {
                soma.Soma();
            } else if (operacao==2) {
                subtracao.Subtracao();
            } else if (operacao==3) {
                multiplicacao.Multiplicacao();
            } else {
                divisao.Divisao();
            }
        }
    }
}