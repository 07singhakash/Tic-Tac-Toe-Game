/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoee2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author hp
 */
public class UserPannel implements ActionListener
{
    JFrame jf;
    JLabel jl1,jl2;
    JTextField jt1,jt2;
    JButton jb;

    UserPannel()
    {
        jf= new JFrame("Tic Tac Toe game by Akash");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        jl1=new JLabel("Enter Player One (X):");
        jl1.setBounds(50, 50, 120, 30);
        jf.add(jl1);
        
        jt1=new JTextField();
        jt1.setBounds(200, 50, 160, 40);
        jf.add(jt1);
        
        jl2=new JLabel("Enter Player two (O):");
        jl2.setBounds(50, 200, 120, 30);
        jf.add(jl2);
        
        jt2=new JTextField();
        jt2.setBounds(200, 200, 160, 40);
        jf.add(jt2);
        
        jb=new JButton("Start Game");
        jb.addActionListener(this);
        jb.setBounds(150, 350, 120, 30);
        jf.add(jb);
        
        jf.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb)
        {
            String player1=jt1.getText();
            String player2=jt2.getText();
            
            GamePannel gp = new GamePannel(player1, player2);
            gp.openGamePannel();
            jf.setVisible(false);
        }
       
    }
}
