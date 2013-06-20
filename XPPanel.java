package poe.xp.and.currency;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class XPPanel extends JPanel {
    public JLabel playerLevelM, mp1, mp2, mp3, mp4, mp5, areaLevelM;
    public JLabel xpM, currencyM;
    public JTextField pLM, player1, player2, player3, player4, player5, aLM;
    public JSlider slider;
    public JButton mGen, sGen;
    public JPanel mc1, mc2, mc3, mc4, mc5, mc6, mc7, mc8, mc9, mc10, sGenPanel;
    public JPanel controls2;
    
    public Color color1 = new Color(0, 0, 0);
    public Color color2 = new Color(255, 255, 255);
    
    public XPPanel() {
        playerLevelM = new JLabel ("Player Level:");
        playerLevelM.setBackground(color1);
        playerLevelM.setOpaque(true);
        playerLevelM.setForeground(color2);
        pLM = new JTextField ("");
        pLM.setBackground(color2);
        pLM.setBorder(null);
        pLM.setForeground(color1);
        areaLevelM = new JLabel ("Area Level:");
        areaLevelM.setBackground(color1);
        areaLevelM.setOpaque(true);
        areaLevelM.setForeground(color2);
        aLM = new JTextField ("");
        aLM.setBackground(color2);
        aLM.setBorder(null);
        aLM.setForeground(color1);
        mp1 = new JLabel ("Party Member 1:");
        mp1.setBackground(color1);
        mp1.setOpaque(true);
        mp1.setForeground(color2);
        player1 = new JTextField("0");
        player1.setBackground(color2);
        player1.setBorder(null);
        player1.setForeground(color1);
        mp2 = new JLabel ("Party Member 2:");
        mp2.setBackground(color1);
        mp2.setOpaque(true);
        mp2.setForeground(color2);
        player2 = new JTextField("0");
        player2.setBackground(color2);
        player2.setBorder(null);
        player2.setForeground(color1);
        mp3 = new JLabel ("Party Member 3:");
        mp3.setBackground(color1);
        mp3.setOpaque(true);
        mp3.setForeground(color2);
        player3 = new JTextField("0");
        player3.setBackground(color2);
        player3.setBorder(null);
        player3.setForeground(color1);
        mp4 = new JLabel ("Party Member 4:");
        mp4.setBackground(color1);
        mp4.setOpaque(true);
        mp4.setForeground(color2);
        player4 = new JTextField("0");
        player4.setBackground(color2);
        player4.setBorder(null);
        player4.setForeground(color1);
        mp5 = new JLabel ("Party Member 5:");
        mp5.setBackground(color1);
        mp5.setOpaque(true);
        mp5.setForeground(color2);
        player5 = new JTextField("0");
        player5.setBackground(color2);
        player5.setBorder(null);
        player5.setForeground(color1);
        sGen = new JButton ("Update Amounts");
        mGen = new JButton ("Update Amounts");
        xpM = new JLabel ("Experience Awarded: ");
        xpM.setBackground(color1);
        xpM.setOpaque(true);
        xpM.setForeground(color2);
        currencyM = new JLabel ("Currency Awarded: ");
        currencyM.setBackground(color1);
        currencyM.setOpaque(true);
        currencyM.setForeground(color2);
        
        Dimension d = xpM.getPreferredSize();  
        playerLevelM.setPreferredSize(new Dimension(d.width,d.height));
        pLM.setPreferredSize(new Dimension(50,d.height));
        areaLevelM.setPreferredSize(new Dimension(d.width,d.height));
        aLM.setPreferredSize(new Dimension(50,d.height));
        mp1.setPreferredSize(new Dimension(d.width,d.height));
        player1.setPreferredSize(new Dimension(50,d.height));
        mp2.setPreferredSize(new Dimension(d.width,d.height));
        player2.setPreferredSize(new Dimension(50,d.height));
        mp3.setPreferredSize(new Dimension(d.width,d.height));
        player3.setPreferredSize(new Dimension(50,d.height));
        mp4.setPreferredSize(new Dimension(d.width,d.height));
        player4.setPreferredSize(new Dimension(50,d.height));
        mp5.setPreferredSize(new Dimension(d.width,d.height));
        player5.setPreferredSize(new Dimension(50,d.height));
        xpM.setPreferredSize(new Dimension(d.width+150,d.height));
        currencyM.setPreferredSize(new Dimension(d.width+150,d.height));
             
        ButtonListenerS listenerS = new ButtonListenerS();
        sGen.addActionListener (listenerS);
        ButtonListenerM listenerM = new ButtonListenerM();
        mGen.addActionListener (listenerM);
        
        JLabel lSlider = new JLabel("Number of players in party:");
        lSlider.setForeground(color2);
        
        slider = new JSlider (JSlider.HORIZONTAL, 1, 6, 1);
        slider.setMajorTickSpacing (1);
        slider.setPaintTicks (true);
        slider.setPaintLabels (true);
        slider.setForeground(color2);
        slider.setBackground(color1);
        
        SlideListenerM listener = new SlideListenerM();
        slider.addChangeListener(listener);
        
        mc1 = new JPanel();
        mc1.add(playerLevelM);
        mc1.add(pLM);
        mc2 = new JPanel();
        mc2.add(areaLevelM);
        mc2.add(aLM);
        JPanel slidecontrol1 = new JPanel();
        slidecontrol1.add(lSlider);
        JPanel slidecontrol2 = new JPanel();
        slidecontrol2.add(slider);
        mc3 = new JPanel();
        mc3.add(mp1);
        mc3.add(player1);
        mc4 = new JPanel();
        mc4.add(mp2);
        mc4.add(player2);
        mc5 = new JPanel();
        mc5.add(mp3);
        mc5.add(player3);
        mc6 = new JPanel();
        mc6.add(mp4);
        mc6.add(player4);
        mc7 = new JPanel();
        mc7.add(mp5);
        mc7.add(player5);
        sGenPanel = new JPanel();
        sGenPanel.add(sGen);
        mc8 = new JPanel();
        mc8.add(mGen);
        mc9 = new JPanel();
        mc9.add(xpM);
        mc10 = new JPanel();
        mc10.add(currencyM);
        
        mc1.setBackground(color1);
        mc2.setBackground(color1);
        slidecontrol1.setBackground(color1);
        slidecontrol2.setBackground(color1);
        mc3.setBackground(color1);
        mc4.setBackground(color1);
        mc5.setBackground(color1);
        mc6.setBackground(color1);
        mc7.setBackground(color1);
        sGenPanel.setBackground(color1);
        mc8.setBackground(color1);
        mc9.setBackground(color1);
        mc10.setBackground(color1);
        
        controls2 = new JPanel();
        BoxLayout layout = new BoxLayout (controls2, BoxLayout.Y_AXIS);
        controls2.setLayout (layout);
        controls2.add(mc1);
        controls2.add(mc2);
        controls2.add(slidecontrol1);
        controls2.add(slidecontrol2);
        controls2.add(mc3);
        controls2.add(mc4);
        controls2.add(mc5);
        controls2.add(mc6);
        controls2.add(mc7);
        controls2.add(sGenPanel);
        controls2.add(mc8);
        controls2.add(mc9);
        controls2.add(mc10);
        controls2.setBackground(color1);
        
        mc3.setVisible(false);
        mc4.setVisible(false);
        mc5.setVisible(false);
        mc6.setVisible(false);
        mc7.setVisible(false);
        mc8.setVisible(false);
        sGenPanel.setVisible(true);
        
        JLabel splash1 = new JLabel(new ImageIcon("PoELogo.jpg"));
        splash1.setAlignmentX(Component.LEFT_ALIGNMENT);
        JLabel splash2 = new JLabel(new ImageIcon("PoELogo.jpg"));
        splash2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        JLabel spacer = new JLabel("                                                                                                    "
                + "                                ");
        spacer.setBackground(color1);
        spacer.setForeground(color1);
        spacer.setPreferredSize(new Dimension(400,d.height));
        JPanel splashPanel1 = new JPanel();
        BoxLayout layout1 = new BoxLayout (splashPanel1, BoxLayout.X_AXIS);
        splashPanel1.setLayout (layout1);
        splashPanel1.add(splash1);
        splashPanel1.add(spacer);
        splashPanel1.add(splash2);
        splashPanel1.setBackground(color1);
        controls2.add(splashPanel1);
        
        controls2.setBackground(color1);
        controls2.setForeground(color1);
        controls2.setBorder(null);
        controls2.setOpaque(false);
        
        controls2.setPreferredSize(new Dimension(500, 500));
               
        add(controls2);
        
        setOpaque(false);
    }
    
    public class SlideListenerM implements ChangeListener {
        
        public void stateChanged (ChangeEvent event) {
            switch (slider.getValue()) {
                case 1:
                    mc3.setVisible(false);
                    mc4.setVisible(false);
                    mc5.setVisible(false);
                    mc6.setVisible(false);
                    mc7.setVisible(false);
                    player1.setText("0");
                    player2.setText("0");
                    player3.setText("0");
                    player4.setText("0");
                    player5.setText("0");
                    mc8.setVisible(false);
                    sGenPanel.setVisible(true);
                    break;
                case 2:
                    mc3.setVisible(true);
                    mc4.setVisible(false);
                    mc5.setVisible(false);
                    mc6.setVisible(false);
                    mc7.setVisible(false);
                    player1.setText("");
                    player2.setText("0");
                    player3.setText("0");
                    player4.setText("0");
                    player5.setText("0");
                    mc8.setVisible(true);
                    sGenPanel.setVisible(false);
                    break;
                case 3:
                    mc3.setVisible(true);
                    mc4.setVisible(true);
                    mc5.setVisible(false);
                    mc6.setVisible(false);
                    mc7.setVisible(false);
                    player1.setText("");
                    player2.setText("");
                    player3.setText("0");
                    player4.setText("0");
                    player5.setText("0");
                    mc8.setVisible(true);
                    sGenPanel.setVisible(false);
                    break;
                case 4:
                    mc3.setVisible(true);
                    mc4.setVisible(true);
                    mc5.setVisible(true);
                    mc6.setVisible(false);
                    mc7.setVisible(false);
                    player1.setText("");
                    player2.setText("");
                    player3.setText("");
                    player4.setText("0");
                    player5.setText("0");
                    mc8.setVisible(true);
                    sGenPanel.setVisible(false);
                    break;
                case 5:
                    mc3.setVisible(true);
                    mc4.setVisible(true);
                    mc5.setVisible(true);
                    mc6.setVisible(true);
                    mc7.setVisible(false);
                    player1.setText("");
                    player2.setText("");
                    player3.setText("");
                    player4.setText("");
                    player5.setText("0");
                    mc8.setVisible(true);
                    sGenPanel.setVisible(false);
                    break;
                case 6:
                    mc3.setVisible(true);
                    mc4.setVisible(true);
                    mc5.setVisible(true);
                    mc6.setVisible(true);
                    mc7.setVisible(true);
                    player1.setText("");
                    player2.setText("");
                    player3.setText("");
                    player4.setText("");
                    player5.setText("");
                    mc8.setVisible(true);
                    sGenPanel.setVisible(false);
                    break;
            }
            
            
        }
    }
    
    public class ButtonListenerS implements ActionListener {
        private int pi, check;
        private double area, player, curr, xp, ED;
        private String as, ps;
        
        public void actionPerformed (ActionEvent event) {
            as = aLM.getText();
            area = Double.parseDouble(as);
            ps = pLM.getText();
            pi = Integer.parseInt(ps);
            player = Double.parseDouble(ps);
            
            for (ED = 3; pi >= 16; ED++) {
                pi = pi - 16;
            }
            ED = player - (ED + area);
            
            if (ED <= 0) {
                check = 1;
            }
            
            ED = Math.pow(ED, 2.5);
            xp = (player + 5) / (player + 5 + ED);
            xp = Math.pow(xp, 1.5);
            if (check == 1) {
                xp = 1;
            }
            xp = xp * 100;
            xp = (double)(Math.round(xp*1000))/1000;
            
            if (area > 68) {
                curr = 100;
            } else if (area + 2 >= player) {
                curr = 100;
            } else if (player > 68) {
                curr = 100 - (2.5 * (68 - (area + 2)));
                curr = (double)(Math.round(curr*1000))/1000;
            } else {
                curr = 100 - (2.5 * (player - (area + 2)));
                curr = (double)(Math.round(curr*1000))/1000;
            }
            
            xpM.setText("Experience Awarded: " + xp + "%");
            currencyM.setText("Currency Awarded:   " + curr + "%");
        }
    }
    
    public class ButtonListenerM implements ActionListener {
        private int pi, check;
        private double area, player, p1, p2, p3, p4, p5, curr, xp, ED, pSize;
        private double pShare, p1Share, p2Share, p3Share, p4Share, p5Share, allShare;
        private double partyMult;
        private String as, ps, p1s, p2s, p3s, p4s, p5s;
        
        public void actionPerformed (ActionEvent event) {
            pSize = 6;
            
            p1s = player1.getText();
            p1 = Double.parseDouble(p1s);
            if (p1 == 0) {
                pSize--;
            }
            p2s = player2.getText();
            p2 = Double.parseDouble(p2s);
            if (p2 == 0) {
                pSize--;
            }
            p3s = player3.getText();
            p3 = Double.parseDouble(p3s);
            if (p3 == 0) {
                pSize--;
            }
            p4s = player4.getText();
            p4 = Double.parseDouble(p4s);
            if (p4 == 0) {
                pSize--;
            }
            p5s = player5.getText();
            p5 = Double.parseDouble(p5s);
            if (p5 == 0) {
                pSize--;
            }
            
            as = aLM.getText();
            area = Double.parseDouble(as);
            ps = pLM.getText();
            pi = Integer.parseInt(ps);
            player = Double.parseDouble(ps);
            
            for (ED = 3; pi >= 16; ED++) {
                pi =- 16;
            }
            ED = player - (ED + area);
            if (ED <= 0) {
                check = 1;
            }
            
            pShare = player + 10;
            pShare = Math.pow(pShare, 2.71);
            if (p1 == 0) {
                p1Share = 0;
            } else {
                p1Share = p1 + 10;
                p1Share = Math.pow(p1Share, 2.71);
            }
            if (p2 == 0) {
                p2Share = 0;
            } else {
                p2Share = p2 + 10;
                p2Share = Math.pow(p2Share, 2.71);
            }
            if (p3 == 0) {
                p3Share = 0;
            } else {
                p3Share = p3 + 10;
                p3Share = Math.pow(p3Share, 2.71);
            }
            if (p4 == 0) {
                p4Share = 0;
            } else {
                p4Share = p4 + 10;
                p4Share = Math.pow(p4Share, 2.71);
            }
            if (p5 == 0) {
                p5Share = 0;
            } else {
                p5Share = p5 + 10;
                p5Share = Math.pow(p5Share, 2.71);
            }
            
            allShare = pShare + p1Share + p2Share + p3Share + p4Share + p5Share;
            partyMult = pShare/allShare;         
            
            ED = Math.pow(ED, 2.5);
            xp = (player + 5) / (player + 5 + ED);
            xp = Math.pow(xp, 1.5);
            if (check == 1) {
                xp = 1;
            }
            xp = xp * 1.3;
            xp = xp * partyMult * ((pSize - 1) * .5);
            xp = xp * 100;
            xp = (double)(Math.round(xp*1000))/1000;
            
            if (player > 68) {
                curr = 1 - (2.5 * (68 - (area + 2)));
            } else {
                curr = 1 - (2.5 * (player - (area + 2)));
            }
            
            if (area > 68) {
                curr = 100;
            } else if (area + 2 >= player) {
                curr = 100;
            } else if (player > 68) {
                curr = 100 - (2.5 * (68 - (area + 2)));
                curr = (double)(Math.round(curr*1000))/1000;
            } else {
                curr = 100 - (2.5 * (player - (area + 2)));
                curr = (double)(Math.round(curr*1000))/1000;
            }
            
            xpM.setText("Experience Awarded: " + xp + "%");
            currencyM.setText("Currency Awarded:   " + curr + "%");
        }
    }
    
}