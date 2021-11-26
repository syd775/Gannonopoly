import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Component;
import java.awt.Container;

public class StartPanel extends JPanel{
    private final JButton startButton = new JButton("Start");
    private final JLabel instructions = new JLabel("jdjdjd djdjdjjd djdjdj d djdjd");

    StartPanel(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(startButton, BoxLayout.CENTER);
        add(instructions);
        setSize(900, 700);
    }


}
