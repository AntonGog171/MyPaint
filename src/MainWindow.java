import javax.swing.*;
import java.awt.*;


public class MainWindow {
    private static JFrame window;
    private static DrawPanel panel;
    private static ColorButtons colorButtons;
    private static InstrumentButtons instrumentButtons;
    private static Menu menu;

    public static void main(String[] args) {
        initWindow();
        initButtons();
        initMouseControl();
    }

    private static void initWindow(){
        window= new JFrame("MyPaint");
        instrumentButtons = new InstrumentButtons();
        colorButtons=new ColorButtons();
        panel = new DrawPanel(instrumentButtons);
        menu = new Menu(panel);

        window.setLayout(null);


        panel.setBounds(200,50, 900, 500);
        panel.setBackground(Color.WHITE);
        window.add(panel);
        window.add(colorButtons.colorShow);
        window.add(colorButtons.colorLabel);

        window.setJMenuBar(menu.menuBar);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void initButtons(){
        window.add(instrumentButtons.pencil);
        window.add(instrumentButtons.eraser);
        window.add(instrumentButtons.line);
        window.add(instrumentButtons.rectangle);
        window.add(instrumentButtons.square);
        window.add(instrumentButtons.oval);
        window.add(instrumentButtons.circle);

        window.add(colorButtons.black);
        window.add(colorButtons.red);
        window.add(colorButtons.yellow);
        window.add(colorButtons.green);
        window.add(colorButtons.blue);
        window.add(colorButtons.pink);
        window.add(colorButtons.gray);
        window.add(colorButtons.white);
    }

    private static void initMouseControl(){
        MouseControl mouseControl = new MouseControl(instrumentButtons, panel, colorButtons);
        panel.addMouseMotionListener(mouseControl);
        panel.addMouseListener(mouseControl);
    }

}
