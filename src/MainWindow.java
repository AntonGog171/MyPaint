import javax.swing.*;
import java.awt.*;


public class MainWindow {
    private static JFrame window;
    private static DrawPanel panel;
    private static Buttons buttons;
    private static Menu menu;

    public static void main(String[] args) {
        initWindow();
        initMouseControl();
    }

    private static void initWindow(){
        window= new JFrame("MyPaint");
        buttons = new Buttons();
        panel = new DrawPanel(buttons);
        menu = new Menu(panel);

        window.add(buttons.pencil);
        window.add(buttons.eraser);
        window.add(buttons.line);
        window.add(buttons.rectangle);
        window.add(buttons.square);
        window.add(buttons.oval);
        window.add(buttons.circle);
        window.setLayout(null);


        panel.setBounds(200,50, 900, 500);
        panel.setBackground(Color.WHITE);
        window.add(panel);


        window.setJMenuBar(menu.menuBar);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void initMouseControl(){
        MouseControl mouseControl = new MouseControl(buttons, panel);
        panel.addMouseMotionListener(mouseControl);
        panel.addMouseListener(mouseControl);
    }

}
