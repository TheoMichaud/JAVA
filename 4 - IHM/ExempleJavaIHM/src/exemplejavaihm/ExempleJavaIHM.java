/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package exemplejavaihm;

import java.awt.*;
import javax.swing.*;


public class ExempleJavaIHM extends JFrame {
    private JButton b1;
    private JButton b2;
    
    public static void main(String[] args) {
        ExempleJavaIHM that = new ExempleJavaIHM();
        that.pack(); //change taille du Frame pour englober boutons
        that.setVisible(true);
    }
    
    public ExempleJavaIHM() {
        super("Notre exemple d'IHM");
        setLayout(new FlowLayout());
        b1 = new JButton("Appuyer");
        b2 = new JButton("Ne pas appuyer");
        Container content = getContentPane();
        content.add(b1);
        content.add(b2);
    }
    
}
