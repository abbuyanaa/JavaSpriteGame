
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ariunbuyan
 */
public class sprite_gui extends JPanel {

    protected JFrame fr;
    protected Timer animator;
    protected Image images[] = new Image[6];
    int a = 0;
    int delay = 1000, current_frame = 0;
    static int x = 50, y = 100;
    protected int i = 1;
    protected Boolean play = true;

    public sprite_gui() {
        fr = new JFrame();
        this.setBackground(new Color(0, 128, 0));
        this.setSize(500, 500);
        fr.add(this);
        fr.setSize(500, 500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
