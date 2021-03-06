import javax.swing.*;
import java.awt.*;


public class MainWindow {
    private static JFrame window;
    private static DrawPanel panel;
    private static JScrollPane scroll;
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
        scroll= new JScrollPane();
        menu = new Menu(panel);

        window.setLayout(null);


        panel.setBounds(200,50, 900, 500);
        panel.setBackground(Color.WHITE);
        panel.add(scroll);
        window.add(panel);

        window.setJMenuBar(menu.menuBar);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void initButtons(){
        window.add(instrumentButtons.pencil);
        window.add(instrumentButtons.brush);
        window.add(instrumentButtons.eraser);
        window.add(instrumentButtons.line);
        window.add(instrumentButtons.rectangle);
        window.add(instrumentButtons.filledRectangle);
        window.add(instrumentButtons.square);
        window.add(instrumentButtons.filledSquare);
        window.add(instrumentButtons.oval);
        window.add(instrumentButtons.filledOval);
        window.add(instrumentButtons.circle);
        window.add(instrumentButtons.filledCircle);

        window.add(colorButtons.black);
        window.add(colorButtons.red);
        window.add(colorButtons.yellow);
        window.add(colorButtons.green);
        window.add(colorButtons.blue);
        window.add(colorButtons.pink);
        window.add(colorButtons.gray);
        window.add(colorButtons.white);
        window.add(colorButtons.colorShow);
        window.add(colorButtons.colorLabel);
    }

    private static void initMouseControl(){
        MouseControl mouseControl = new MouseControl(instrumentButtons, panel, colorButtons);
        panel.addMouseMotionListener(mouseControl);
        panel.addMouseListener(mouseControl);
    }

}
