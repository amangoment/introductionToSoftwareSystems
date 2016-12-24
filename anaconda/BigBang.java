import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class BigBang extends JComponent implements ActionListener, MouseListener, KeyListener {
    Timer timer;
    World world;

    public BigBang(World var1) {
        this.world = var1;
        this.addMouseListener(this);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocus();
    }

    public void start(int var1, int var2) {
        JFrame var3 = new JFrame();
        var3.add(this);
        var3.setVisible(true);
        var3.setSize(var2, var2);
        this.timer = new Timer(var1, this);
        this.timer.start();
    }

    public void mouseEntered(MouseEvent var1) {
    }

    public void mouseExited(MouseEvent var1) {
    }

    public void mousePressed(MouseEvent var1) {
        this.world.meh(var1);
        this.repaint();
    }

    public void mouseReleased(MouseEvent var1) {
    }

    public void mouseClicked(MouseEvent var1) {
    }

    public void keyPressed(KeyEvent var1) {
        this.world.keh(var1);
        this.repaint();
    }

    public void keyReleased(KeyEvent var1) {
    }

    public void keyTyped(KeyEvent var1) {
    }

    public void actionPerformed(ActionEvent var1) {
        this.world.teh();
        this.repaint();
    }

    public void paintComponent(Graphics var1) {
        this.world.draw(var1);
    }
}
