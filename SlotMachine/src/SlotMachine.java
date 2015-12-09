import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by mb_ch on 12/8/2015.
 */
public class SlotMachine extends JFrame {
    Timer timer;

    public SlotMachine(){
        super("Slot Machine");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        SlotDisplayPanel slotDisplayPanel = new SlotDisplayPanel();
        add(slotDisplayPanel, BorderLayout.CENTER);

        ActionListener timerlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slotDisplayPanel.changeImage();
            }
        };
        timer = new Timer(100, timerlistener);

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        JPanel south = new JPanel(new FlowLayout());
        south.add(startButton);
        south.add(stopButton);
        add(south, BorderLayout.SOUTH);






        pack();


    }

    private Image getImage(String filename){
        URL url = getClass().getResource(filename);
        ImageIcon icon = new ImageIcon(url);
        return icon.getImage();

    }

    public static void main(String[] args){
        JFrame display = new SlotMachine();
        display.setSize(500, 300);
        display.setResizable(false);
        display.setVisible(true);
        display.setLocationRelativeTo(null);

    }

}
