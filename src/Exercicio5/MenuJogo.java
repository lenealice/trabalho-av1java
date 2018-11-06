package Exercicio5;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuJogo extends JFrame{
    
    public MenuJogo() {
        configurarJanela();
        inicializarComponentes();
        
    }
    
    public void configurarJanela() {
        setSize(350,300);
        setTitle("Jogo da Memória");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        JLabel texto1 = new JLabel("JOGO DA MEMÓRIA");
        texto1.setBounds(100, 10, 150, 30);
        
        JLabel texto = new JLabel("Nome Jogador");
        texto.setBounds(100, 60, 150, 30);
        
        JTextField inputX = new JTextField();
        inputX.setColumns(10);
        inputX.setBounds(100, 90, 150, 30);
        
        JButton botao = new JButton("Novo Jogo");
        botao.setBounds(100, 170, 120, 30);
        botao.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //new JogoDaMemoria().setVisible(true);  
                setVisible(false);
            }
        });
        
        Container container = getContentPane();
        container.setLayout(null);
        
        container.add(texto1);
        container.add(texto);
        container.add(inputX);
        container.add(botao);
    }
}
