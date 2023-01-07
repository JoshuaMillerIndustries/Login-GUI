import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame(); // creating new frame
        JPanel panel = new JPanel(); // creating panel
        frame.add(panel); //adding panel to JFrame
        JMenuBar menuBar = new JMenuBar(); // creating menu bar
        frame.setJMenuBar(menuBar); // adding menu bar to JFrame




        // GUI preferences

        frame.setVisible(true); // making sure frame is visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program will end when window closes
        frame.setSize(820,720); // setting height and with for window
        frame.setTitle("Cyberdyne Systems Employee Portal "); // Title of the frame




    }
}