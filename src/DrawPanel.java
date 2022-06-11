import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;


public class DrawPanel extends JPanel{

    Buttons buttons;
    private int x, y;
    private int oldX, oldY;
    private int figureStartX, figureStartY;


    private LinkedList<Instrument> instruments = new LinkedList<Instrument>();

    public DrawPanel(Buttons buttons) {
        this.buttons = buttons;
    }


    public void add(Instrument instrument){
        instruments.add(instrument);
        repaint();
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 900, 500);

        for(Instrument i : instruments){
            i.drawComponent(g);
        }
    }
}
