package br.ufjf.lp3;

import javax.swing.JFrame;

/**
 *
 * @author igor
 */
public class Aula03Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaBotoes janela = new JanelaBotoes();
        janela.setSize(240, 240);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
