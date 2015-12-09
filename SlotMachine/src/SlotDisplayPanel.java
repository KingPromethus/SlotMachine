import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.security.SecureRandom;

/**
 * Created by mb_ch on 12/8/2015.
 */
public class SlotDisplayPanel extends JPanel {

    JButton[] slots = new JButton[3];

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    public SlotDisplayPanel(){
        setLayout(new FlowLayout());
        Image question;
        question = getImage("mystery.gif");
        for(int i = 0; i < 3; i++){
            slots[i] = new JButton(new ImageIcon(question));
        }

        add(slots[0]);
        add(slots[1]);
        add(slots[2]);
    }

    public void changeImage(){
        Image[] imageArray = new Image[6];
        imageArray[0] = getImage("bar.jpg");
        imageArray[1] = getImage("cherry.jpg");
        imageArray[2] = getImage("donut.jpg");
        imageArray[3] = getImage("lemon.jpg");
        imageArray[4] = getImage("star.gif");
        imageArray[5] = getImage("triangle.gif");

        SecureRandom rando = new SecureRandom();
        slots[0].setIcon(new ImageIcon(imageArray[rando.nextInt(6)]));
        slots[1].setIcon(new ImageIcon(imageArray[rando.nextInt(6)]));
        slots[2].setIcon(new ImageIcon(imageArray[rando.nextInt(6)]));
        repaint();



    }


    private Image getImage(String filename){
        URL url = getClass().getResource(filename);
        ImageIcon icon = new ImageIcon(url);
        return icon.getImage();

    }

}
