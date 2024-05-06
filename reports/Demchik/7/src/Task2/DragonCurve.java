package Task2;

import javax.swing.*;
import java.awt.*;

public class DragonCurve extends JPanel {
    private int numberOfIterations;
    
    public DragonCurve(int numberOfIterations) {
        this.numberOfIterations = numberOfIterations;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        drawDragon(180, 200, 400, 450, numberOfIterations, g);
    }
    
    private void drawDragon(int x1, int y1, int x2, int y2, int n, Graphics g) {
        int xx, yy;
        if (n > 0) {
            xx = (x1 + x2) / 2 + (y2 - y1) / 2;
            yy = (y1 + y2) / 2 - (x2 - x1) / 2;
            drawDragon(x2, y2, xx, yy, n - 1, g);
            drawDragon(x1, y1, xx, yy, n - 1, g);
        }
        if (n == 0)
            g.drawLine(x1, y1, x2, y2);
    }
}