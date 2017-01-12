package fejezet_16;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Nigel-727
 */
public class Felület3 extends JFrame { //JPanel(new GridLayout...
  
  public Felület3() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Felület3, avagy színes panelek sorszámmal");
    setSize(500, 300);
    setResizable(true);
    setLocationRelativeTo(this);
    setLayout(new GridLayout(4, 4, 10, 5));
    //
    
    //
    for (int i = 0; i < 16; i++) {
      JPanel újPanel = new JPanel(new GridLayout(1, 1)); //!: grid...: a függőleges centerezéshez
      újPanel.setBackground(
        new Color((int)(Math.random()*256),
                  (int)(Math.random()*256),
                  (int)(Math.random()*256)));
//      újPanel.setBackground(Color.RED);
      JLabel lbCímke = new JLabel();
      lbCímke.setText(Integer.toString(i+1));
      lbCímke.setHorizontalAlignment(SwingConstants.CENTER); //muszáj
      újPanel.add(lbCímke);
//      újPanel.setLayout(new BoxLayout(újPanel, BoxLayout.X_AXIS));
      add(újPanel);
    }
    //
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new Felület3();
  }
}
