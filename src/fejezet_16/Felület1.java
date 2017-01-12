package fejezet_16;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nigel-727
 */
public class Felület1 extends JFrame { //GridLayout
  private JLabel lbCímke = new JLabel("Minta szöveg, vagy mint az írás");
  private JButton btBal = new JButton("Balra"),
                  btKözép = new JButton("Középre"),
                  btJobb = new JButton("Jobbra");
  public Felület1() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(300, 200);
    this.setTitle("Felület1 programocska");
    this.setLocationRelativeTo(this);
    //
    this.add(lbCímke);
    //
    JPanel pn=new JPanel();
    pn.add(btBal);
    pn.add(btKözép);
    pn.add(btJobb);
    this.add(pn);
    //
    this.setLayout(new GridLayout(2, 1));
    this.setVisible(true);
  }
  public static void main(String[] args) {
    new Felület1();
  }
}
