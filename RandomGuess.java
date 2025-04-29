// RandomGuess.java
import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        // First dialog box: Ask user to think of a number
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.");

        // Second dialog box: Show a random number between 1 and 10
        JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random() * 10)));
    }
}
