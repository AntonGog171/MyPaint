import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Buttons {
    public JToggleButton  pencil;
    public JToggleButton  eraser;
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

        eraser= new JToggleButton (new ImageIcon("img/eraser.png"));
        eraser.setBounds(0, 170, 30, 30);

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
        eraser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(eraser.getModel().isSelected()){
                    turnoff();
                    eraser.setSelected(true);
                    eraser.setIcon(new ImageIcon("img/eraser_pressed.png"));
                }else {
                    eraser.setIcon(new ImageIcon("img/eraser.png"));
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
        eraser.setIcon(new ImageIcon("img/eraser.png"));
        eraser.setSelected(false);
        line.setIcon(new ImageIcon("img/line.png"));
        line.setSelected(false);
        square.setIcon(new ImageIcon("img/square.png"));
        square.setSelected(false);
        circle.setIcon(new ImageIcon("img/circle.png"));
        circle.setSelected(false);
    }
}
