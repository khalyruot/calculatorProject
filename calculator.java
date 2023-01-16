
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList; // import the ArrayList class

public class calculator {
    public static void main(String[] arg) {

        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Calculator");
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ArrayList<Integer> buttons = new ArrayList<Integer>(); // Create an ArrayList object
        buttons.add(1);
        buttons.add(2);
        buttons.add(3);
        buttons.add(4);
        buttons.add(5);
        buttons.add(6);
        buttons.add(7);
        buttons.add(8);
        buttons.add(9);

        System.out.println(buttons);
    }

}