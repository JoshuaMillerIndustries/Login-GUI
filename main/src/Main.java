import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create frame, panel, and label
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel();
        frame.add(panel);

        // Add label to panel
        panel.add(label);

        // Create login button and close window button
        JButton loginButton = new JButton("Log In");
        JButton closeButton = new JButton("Close Window");

// Set the layout for the panel to be FlowLayout
        panel.setLayout(new FlowLayout());

// Add buttons to panel
        panel.add(loginButton);
        panel.add(closeButton);

// Set GUI preferences
        frame.setTitle("Glasgow University Student Database");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        panel.setBackground(Color.GRAY);
        frame.setVisible(true);



        // Add action listener to login button
        loginButton.addActionListener(e -> {
            // Get key phrase from input dialog
            String keyPhrase = JOptionPane.showInputDialog(frame, "Enter the key phrase to continue:");

            // Check if key phrase is correct
            if (keyPhrase != null && keyPhrase.equals("unlock")) {
                // Key phrase is correct, open new window
                JFrame studentLookupFrame = new JFrame();
                studentLookupFrame.setTitle("Class SWE 002 Building 4B Room 451 ");
                studentLookupFrame.setSize(820, 720);
                studentLookupFrame.setLocationRelativeTo(null);
                studentLookupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                studentLookupFrame.setResizable(false);
                studentLookupFrame.setVisible(true);
                studentLookupFrame.getContentPane().setBackground(Color.GRAY);

                // Create split pane and add it to the student lookup frame
                JSplitPane splitPane = new JSplitPane();
                studentLookupFrame.add(splitPane);

                // Create a list of students and add it to the left side of the split pane
                JList<String> studentList = new JList<>(new String[]{"Aberts, Joshua", "Baker, Emily",
                        "Carter, Sarah",
                        "Davies, James",
                        "Evans, Rachel",
                        "Foster, Michael",
                        "Gibson, Samantha",
                        "Hamilton, William",
                        "Ingram, Jessica",
                        "Jones, Christopher",
                        "Kelley, Rachel",
                        "Lopez, Jose",
                        "Martin, Ashley",
                        "Nelson, Emily",
                        "Owen, David",
                        "Parker, Sarah",
                        "Quinn, James",
                        "Roberts, Rachel",
                        "Scott, Michael",
                        "Taylor, Samantha",
                        "Underwood, William",
                        "Vasquez, Jessica",
                        "Wilson, Christopher",
                        "Xu, Rachel",
                        "Young, Jose",
                        "Zimmerman, Ashley"});
                splitPane.setLeftComponent(studentList);

                // Create a panel to display the details of the selected student and add it to the right side of the split pane
                JPanel studentDetailsPanel = new JPanel();
                studentDetailsPanel.add(new JLabel("Name: Student 1"));
                studentDetailsPanel.add(new JLabel("Enrollment Date: 01/01/2020"));
                studentDetailsPanel.add(new JLabel("Major: Computer Science"));

                        splitPane.setRightComponent(studentDetailsPanel);

                // Close the first window
                frame.dispose();
            } else {
                // Key phrase is incorrect or empty, display error message
                JOptionPane.showMessageDialog(frame, "Incorrect key phrase. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
