
import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import java.util.ArrayList; // import the ArrayList class

public class calculator{
    public static void main(String[] arg){
 
        JFrame frame = new JFrame("Calculator");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("Calculator");  
        JButton button = new JButton();  
        button.setText("1");  
        button.setText("2"); 
        panel.add(label);  
        panel.add(button);  
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