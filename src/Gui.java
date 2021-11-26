import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame {
    private JPanel content;

    Gui(JPanel panel){
        super("Gannonopoly");
        setSize(900, 700);
        //setLayout(new BorderLayout());

        this.content = panel;

        add(this.content);

        setVisible(true);
    }
    public static void main(String args[]){
       Gui main = new Gui(new StartPanel());


    }
}
