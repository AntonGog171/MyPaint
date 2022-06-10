import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public JMenuBar menuBar= new JMenuBar();
    private JMenuItem open;
    private JMenuItem save;
    private JMenuItem saveAs;
    private JMenuItem print;
    private JMenuItem exit;

    public Menu(){
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
    }
    private void initActionListeners(){
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }
}
