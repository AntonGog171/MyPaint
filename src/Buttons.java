import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Buttons {
    public JToggleButton  pencil;
    public JToggleButton  rubber;
    public JToggleButton  line;
    public JToggleButton  square;
    public JToggleButton  circle;

    public Buttons(){
        initInstrumentButtons();
        initActionListeners();
    }

    private void initInstrumentButtons(){
        pencil=new JToggleButton ( new ImageIcon("img/pencil.png"));
        pencil.setBounds(0, 140, 30, 30);

        rubber= new JToggleButton (new ImageIcon("img/rubber.png"));
        rubber.setBounds(0, 170, 30, 30);

        line = new JToggleButton ( new ImageIcon("img/line.png"));
        line.setBounds(0, 200, 30, 30);

        square = new JToggleButton (new ImageIcon("img/square.png"));
        square.setBounds(0,230, 30, 30);

        circle = new JToggleButton ( new ImageIcon("img/circle.png"));
        circle.setBounds(0,260, 30, 30);

    }

    private void initActionListeners(){
        pencil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pencil.getModel().isSelected()){
                    turnoff();
                    pencil.setSelected(true);
                    pencil.setIcon(new ImageIcon("img/pencil_pressed.png"));
                }
                else{
                    pencil.setIcon(new ImageIcon("img/pencil.png"));
                }
            }
        });
        rubber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rubber.getModel().isSelected()){
                    turnoff();
                    rubber.setSelected(true);
                    rubber.setIcon(new ImageIcon("img/rubber_pressed.png"));
                }else {
                    rubber.setIcon(new ImageIcon("img/rubber.png"));
                }
            }
        });
        line.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(line.getModel().isSelected()){
                    turnoff();
                    line.setSelected(true);
                    line.setIcon(new ImageIcon("img/line_pressed.png"));
                }
                else{
                    line.setIcon(new ImageIcon("img/line.png"));
                }
            }
        });
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(square.getModel().isSelected()){
                    turnoff();
                    square.setSelected(true);
                    square.setIcon(new ImageIcon("img/square_pressed.png"));
                }
                else{
                    square.setIcon(new ImageIcon("img/square.png"));
                }
            }
        });
        circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(circle.getModel().isSelected()){
                    turnoff();
                    circle.setSelected(true);
                    circle.setIcon(new ImageIcon("img/circle_pressed.png"));
                }
                else{
                    circle.setIcon(new ImageIcon("img/circle.png"));
                }
            }
        });
    }

    private void turnoff(){
        pencil.setIcon(new ImageIcon("img/pencil.png"));
        pencil.setSelected(false);
        rubber.setIcon(new ImageIcon("img/rubber.png"));
        rubber.setSelected(false);
        line.setIcon(new ImageIcon("img/line.png"));
        line.setSelected(false);
        square.setIcon(new ImageIcon("img/square.png"));
        square.setSelected(false);
        circle.setIcon(new ImageIcon("img/circle.png"));
        circle.setSelected(false);
    }
}
