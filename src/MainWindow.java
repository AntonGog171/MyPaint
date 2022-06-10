import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame{
    private static JFrame window= new JFrame("MyPaint");
    private static JPanel pannel= new JPanel();
    private static Buttons buttons = new Buttons();
    private static Menu menu = new Menu();
    private static Canvas canvas = new Canvas();

    public static void main(String[] args) {
        init();
        initMouseListeners();
    }

    private static void init(){
        pannel.add(buttons.pencil);
        pannel.add(buttons.eraser);
        pannel.add(buttons.line);
        pannel.add(buttons.square);
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

    private static void initMouseListeners(){
        PencilMouseListener pencilMouseListener = new PencilMouseListener(canvas, buttons);
        canvas.addMouseMotionListener(pencilMouseListener);
        canvas.addMouseListener(pencilMouseListener);

        RubberMouseListener rubberMouseListener = new RubberMouseListener(canvas, buttons);
        canvas.addMouseListener(rubberMouseListener);
        canvas.addMouseMotionListener(rubberMouseListener);


    }
}
