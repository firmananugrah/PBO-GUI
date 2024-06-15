/*  NAMA    : ARI PERDIAN
    KELAS   : TI22J
    NIM     : 20220040072
*/

import javax.swing.*;
import java.awt.*;

public class TugasGui extends JFrame {

    TugasGui() {
        super("Aplikasi penggajian");
        setSize(400, 400); // Set the width and height of the frame
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(new BorderLayout()); // Set the layout of the frame to BorderLayout

        // Create a JTextField and add it to the top of the frame
        JTextField textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        // Create a panel with GridLayout for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 6, 5, 5)); // 3 rows, 6 columns, with gaps between buttons

        // Create buttons and add them to the panel
        String[] buttonLabels = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "=", "%", "Mod", "Exit"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
        }

        // Add the button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true); // Display the frame
    }

    public static void main(String[] args) {
        // Create an instance of TugasGui to display the frame
        new TugasGui();
    }
}
