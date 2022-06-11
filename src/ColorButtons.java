import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButtons {
    public JToggleButton black = new JToggleButton();
    public JToggleButton red = new JToggleButton();
    public JToggleButton yellow = new JToggleButton();
    public JToggleButton green = new JToggleButton();
    public JToggleButton blue = new JToggleButton();
    public JToggleButton pink = new JToggleButton();
    public JToggleButton gray = new JToggleButton();
    public JToggleButton white= new JToggleButton();
    public JPanel colorShow = new JPanel();
    public JLabel colorLabel = new JLabel("Current color:");

    public ColorButtons() {
        init();
        initActionListeners();
    }

    private void init(){
        black.setBackground(Color.BLACK);
        black.setSelected(true);
        black.setBounds(0, 500, 30, 30);
        red.setBackground(Color.RED);
        red.setBounds(30,500,30,30);
        yellow.setBackground(Color.YELLOW);
        yellow.setBounds(60,500,30,30);
        green.setBackground(Color.GREEN);
        green.setBounds(90, 500, 30, 30);
        blue.setBackground(Color.BLUE);
        blue.setBounds(0, 530, 30, 30);
        pink.setBackground(Color.PINK);
        pink.setBounds(30, 530, 30, 30);
        gray.setBackground(Color.GRAY);
        gray.setBounds(60, 530, 30, 30);
        white.setBackground(Color.WHITE);
        white.setBounds(90, 530, 30, 30);

        ;
        colorLabel.setBounds(0, 430, 100, 20);
        colorShow.setBounds(85, 430, 35, 35);
        colorShow.setVisible(true);
    }

    private void initActionListeners(){
        colorShow.setBackground(activeColor());
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turnoff();
                black.setSelected(true);
                colorShow.setBackground(activeColor());
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turnoff();
                red.setSelected(true);
                colorShow.setBackground(activeColor());
            }
        });
        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turnoff();
                yellow.setSelected(true);
                colorShow.setBackground(activeColor());
            }
        });
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turnoff();
                green.setSelected(true);
                colorShow.setBackground(activeColor());
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turnoff();
                blue.setSelected(true);
                colorShow.setBackground(activeColor());
            }
        });
        pink.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turnoff();
                pink.setSelected(true);
                colorShow.setBackground(activeColor());
            }
        });
        gray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turnoff();
                gray.setSelected(true);
                colorShow.setBackground(activeColor());
            }
        });
        white.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turnoff();
                gray.setSelected(true);
                colorShow.setBackground(activeColor());
            }
        });
    }

    private void turnoff(){
        black.setSelected(false);
        red.setSelected(false);
        yellow.setSelected(false);
        green.setSelected(false);
        blue.setSelected(false);
        pink.setSelected(false);
        gray.setSelected(false);
        white.setSelected(false);
    }

    public Color activeColor(){
        if(black.isSelected())
            return Color.BLACK;
        if(red.isSelected())
            return Color.RED;
        if(yellow.isSelected())
            return Color.YELLOW;
        if(green.isSelected())
            return Color.GREEN;
        if(blue.isSelected())
            return Color.blue;
        if(pink.isSelected())
            return Color.pink;
        if(gray.isSelected())
            return Color.GRAY;
        return Color.WHITE;
    }
}
