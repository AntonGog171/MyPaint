import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Menu {
    public JMenuBar menuBar= new JMenuBar();
    private JMenuItem clear;
    private JMenuItem open;
    private JMenuItem saveAs;
    private JMenuItem print;
    private JMenuItem exit;
    private DrawPanel panel;

    public Menu(DrawPanel panel){
        this.panel =panel;
        JMenu file = new JMenu("File");
        clear = new JMenuItem("Clear");
        open = new JMenuItem("Open");
        saveAs = new JMenuItem("Save as");
        print = new JMenuItem("Print");
        exit = new JMenuItem("Exit");

        file.add(clear);
        file.add(open);
        file.add(saveAs);
        file.add(print);
        file.add(exit);

        menuBar.add(file);
        initActionListeners();
    }
    private void initActionListeners(){
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.clear();
                panel.repaint();
            }
        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFileChooser fc = new JFileChooser();
                BufferedImage myPicture = null;
                int returnVal = fc.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    File file = fc.getSelectedFile();
                    try {
                        myPicture = ImageIO.read(file);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    panel.clear();
                    panel.picuteFromFile=myPicture;
                    panel.repaint();
                }
            }
        });
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JFileChooser fc = new JFileChooser();
                int returnVal = fc.showSaveDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    File file = fc.getSelectedFile();
                    BufferedImage image=new BufferedImage(panel.getWidth(), panel.getHeight(),BufferedImage.TYPE_INT_RGB);
                    Graphics2D g2=(Graphics2D)image.getGraphics();
                    panel.paint(g2);
                    try {
                        ImageIO.write(image, "png", file);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }
}
