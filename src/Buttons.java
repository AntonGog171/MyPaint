import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    public JToggleButton  pencil;
    public JToggleButton  eraser;
    public JToggleButton  line;
    public JToggleButton rectangle;
    public JToggleButton square;
    public JToggleButton oval;
    public JToggleButton circle;

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

        rectangle = new JToggleButton (new ImageIcon("img/rectangle.png"));
        rectangle.setBounds(0,230, 30, 30);

        square = new JToggleButton (new ImageIcon("img/square.png"));
        square.setBounds(0,260, 30, 30);

        oval = new JToggleButton ( new ImageIcon("img/oval.png"));
        oval.setBounds(0,290, 30, 30);

        circle = new JToggleButton (new ImageIcon("img/circle.png"));
        circle.setBounds(0,320, 30, 30);

    }

    private void initActionListeners(){
        pencil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pencil.isSelected()){
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
                if(eraser.isSelected()){
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
                if(line.isSelected()){
                    turnoff();
                    line.setSelected(true);
                    line.setIcon(new ImageIcon("img/line_pressed.png"));
                }
                else{
                    line.setIcon(new ImageIcon("img/line.png"));
                }
            }
        });
        rectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rectangle.isSelected()){
                    turnoff();
                    rectangle.setSelected(true);
                    rectangle.setIcon(new ImageIcon("img/rectangle_pressed.png"));
                }
                else{
                    rectangle.setIcon(new ImageIcon("img/rectangle.png"));
                }
            }
        });
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(square.isSelected()){
                    turnoff();
                    square.setSelected(true);
                    square.setIcon(new ImageIcon("img/square_pressed.png"));
                }
                else{
                    square.setIcon(new ImageIcon("img/square.png"));
                }
            }
        });
        oval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(oval.isSelected()){
                    turnoff();
                    oval.setSelected(true);
                    oval.setIcon(new ImageIcon("img/oval_pressed.png"));
                }
                else{
                    oval.setIcon(new ImageIcon("img/oval.png"));
                }
            }
        });
        circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(circle.isSelected()){
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
        rectangle.setIcon(new ImageIcon("img/rectangle.png"));
        rectangle.setSelected(false);
        square.setIcon(new ImageIcon(("img/square.png")));
        square.setSelected(false);
        oval.setIcon(new ImageIcon("img/oval.png"));
        oval.setSelected(false);
        circle.setIcon(new ImageIcon("img/circle.png"));
        circle.setSelected(false);
    }

    public boolean isOnFigures(){
        return line.isSelected() || rectangle.isSelected() || square.isSelected() || oval.isSelected() || circle.isSelected();
    }
}
