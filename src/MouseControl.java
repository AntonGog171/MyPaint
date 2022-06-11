import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseControl implements MouseMotionListener, MouseListener {

    InstrumentButtons instrumentButtons;
    ColorButtons colorButtons;
    int x, y;
    int oldX, oldY;
    int figureStartX, figureStartY;

    DrawPanel panel;

    public MouseControl(InstrumentButtons instrumentButtons, DrawPanel panel, ColorButtons colorButtons){
        this.instrumentButtons = instrumentButtons;
        this.panel=panel;
        this.colorButtons=colorButtons;
    }

    @Override
    public void mouseDragged(MouseEvent e){
        Color color=colorButtons.activeColor();
        if(instrumentButtons.pencil.isSelected()) {
            x = e.getX();
            y = e.getY();
            panel.add(new Instrument(x, y, oldX, oldY, color, -1, -1, "pencil"));
            oldX=x;
            oldY=y;
        }

        if(instrumentButtons.eraser.isSelected()) {
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
        Color color=colorButtons.activeColor();
        if(instrumentButtons.pencil.isSelected()) {
            int width=10;
            x = e.getX();
            y = e.getY();
            panel.add(new Instrument(x, y, oldX, oldY, color, -1, -1, "pencil"));
            oldX=x;
            oldY=y;
        }

        if(instrumentButtons.eraser.isSelected()) {
            int width=10;
            x = e.getX()-width/2;
            y = e.getY()-width/2;//correcting for cursor
            panel.add(new Instrument(x, y, oldX, oldY, panel.getBackground(), figureStartX, figureStartY, "eraser"));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(instrumentButtons.isOnFigures()){
            figureStartX=e.getX();
            figureStartY=e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Color color=colorButtons.activeColor();
        if(instrumentButtons.line.isSelected()){
            x = e.getX();
            y = e.getY();
            panel.add(new Instrument(x, y, oldX, oldY, color, figureStartX, figureStartY, "line"));
        }

        if(instrumentButtons.rectangle.isSelected()){
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

        if(instrumentButtons.square.isSelected()){
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

        if(instrumentButtons.circle.isSelected()){
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

        if (instrumentButtons.oval.isSelected()){
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
