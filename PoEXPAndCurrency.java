/*
 * PoE - XP/Currency % by Level
 * Simple program that gets character level (or levels, in multiplayer) and
 * area level, and determines the % of XP and Currency drops you get.
 */
package poe.xp.and.currency;
import java.awt.*;
import javax.swing.*;

public class PoEXPAndCurrency {

    public static void main(String[] args) {
        JFrame frame = new JFrame ("PoE - XP/Currency % by Level v 1.0");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400,350));
        
        frame.getContentPane().add(new XPPanel());
        
        frame.pack();
        frame.setVisible(true);        
    }
}
