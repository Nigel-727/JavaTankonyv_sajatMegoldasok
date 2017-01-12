package fejezet_16;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Nigel-727
 */
public class Betű extends JFrame {
  private JLabel lbDuma = new JLabel("Tessék:");
  public Betű() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("KépernyőfelbontásApp");
    setSize(450, 250);
    setLocationRelativeTo(this); //"If the component is not null and is shown on the screen, then the window is located in such a way that the center of the window coincides with the center of the component."
    setResizable(false);
    Font betűtípus = new Font("Arial", Font.BOLD, 30);
    lbDuma.setFont(betűtípus);
    lbDuma.setBackground(Color.YELLOW);
    lbDuma.setForeground(Color.BLUE);
    lbDuma.setHorizontalAlignment(SwingConstants.CENTER);
    String pluszduma=Toolkit.getDefaultToolkit().getScreenSize().getWidth() 
                + "*" + Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    lbDuma.setText(lbDuma.getText()+" "+pluszduma);
    add(lbDuma);
    setVisible(true);
  }
  public static void main(String[] args) {
    new Betű();
  }
}
