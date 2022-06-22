import java.awt.*;

public class Instrument {
    int x, y;
    int oldX, oldY;
    Color color;
    int figureStartX, figureStartY;
    String type;

    public Instrument(int x, int y, int oldX, int oldY, Color color, int figureStartX, int figureStartY, String type) {
        this.x = x;
        this.y = y;
        this.oldX = oldX;
        this.oldY = oldY;
        this.color = color;
        this.figureStartX = figureStartX;
        this.figureStartY = figureStartY;
        this.type = type;
    }

    public void drawComponent(Graphics g){
        g.setColor(color);
        switch (type) {
            case "pencil" -> g.drawLine(x, y, oldX, oldY);
            case "brush" -> g.fillOval(x, y, 20, 20);
            case "eraser" -> g.fillOval(x, y, 20, 20);
            case "line" -> g.drawLine(figureStartX, figureStartY, x, y);
            case "rectangle" -> g.drawRect(figureStartX, figureStartY, x-figureStartX, y-figureStartY);
            case "filledRectangle" -> g.fillRect(figureStartX, figureStartY, x-figureStartX, y-figureStartY);
            case "square" -> g.drawRect(figureStartX,figureStartY, Math.max(x-figureStartX, y-figureStartY),Math.max(x-figureStartX, y-figureStartY));
            case "filledSquare" -> g.fillRect(figureStartX,figureStartY, Math.max(x-figureStartX, y-figureStartY),Math.max(x-figureStartX, y-figureStartY));
            case "oval" -> g.drawOval(figureStartX, figureStartY, x-figureStartX, y-figureStartY);
            case "filledOval" -> g.fillOval(figureStartX, figureStartY, x-figureStartX, y-figureStartY);
            case "circle" -> g.drawOval(figureStartX,figureStartY, Math.max(x-figureStartX, y-figureStartY),Math.max(x-figureStartX, y-figureStartY));
            case "filledCircle" -> g.fillOval(figureStartX,figureStartY, Math.max(x-figureStartX, y-figureStartY),Math.max(x-figureStartX, y-figureStartY));
        }
    }
}
