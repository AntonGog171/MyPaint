import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseControl implements MouseMotionListener, MouseListener {

    Buttons buttons;
    int x, y;
    int oldX, oldY;
    int figureStartX, figureStartY;
    Color color = Color.RED;
    DrawPanel panel;

    public MouseControl(Buttons buttons, DrawPanel panel){
        this.buttons=buttons;
        this.panel=panel;
    }

    @Override
    public void mouseDragged(MouseEvent e){
        if(buttons.pencil.isSelected()) {
            x = e.getX();
            y = e.getY();
            panel.add(new Instrument(x, y, oldX, oldY, color, -1, -1, "pencil"));
            oldX=x;
            oldY=y;
        }

        if(buttons.eraser.isSelected()) {
            int width=20;
            x = e.getX()-width/2;
            y = e.getY()-width/2;//correcting for cursor
            panel.add(new Instrument(x, y, oldX, oldY, panel.getBackground(), -1, -1, "eraser"));
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
            x = e.getX();
            y = e.getY();
            panel.add(new Instrument(x, y, oldX, oldY, color, -1, -1, "pencil"));
            oldX=x;
            oldY=y;
        }

        if(buttons.eraser.isSelected()) {
            int width=10;
            x = e.getX()-width/2;
            y = e.getY()-width/2;//correcting for cursor
            panel.add(new Instrument(x, y, oldX, oldY, panel.getBackground(), figureStartX, figureStartY, "eraser"));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(buttons.isOnFigures()){
            figureStartX=e.getX();
            figureStartY=e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(buttons.line.isSelected()){
            x = e.getX();
            y = e.getY();
            panel.add(new Instrument(x, y, oldX, oldY, color, figureStartX, figureStartY, "line"));
        }

        if(buttons.rectangle.isSelected()){
            x = e.getX();
            y = e.getY();

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
            panel.add(new Instrument(x, y, oldX, oldY, color, figureStartX, figureStartY, "rectangle"));
        }

        if(buttons.square.isSelected()){
            x = e.getX();
            y = e.getY();

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
            panel.add(new Instrument(x, y, oldX, oldY, color, figureStartX, figureStartY, "square"));
        }

        if(buttons.circle.isSelected()){
            x = e.getX();
            y = e.getY();

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
            panel.add(new Instrument(x, y, oldX, oldY, color, figureStartX, figureStartY, "circle"));
        }

        if (buttons.oval.isSelected()){
            x = e.getX();
            y = e.getY();

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
            panel.add(new Instrument(x, y, oldX, oldY, color, figureStartX, figureStartY, "oval"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
