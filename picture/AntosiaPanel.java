package picture;

import javax.swing.*;
import java.awt.*;

public class AntosiaPanel extends JPanel {

    private Image cat;

    public AntosiaPanel() {}



    public void paintComponent(Graphics g){
        cat = new ImageIcon().getImage();
        g.drawImage(cat,3,4,this);
    }
}


