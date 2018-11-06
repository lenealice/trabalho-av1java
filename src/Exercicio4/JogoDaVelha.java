package Exercicio4;

import Exercicio4.MenuJogoDaVelha;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JogoDaVelha extends JFrame implements ActionListener{
    
    public final String TITULO = "Jogo da Velha";
    private final int LARGURA = 600;
    private final int ALTURA = 600;
    public String jogador = "X"; 
    JPanel pan;
    JButton btn;
    Component[] btns;
    
    public JogoDaVelha() {
        configurar();
        inicializar();
        menuNav();
    }
    
    private void menuNav() {
        
        JMenuBar menuNav = new JMenuBar();
        setJMenuBar(menuNav);
        
        JMenu menuOpcao = new JMenu("Opções");
        
        JMenuItem itemVoltar = new JMenuItem("Voltar");
        JMenuItem itemSair = new JMenuItem("Sair");
        
        menuNav.add(menuOpcao);
        
        menuOpcao.add(itemVoltar);
        menuOpcao.add(itemSair);
        
        itemVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MenuJogoDaVelha().setVisible(true);  
                setVisible(false);
        }
    });
        
        itemSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    });
    }
    
    public void configurar() {
        setTitle(this.TITULO);
        setSize(this.LARGURA, this.ALTURA);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       JButton Jbtn = ((JButton)ae.getSource());
       if(Jbtn.getText().isEmpty()){
       Jbtn.setText(trocarJogador());
       verificarVitoria();
       Jbtn.setFont(new Font("Courier New", Font.BOLD, 128));
       
       }
        if(verificarVelha()){
            JOptionPane.showMessageDialog(this, "Deu velha");
        }
       
    }

    private void inicializar() {
         pan = new JPanel();
        pan.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
            btn = new JButton();
            btn.setName(String.format("%d", i));
            btn.addActionListener(this);
           pan.add(btn);
            
        }
        add(pan);
     

        
    }
    
    public void verificarVitoria(){
        //horizontal
        if(verificarIguais(0, 1, 2)){
        JOptionPane.showMessageDialog(this, String.format("Jogador %s ganhou", jogador));
         }
        if(verificarIguais(3, 4, 5)){
        JOptionPane.showMessageDialog(this, String.format("Jogador %s ganhou", jogador));
         }
        if(verificarIguais(6, 7, 8)){
        JOptionPane.showMessageDialog(this, String.format("Jogador %s ganhou", jogador));
         }
        //vertical
        if(verificarIguais(0, 3, 6)){
        JOptionPane.showMessageDialog(this, String.format("Jogador %s ganhou", jogador));
         }
        if(verificarIguais(1, 4, 7)){
        JOptionPane.showMessageDialog(this, String.format("Jogador %s ganhou", jogador));
         }
        if(verificarIguais(2, 5, 8)){
        JOptionPane.showMessageDialog(this, String.format("Jogador %s ganhou", jogador));
         }
        //diagonal
        if(verificarIguais(0, 4, 8)){
        JOptionPane.showMessageDialog(this, String.format("Jogador %s ganhou", jogador));
         }
        if(verificarIguais(2, 4, 6)){
        JOptionPane.showMessageDialog(this, String.format("Jogador %s ganhou", jogador));
         }
       
    }
    
    public Boolean verificarIguais(int pos1,int pos2,int pos3){
        btns =    pan.getComponents();
        String celula1 = ((JButton)btns[pos1]).getText();
        String celula2 = ((JButton)btns[pos2]).getText();
        String celula3 = ((JButton)btns[pos3]).getText();
        boolean isVazio = (celula1.isEmpty() && celula2.isEmpty() && celula3.isEmpty());
        boolean isIgual = (celula1.equals(celula2) && celula2.equals(celula3));
        return  !isVazio && isIgual;
        
    }
    
    public Boolean verificarVelha(){
        boolean isVelha = true;
        for(int i=0;i<btns.length;i++){
            
            if (((JButton)btns[i]).getText().isEmpty()){
                isVelha = false;
            }
        }
        return isVelha;
    }
    public String trocarJogador(){
        if(jogador == "X"){
           jogador = "O";
        }else{
            jogador = "X";
        }
        return jogador;
    }
}
