package br.ufjf.lp3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author igor
 */
public class JanelaBotoes extends JFrame{
    JButton btnSimples = new JButton("Clique-me!");
    JButton btnEnfeitado = new JButton("Clique-me também!");
    
    public JanelaBotoes() {
        super("Botões");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        btnEnfeitado.setIcon(new ImageIcon("resources/sad.gif"));
        btnEnfeitado.setRolloverIcon(new ImageIcon("resources/lol.gif"));
        btnEnfeitado.setPressedIcon(new ImageIcon("resources/lol.gif"));
        add(btnSimples);
        add(btnEnfeitado);
        btnSimples.addActionListener(new BotaoClicado());
        btnEnfeitado.addActionListener(new BotaoClicado());
    }

    private class BotaoClicado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btnSimples){
                JOptionPane.showMessageDialog(null, "O botão simples foi clicado!", "Botão Simples", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "O botão enfeitado foi clicado!", "Botão Enfeitado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    
}
