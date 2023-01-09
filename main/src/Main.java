import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create frame, panel, and label
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel();
        frame.add(panel);

        // Set icon for label
        ImageIcon image = new ImageIcon("icon.png");
        label.setIcon(image);

        // Add label to panel
        panel.add(label);

        // Set GUI preferences
        frame.setTitle("Glasgow University Student Database");
        frame.setSize(820, 720);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        panel.setBackground(Color.GRAY);
        frame.setVisible(true);

        while (true) {
            // Prompt user for key phrase
            String keyPhrase = JOptionPane.showInputDialog(frame, "Enter the key phrase to continue:");

            // Check if key phrase is correct
            if (keyPhrase.equals("unlock")) {
                // Key phrase is correct, open new window
                JFrame studentLookupFrame = new JFrame();
                studentLookupFrame.setTitle("Student Lookup");
                studentLookupFrame.setSize(820, 720);
                studentLookupFrame.setLocationRelativeTo(null);
                studentLookupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                studentLookupFrame.setResizable(false);
                studentLookupFrame.setVisible(true);

                // Exit loop
                break;
            } else {
                // Key phrase is incorrect, display error message
                JOptionPane.showMessageDialog(frame, "Incorrect key phrase. Access denied.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}