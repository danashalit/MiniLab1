/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author DeeShalz
 */
public class MainPanel extends JPanel {
     MainPanel(){
        JButton blueButton = new JButton("Blue");
        add(blueButton);
        JButton redButton = new JButton("Red");
        add(redButton);
    }
}
