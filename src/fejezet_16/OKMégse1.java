package fejezet_16;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Nigel-727
 */
public class OKMégse1 extends JFrame { //benne: FlowLayout #sorfolytonos
  private JButton btOK = new JButton("Oké");
  private JButton btMégse = new JButton("Nemár");
  public OKMégse1() { //a konstruktor
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Oké...vagy mégse!?");
    this.setSize(450, 150);
    this.setLocationRelativeTo(this);
    this.add(btOK);
    this.add(btMégse);
    this.setLayout(new FlowLayout()); 
    //!: elrendezésmenedszer "FlowLayout" :sorfolytonos -> komponensek mérete _állandó_
    //!: az elrendezésmenedzser az ablak konténerének ÖSSZES komponensére vonatkozik
    this.setVisible(true);
  }
  public static void main(String[] args) {
    new OKMégse1(); //példányosítunk
  }
}
