package TryCatch;

import javax.swing.JOptionPane;

public class Operacoes {
    int n1, n2;

    public void Soma() {
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            JOptionPane.showMessageDialog(null, "O resultado da soma dos numeros é: " + (n1 + n2));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO - Valor digitado nao e um numero inteiro!");
        }
    }

    public void Subtracao() {
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            JOptionPane.showMessageDialog(null, "O resultado da subtração dos numeros é: " + (n1 - n2));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO - Valor digitado nao e um numero inteiro!");
        }
    }

    public void Multiplicacao() {
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            JOptionPane.showMessageDialog(null, "O resultado da multiplicação dos numeros é: " + (n1 * n2));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO - Valor digitado nao e um numero inteiro!");
        }
    }

    public void Divisao() {
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            JOptionPane.showMessageDialog(null, "O resultado da divisão dos numeros é: " + (n1 / n2));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERRO - Valor digitado nao e um numero inteiro!");
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Não dividirás por Zero!");
        }
    }
}
