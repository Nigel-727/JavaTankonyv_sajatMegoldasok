package fejezet_18;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author Nigel-727
 */
public class MenüSzámológép extends JFrame implements ActionListener {
  private JMenuBar mbFőmenü = new JMenuBar();
  private JMenu mSzerkesztés = new JMenu("Szerkesztés");
  private JMenuItem miBeillesztés = new JMenuItem("Beillesztés");
  private JMenu mNézet = new JMenu("Nézet");
  private JRadioButtonMenuItem miNormál = new JRadioButtonMenuItem("Normál", true);
  private JRadioButtonMenuItem miTudományos = new JRadioButtonMenuItem("Tudományos");
  private JMenuItem miSzámjegyekCsoportosítása = new JMenuItem("Számjegyek csoportosítása");
  private JMenu mSúgó = new JMenu("Súgó");
  private JMenuItem miSúgóTémakörök = new JMenuItem("Témakörök");
  private JMenuItem miSúgóNévjegy = new JMenuItem("Névjegy");

  public MenüSzámológép() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Számológép - menü");
    setSize(500, 300);
    setLocationRelativeTo(this);
    setResizable(false);
    setAlwaysOnTop(true);
    setJMenuBar(mbFőmenü);
    //
    mbFőmenü.add(mSzerkesztés); mbFőmenü.add(mNézet); mbFőmenü.add(mSúgó);
    mSzerkesztés.add(miBeillesztés);
    //
    ButtonGroup bg = new ButtonGroup();
    bg.add(miNormál); bg.add(miTudományos);
    //
    mNézet.add(miNormál); mNézet.add(miTudományos); mNézet.addSeparator();
    mNézet.add(miSzámjegyekCsoportosítása);
    mSúgó.add(miSúgóTémakörök); mSúgó.add(miSúgóNévjegy);
    //#TODO Alábbit zéhásegítő-be rakni
    for (int i = 0; i< mbFőmenü.getMenuCount(); i++) { 
      JMenu aktMenü = mbFőmenü.getMenu(i);
      for (Component menüponty : aktMenü.getMenuComponents()) {
        if (menüponty instanceof JMenuItem)
          ((JMenuItem) menüponty).addActionListener(this);
      }
    }
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    String str = e.getActionCommand();
    System.out.println(""+str);
  }
  public static void main(String[] args) {
    new MenüSzámológép().setVisible(true);
  }
}