package Exercicio4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuJogoDaVelha extends JFrame{
    
    public MenuJogoDaVelha() {
        configurarJanela();
        inicializarComponentes();
        
    }
    
    public void configurarJanela() {
        setSize(350,300);
        setTitle("Jogo da Velha");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        JLabel texto = new JLabel("Nome Jogador X");
        texto.setBounds(100, 30, 150, 30);
        
        JTextField inputX = new JTextField();
        inputX.setColumns(10);
        inputX.setBounds(100, 60, 150, 30);
        
        JLabel texto2 = new JLabel("Nome Jogador O");
        texto2.setBounds(100, 90, 150, 30);
        
        JTextField inputO = new JTextField();
        inputO.setColumns(10);
        inputO.setBounds(100, 120, 150, 30);
        
        JButton botao = new JButton("Novo Jogo");
        botao.setBounds(100, 170, 120, 30);
        botao.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new JogoDaVelha().setVisible(true);  
                setVisible(false);
            }
        });
        
        Container container = getContentPane();
        container.setLayout(null);
        
        container.add(texto);
        container.add(inputX);
        container.add(texto2);
        container.add(inputO);
        container.add(botao);
    }
}
