import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseControl implements MouseMotionListener, MouseListener {

    Canvas canvas;
    Buttons buttons;
    int oldX, oldY;
    int figureStartX, figureStartY;

    public MouseControl(Canvas canvas, Buttons buttons){
        this.canvas=canvas;
        this.buttons=buttons;
    }

    @Override
    public void mouseDragged(MouseEvent e){
        if(buttons.pencil.isSelected()) {
            int x = e.getX();
            int y = e.getY();
            Graphics g = canvas.getGraphics();
            g.setColor(new Color(255, 0, 0));
            g.drawLine(oldX, oldY, x, y);
            oldX=x;
            oldY=y;
        }

        if(buttons.eraser.isSelected()) {
            int width=10;
            int x = e.getX()-width/2;
            int y = e.getY()-width/2;//correcting for cursor
            Graphics g = canvas.getGraphics();
            g.setColor(canvas.getBackground());
            g.fillOval(x, y, width, width);

        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        oldX=e.getX();
        oldY=e.getY();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(buttons.pencil.isSelected()) {
            int width=10;
            int x = e.getX();
            int y = e.getY();
            Graphics g = canvas.getGraphics();
            g.setColor(new Color(255, 0, 0));
            g.drawLine(oldX, oldY, x, y);
            oldX=x;
            oldY=y;
        }

        if(buttons.eraser.isSelected()) {
            int width=10;
            int x = e.getX()-width/2;
            int y = e.getY()-width/2;//correcting for cursor
            Graphics g = canvas.getGraphics();
            g.setColor(canvas.getBackground());
            g.fillOval(x, y, width, width);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(buttons.isOnFigures()){
            figureStartX=e.getX();
            figureStartY=e.getY();
            Graphics g = canvas.getGraphics();
            g.setColor(canvas.getBackground());
            g.fillOval(figureStartX, figureStartY, 10, 10);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(buttons.line.isSelected()){
            int x = e.getX();
            int y = e.getY();
            Graphics g = canvas.getGraphics();
            g.setColor(Color.RED);
            g.drawLine(figureStartX, figureStartY, x, y);
        }

        if(buttons.rectangle.isSelected()){
            int x = e.getX();
            int y = e.getY();
            Graphics g = canvas.getGraphics();
            g.setColor(Color.RED);
            if(figureStartX>x){
                int temp=x;
                x=figureStartX;
                figureStartX=temp;
            }
            if(figureStartY>y){
                int temp=y;
                y=figureStartY;
                figureStartY=temp;
            }

            g.drawRect(figureStartX, figureStartY, x-figureStartX, y-figureStartY);
        }

        if(buttons.square.isSelected()){
            int x = e.getX();
            int y = e.getY();
            Graphics g = canvas.getGraphics();
            g.setColor(Color.RED);
            if(figureStartX>x){
                int temp=x;
                x=figureStartX;
                figureStartX=temp;
            }
            if(figureStartY>y){
                int temp=y;
                y=figureStartY;
                figureStartY=temp;
            }
            int width= Math.max(x-figureStartX, y-figureStartY);
            g.drawRect(figureStartX, figureStartY, width, width);
        }

        if(buttons.circle.isSelected()){
            int x = e.getX();
            int y = e.getY();
            Graphics g = canvas.getGraphics();
            g.setColor(Color.RED);
            if(figureStartX>x){
                int temp=x;
                x=figureStartX;
                figureStartX=temp;
            }
            if(figureStartY>y){
                int temp=y;
                y=figureStartY;
                figureStartY=temp;
            }
            int width= Math.max(x-figureStartX, y-figureStartY);
            g.drawOval(figureStartX, figureStartY, width, width);
        }

        if (buttons.oval.isSelected()){
            int x = e.getX();
            int y = e.getY();
            Graphics g = canvas.getGraphics();
            g.setColor(Color.RED);
            if(figureStartX>x){
                int temp=x;
                x=figureStartX;
                figureStartX=temp;
            }
            if(figureStartY>y){
                int temp=y;
                y=figureStartY;
                figureStartY=temp;
            }

            g.drawOval(figureStartX, figureStartY, x-figureStartX, y-figureStartY);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
