import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame{
    private static JFrame window;
    private static JPanel pannel;
    private static Buttons buttons;
    private static Canvas canvas;
    private static Menu menu;

    public static void main(String[] args) {
        initWindow();
        initMouseControl();
    }

    private static void initWindow(){
        window= new JFrame("MyPaint");
        pannel= new JPanel();
        buttons = new Buttons();
        canvas = new Canvas();
        menu = new Menu(canvas);

        pannel.add(buttons.pencil);
        pannel.add(buttons.eraser);
        pannel.add(buttons.line);
        pannel.add(buttons.rectangle);
        pannel.add(buttons.square);
        pannel.add(buttons.oval);
        pannel.add(buttons.circle);
        pannel.setLayout(null);


        canvas.setBounds(200,50, 900, 500);
        canvas.setBackground(new Color(255,255,255));
        pannel.add(canvas);


        window.setJMenuBar(menu.menuBar);
        window.add(pannel);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void initMouseControl(){
        MouseControl mouseControl = new MouseControl(canvas, buttons);
        canvas.addMouseMotionListener(mouseControl);
        canvas.addMouseListener(mouseControl);
    }

    public void paint(Graphics g) {
        super.paint(g);
    }

}
