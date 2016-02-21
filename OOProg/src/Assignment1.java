import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by mb_ch on 2/10/2016.
 */
public class Assignment1 extends JFrame {
    public Assignment1() {
        super("Graph Frame");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setSize(500, 500);

        JMenuBar menuBar = new JMenuBar();
        JMenu program = new JMenu("Program");
        setJMenuBar(menuBar);
        menuBar.add(program);
        JMenuItem about = new JMenuItem("About..");
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(getContentPane(), "MainWindow, Design Pattern by Marc Charette");
            }
        });
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        program.add(about);
        program.add(exit);

        JMenu edit = new JMenu("Edit");
        JMenuItem redo = new JMenuItem("Redo");
        JMenuItem undo = new JMenuItem("Undo");
        redo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        edit.add(redo);
        edit.add(undo);
        menuBar.add(edit);

        JMenu graphs = new JMenu("Graphs");
        JMenuItem barG = new JMenuItem("Bar Graph");
        JMenuItem pieG = new JMenuItem("Pie Graph");
        graphs.add(barG);
        graphs.add(pieG);
        menuBar.add(graphs);

        setLayout(new FormLayout());
        JTextField one = new JTextField();
        JTextField two = new JTextField();
        JTextField three = new JTextField();
        JTextField four = new JTextField();
        JTextField five = new JTextField();


        pack();

    }


    public static void main(String[] args){
        JFrame j = new Assignment1();
        j.setVisible(true);
    }

}
