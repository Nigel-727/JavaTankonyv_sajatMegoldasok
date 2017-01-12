package fejezet_16;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Nigel-727
 */
public class Nyomógombok2 extends JFrame { //benne: BorderLayout #ÉNyKöKeD

  public Nyomógombok2() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Nyomógombok");
    setSize(300, 300);
    setLocationRelativeTo(this);
    add(new JButton("északi gomb"), BorderLayout.NORTH);
    add(new JButton("déli gomb"), BorderLayout.SOUTH);
    add(new JButton("nyugati gomb"), BorderLayout.WEST);
    add(new JButton("keleti gomb"), BorderLayout.EAST);
    JLabel lbKözépső = new JLabel("középső címke");
    lbKözépső.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbKözépső, BorderLayout.CENTER);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new Nyomógombok2();
  }
  
}

