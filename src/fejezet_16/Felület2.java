package fejezet_16;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Nigel-727
 */
public class Felület2 extends JFrame {
  public Felület2() { //konstruktor
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Felület2 programocska");
    setSize(400, 400);
    setLocationRelativeTo(this);
    setResizable(true); //egyelőre
    setLayout(new GridLayout(4,4));
    //
    for (int i = 1; i <= 16; i++) {
      JLabel myLabel = new JLabel(""+i);
      myLabel.setFont(new Font("Arial", Font.BOLD, i*2));
      myLabel.setHorizontalAlignment(SwingConstants.CENTER);
      add(myLabel);
    }
    //
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new Felület2();
  }
}
