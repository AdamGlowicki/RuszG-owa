package SimplyAnime;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private Panel panel;


    public MainFrame() {
        setLayout(new BorderLayout());
        setBounds(100,100,1000,600);

        panel = new Panel();

        add(panel,BorderLayout.WEST);
    }


    public int cdd(int a, int b){

        return a;
    }


}
