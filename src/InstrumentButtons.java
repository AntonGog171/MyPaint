import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstrumentButtons {
    public JToggleButton pencil;
    public JToggleButton brush;
    public JToggleButton eraser;
    public JToggleButton line;
    public JToggleButton rectangle;
    public JToggleButton filledRectangle;
    public JToggleButton square;
    public JToggleButton filledSquare;
    public JToggleButton oval;
    public JToggleButton filledOval;
    public JToggleButton circle;
    public JToggleButton filledCircle;

    public InstrumentButtons(){
        initInstrumentButtons();
        initActionListeners();
    }

    private void initInstrumentButtons(){
        pencil=new JToggleButton ( new ImageIcon("img/pencil.png"));
        pencil.setBounds(0, 140, 30, 30);

        brush= new JToggleButton(new ImageIcon("img/brush.png"));
        brush.setBounds(30, 140, 30,30);

        eraser= new JToggleButton (new ImageIcon("img/eraser.png"));
        eraser.setBounds(0, 170, 30, 30);

        line = new JToggleButton ( new ImageIcon("img/line.png"));
        line.setBounds(30, 170, 30, 30);

        rectangle = new JToggleButton (new ImageIcon("img/rectangle.png"));
        rectangle.setBounds(0,200, 30, 30);

        filledRectangle= new JToggleButton(new ImageIcon("img/filled_rectangle.png"));
        filledRectangle.setBounds(30, 200, 30, 30);

        square = new JToggleButton (new ImageIcon("img/square.png"));
        square.setBounds(0,230, 30, 30);

        filledSquare = new JToggleButton(new ImageIcon("img/filled_square.png"));
        filledSquare.setBounds(30, 230, 30,30);

        oval = new JToggleButton ( new ImageIcon("img/oval.png"));
        oval.setBounds(0,260, 30, 30);

        filledOval= new JToggleButton(new ImageIcon("img/filled_oval.png"));
        filledOval.setBounds(30, 260, 30, 30);

        circle = new JToggleButton (new ImageIcon("img/circle.png"));
        circle.setBounds(0,290, 30, 30);

        filledCircle = new JToggleButton(new ImageIcon("img/filled_circle.png"));
        filledCircle.setBounds(30,290, 30, 30);

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
        brush.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(brush.isSelected()){
                    turnoff();
                    brush.setSelected(true);
                    brush.setIcon(new ImageIcon("img/brush_pressed.png"));
                }else{
                    brush.setIcon(new ImageIcon("img/brush.png"));
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
        filledRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(filledRectangle.isSelected()){
                    turnoff();
                    filledRectangle.setSelected(true);
                    filledRectangle.setIcon(new ImageIcon("img/filled_rectangle_pressed.png"));
                }else{
                    filledRectangle.setIcon(new ImageIcon("img/filled_rectangle.png"));
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
        filledSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(filledSquare.isSelected()){
                    turnoff();
                    filledSquare.setSelected(true);
                    filledSquare.setIcon(new ImageIcon("img/filled_square_pressed.png"));
                }else{
                    filledSquare.setIcon(new ImageIcon("img/filled_square.png"));
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
        filledOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(filledOval.isSelected()){
                    turnoff();
                    filledOval.setSelected(true);
                    filledOval.setIcon(new ImageIcon("img/filled_oval_pressed.png"));
                }else{
                    filledOval.setIcon(new ImageIcon("img/filled_oval"));
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
        filledCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(filledCircle.isSelected()){
                    turnoff();
                    filledCircle.setSelected(true);
                    filledCircle.setIcon(new ImageIcon("img/filled_circle_pressed.png"));
                }else{
                    filledCircle.setIcon(new ImageIcon("img/filled_circle.png"));
                }
            }
        });
    }

    private void turnoff(){
        pencil.setIcon(new ImageIcon("img/pencil.png"));
        pencil.setSelected(false);
        brush.setIcon(new ImageIcon("img/brush.png"));
        brush.setSelected(false);
        eraser.setIcon(new ImageIcon("img/eraser.png"));
        eraser.setSelected(false);
        line.setIcon(new ImageIcon("img/line.png"));
        line.setSelected(false);
        rectangle.setIcon(new ImageIcon("img/rectangle.png"));
        rectangle.setSelected(false);
        filledRectangle.setIcon(new ImageIcon("img/filled_rectangle.png"));
        filledRectangle.setSelected(false);
        square.setIcon(new ImageIcon(("img/square.png")));
        square.setSelected(false);
        filledSquare.setIcon(new ImageIcon("img/filled_square.png"));
        filledSquare.setSelected(false);
        oval.setIcon(new ImageIcon("img/oval.png"));
        oval.setSelected(false);
        filledOval.setIcon(new ImageIcon("img/filled_oval.png"));
        filledOval.setSelected(false);
        circle.setIcon(new ImageIcon("img/circle.png"));
        circle.setSelected(false);
        filledCircle.setIcon(new ImageIcon("img/filled_circle.png"));
        filledCircle.setSelected(false);
    }

    public boolean isOnFigures(){
        return line.isSelected() || rectangle.isSelected() || filledRectangle.isSelected() || square.isSelected() || filledSquare.isSelected() || oval.isSelected()|| filledOval.isSelected() || circle.isSelected() || filledCircle.isSelected();
    }
}
