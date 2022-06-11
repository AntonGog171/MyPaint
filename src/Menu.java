import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Menu {
    public JMenuBar menuBar= new JMenuBar();
    private JMenuItem open;
    private JMenuItem save;
    private JMenuItem saveAs;
    private JMenuItem print;
    private JMenuItem exit;
    private DrawPanel canvas;

    public Menu(DrawPanel panel){
        this.canvas=panel;
        JMenu file = new JMenu("File");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save as");
        print = new JMenuItem("Print");
        exit = new JMenuItem("Exit");

        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(print);
        file.add(exit);

        menuBar.add(file);
        initActionListeners();
    }
    private void initActionListeners(){
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFileChooser fc = new JFileChooser();
                int returnVal = fc.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    File file = fc.getSelectedFile();
                }
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFileChooser fc = new JFileChooser();
                int returnVal = fc.showSaveDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    File file = fc.getSelectedFile();
                    BufferedImage image=new BufferedImage(canvas.getWidth(), canvas.getHeight(),BufferedImage.TYPE_INT_RGB);
                    Graphics2D g2=(Graphics2D)image.getGraphics();
                    canvas.paint(g2);
                    try {
                        ImageIO.write(image, "png", file);
                    } catch (Exception ex) {

                    }
                }
            }
        });
    }
}
