package fejezet_16;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nigel-727
 */
public class OKMégse2 extends JFrame { //benne: JPanel + (csak panelre:) BoxLayout
  private JButton btOK = new JButton("Oké");
  private JButton btMégse = new JButton("Nemár");
  public OKMégse2() { //konstruktor
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("oké vagy mégse #2");
    setSize(400, 150);
    setLocationRelativeTo(this);
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(btOK);
    panel.add(btMégse);
    add(panel);
    setVisible(true);
  }
  public static void main(String[] args) {
    new OKMégse2();
  }
}
