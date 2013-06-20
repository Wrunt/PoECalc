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
        frame.setTitle("PoE - XP/Currency % by Level v 1.2");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,500));
        
        JLabel splash = new JLabel(new ImageIcon("pathofexile512.png"));
        splash.setLayout(new BorderLayout());
        frame.setContentPane(splash);
        
        frame.getContentPane().add(new XPPanel());
        
        frame.pack();
        frame.setVisible(true);        
    }
}