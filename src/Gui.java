import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame {
    private JPanel content;
    Gui(JPanel panel){
        super("Gannonopoly");

        this.content = panel;
        setSize(900, 700);
        setVisible(true);
    }
    public static void main(String args[]){
       Gui main = new Gui(new JPanel());


    }
}
