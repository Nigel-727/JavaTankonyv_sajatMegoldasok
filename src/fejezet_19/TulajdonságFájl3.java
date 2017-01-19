package fejezet_19;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileFilter;
import kopipaszta.ZéháSegítő;

/**
 * én is megírom, lehetőség szerint saját kútfőből
 * @author Nigel-727
 */
class MyFájlSzűrő extends FileFilter {
  @Override
  public boolean accept(File f) {
    String kisbetűsnév = f.getName().toLowerCase();
    return ( f.isDirectory() //átengedni, emiatt lehetséges navigálni az állományrendszerben
            || kisbetűsnév.endsWith(".ini")
            || kisbetűsnév.endsWith(".java")
            || kisbetűsnév.endsWith(".txt")
            );
  }
  @Override
  public String getDescription() {
    return "csak .ini .java vagy .txt amit elfogadok"; //csak tájékoztató #ígynemszép de #miértne
  }
}
public class TulajdonságFájl3 extends JFrame implements ActionListener {
  private JButton btTallóz = new JButton("Tallóz...");
  private JLabel lbTulajdonságok = new JLabel("Nincs kiválasztott fájl", SwingConstants.CENTER);
  private JFileChooser fc = new JFileChooser();
  //
  TulajdonságFájl3(String cím) {
    super(cím);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(500, 400);
    setLocationRelativeTo(this);
    setLayout(new BorderLayout());//alap
    JPanel pn = new JPanel();
    pn.add(btTallóz);
    add(pn, BorderLayout.NORTH);
    btTallóz.addActionListener(this);
    add(lbTulajdonságok);
    fc.setFileFilter(new MyFájlSzűrő());
  }
  public static void main(String[] args) {
    new TulajdonságFájl3("Fájl tulajdonságai").setVisible(true);
  }
  private void frissítCímkét() {
    File fájl = fc.getSelectedFile();
    lbTulajdonságok.setText("<html>"
            +"Útvonal: "+fájl.getPath()+"<br>"
            +"Abszolút útvonal: "+fájl.getAbsolutePath()+"<br>"
            +"Szülőmappa: "+fájl.getParent()+"<br>"
            +"Fájlnév: \""+fájl.getName()+"\"<br>"
            +"Méret: "+fájl.length()+"<br>"
            +"Olvasható? "+(fájl.canRead()?"igen":"nem")+"<br>"
            +"Írható? "+(fájl.canWrite()?"igen":"nem")+"<br>"
            +"Rejtett? "+(fájl.isHidden()?"igen":"nem")+"<br>"
            +"Utolsó módosítás: "+ZéháSegítő.dátumidő(fájl.lastModified())
            +"</html>"
    );
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    fc.setCurrentDirectory(new File("."));
    fc.setFileSelectionMode(JFileChooser.FILES_ONLY); //default: JFileChooser.FILES_ONLY
    fc.setDialogTitle("Válassz fájlt de gyorsan");
    fc.setMultiSelectionEnabled(false);
    int hogysikerült = fc.showOpenDialog(this);
    if (hogysikerült==JFileChooser.APPROVE_OPTION)
      frissítCímkét();
  }
}