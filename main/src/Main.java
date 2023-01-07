import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Create frame and panel
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        // Create menu bar and menu item
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        menu.add(menuItem);
        menuBar.add(menu);

        // Set menu bar for frame
        frame.setJMenuBar(menuBar);

        // Set GUI preferences
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(820, 720);
        frame.setTitle("Cyberdyne Systems Employee Portal");
    }
}
