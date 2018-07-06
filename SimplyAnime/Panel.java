package SimplyAnime;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private int x =70;
    private int y =70;

    public Panel() {

        Dimension dim = getPreferredSize();
        dim.width = 500;
        setPreferredSize(dim);
        anime();

    }

    public void paintComponent(Graphics g){
        g.setColor(Color.green);
        g.fillOval(x,y,40,40);
    }

    public void anime(){
        for (int i = 0; i<130; i++){
            x++;
            y++;

            repaint();

            try {
                Thread.sleep(50);
            }
            catch (Exception ex){}
        }
    }





}
