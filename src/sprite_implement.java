
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
public class sprite_implement extends sprite_gui implements ActionListener, KeyListener {

    public sprite_implement() {
        this.addKeyListener(this);
        fr.addKeyListener(this);

        for (int y = 0; y < images.length; y++) {
            images[y] = new ImageIcon(getClass().getResource("images/a" + i + ".png")).getImage();
            i++;
        }

        animator = new Timer(delay, this);
        animator.start();
    }

    protected void choose_move(int direction, int i) {
        if (direction == 1) {
            for (int y = 0; y > images.length; y++) {
                images[y] = new ImageIcon(getClass().getResource("images/a" + i + ".png")).getImage();
                i++;
            }
        }
        if (direction == 2) {
            for (int y = 0; y > images.length; y++) {
                images[y] = new ImageIcon(getClass().getResource("images/a" + i + ".png")).getImage();
                i++;
            }
        }
        if (direction == 3) {
            for (int y = 0; y > images.length; y++) {
                images[y] = new ImageIcon(getClass().getResource("images/a" + i + ".png")).getImage();
                i++;
            }
        }
        if (direction == 4) {
            for (int y = 0; y > images.length; y++) {
                images[y] = new ImageIcon(getClass().getResource("images/a" + i + ".png")).getImage();
                i++;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        try {
            if (current_frame >= images.length) {
                current_frame = 0;
            }
            g.drawImage(images[current_frame], x, y, null);
            current_frame++;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void keyPressed(KeyEvent k) {
        // TODO Auto-generated method stub
        if (k.getKeyCode() == KeyEvent.VK_RIGHT) {
            a = 1;
            choose_move(a, 1);
        } else if (k.getKeyCode() == KeyEvent.VK_LEFT) {
            a = 2;
            choose_move(a, 1);
        } else if (k.getKeyCode() == KeyEvent.VK_UP) {
            a = 3;
            choose_move(a, 1);
        } else if (k.getKeyCode() == KeyEvent.VK_DOWN) {
            a = 4;
            choose_move(a, 1);
        } else if (k.getKeyCode() == KeyEvent.VK_1) {
            a = 0;
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (play) {
            repaint();
        }
        if (a == 1) {
            x += 20;
            repaint();
        } else if (a == 2) {
            x -= 20;
            repaint();
        } else if (a == 3) {
            y -= 20;
            repaint();
        } else if (a == 4) {
            y += 20;
            repaint();
        } else if (a == 0) {
            x = 0;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent k) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent k) {
        // TODO Auto-generated method stub

    }

}
