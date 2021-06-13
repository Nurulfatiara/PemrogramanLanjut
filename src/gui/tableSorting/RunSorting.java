package gui.tableSorting;

import javax.swing.*;
public class RunSorting {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * Set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/icon.png");
        JFrame jFrame = new JFrame("Program Sorting Angka");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new ProgramSorting().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1200, 700);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
