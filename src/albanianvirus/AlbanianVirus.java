package albanianvirus;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;


public class AlbanianVirus {

    public static void main(String[] args) {
        String text = "TVRJYjladzhJeFlOZVZDcDJSb1o2cGU2VllHckI4emU3ZjF5S01ZWA==";
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, text, "why acting sus?", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
    
}
