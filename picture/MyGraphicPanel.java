package picture;

import javax.swing.*;
import java.awt.*;

public class MyGraphicPanel extends JPanel {


    public MyGraphicPanel() {
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
    }
}
