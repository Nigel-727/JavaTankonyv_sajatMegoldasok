package fejezet_16;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Nigel-727
 */
public class Nyomógombok1 extends JFrame {  //benne: GridLayout #rácsos
  public Nyomógombok1() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Nyomógombok1");
    setSize(350,150);
    setLocationRelativeTo(this);
    setLayout(new GridLayout(2, 3, 5, 5)); //!: GridLayout elrendezésmenedzserm
    //utolsó kettő paraméter: hgap és vgap térközök    
    for (int i = 1; i <= 6; i++) {
      add(new JButton(""+i)); //utólag a konténer bejárásával elérhetők; hogyan?
    }
    setVisible(true);
  }
  public static void main(String[] args) {
    new Nyomógombok1();
  }
}
