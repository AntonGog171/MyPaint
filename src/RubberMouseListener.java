import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class RubberMouseListener implements MouseMotionListener, MouseListener {


    Canvas canvas;
    Buttons buttons;

    public RubberMouseListener(Canvas canvas, Buttons buttons){
        this.canvas=canvas;
        this.buttons=buttons;
    }

    @Override
    public void mouseDragged(MouseEvent e){
        DrawDot(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        DrawDot(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        DrawDot(e);
    }

    private void DrawDot(MouseEvent e) {
        if(buttons.eraser.getModel().isSelected()) {
            int width=10;
            int x = e.getX()-width/2;
            int y = e.getY()-width/2;//correcting for cursor
            Graphics g = canvas.getGraphics();
            g.setColor(canvas.getBackground());
            g.fillOval(x, y, width, width);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
