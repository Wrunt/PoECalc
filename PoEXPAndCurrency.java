/*
 * PoE - XP/Currency % by Level
 * Simple program that gets character level (or levels, in multiplayer) and
 * area level, and determines the % of XP and Currency drops you get.
 */
package poe.xp.and.currency;
import java.awt.*;
import javax.swing.*;

public class PoEXPAndCurrency extends JFrame {
   
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("PoE - XP/Currency % by Level v2.0");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 500));        
        
        frame.getContentPane().setBackground(Color.black);
        frame.getContentPane().setForeground(Color.black);
                
        frame.getContentPane().add(new XPPanel());
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        
        frame.pack();
        frame.setVisible(true);        
    }
}