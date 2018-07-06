package picture;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private MyGraphicPanel graphicPanel;
    private AntosiaPanel antosia;

    public MainFrame() throws HeadlessException {

        this.setLayout(new BorderLayout());
        this.setBounds(100,100,1000,600);


        //graphicPanel = new MyGraphicPanel();
        antosia = new AntosiaPanel();

        //add(graphicPanel,BorderLayout.WEST);
        add(antosia,BorderLayout.CENTER);
    }
}
