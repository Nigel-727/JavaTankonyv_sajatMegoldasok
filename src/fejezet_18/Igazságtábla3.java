package fejezet_18;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * BMIindex6 mintájára megpróbálom szétválasztani az adatmodellt a GUI-tól
 * @author Nigel-727
 */

class Tábla { //adatmodell
  final boolean[]  //TODO setter, getter
            A = {false,false,true,true},
            B = {false,true,false,true};
  boolean[] results = new boolean[4]; //TODO setter, getter
  private String[] MŰVELETEK = {"&&","||","^","->","<->"};  
  //
  public String[] getMenüpontok() {
    return MŰVELETEK;
  }
  private boolean művelet(boolean egyik, String operátor, boolean másik) {
    boolean ezkellneked = false;
    switch (operátor) {
      case "&&" : ezkellneked=egyik && másik; break;
      case "||" : ezkellneked=egyik || másik; break;
      case "^"  : ezkellneked=egyik ^ másik;  break;
      case "->" : ezkellneked=!egyik || másik; break;
      case "<->" : ezkellneked=!(egyik^másik); break;
      default: System.out.println("gáz van"); break; //#TODObjkivételt
    }
    return ezkellneked; 
  }
  public void setResults(String operátor) {
    for (int i = 0; i < 4; i++) 
      this.results[i] = művelet(A[i], operátor, B[i]);
  }
}
/////////////////////////////////////////////////////////////////////
class Ablak extends JFrame implements ActionListener { //ablakmodell
  private Tábla tábla = new Tábla();
  private JComboBox cbMűveletek = new JComboBox(tábla.getMenüpontok());
  private JLabel[] lbTáblAB = new JLabel[4];
  private String aktMűvelet 
          = cbMűveletek.getSelectedItem().toString(); //azért mert nem tudok doClicket() hívni a JComboBox-ra
  
  Ablak() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(350, 200);
    this.setLocationRelativeTo(this);
    this.setTitle("Igazságtábla");
    this.setResizable(false); //#kezdetben
    //
    this.setLayout(new GridLayout(5, 3));
    this.add(new JLabel("A"));
    this.add(new JLabel("B"));
    JPanel pn = new JPanel();
    pn.add(new JLabel("A"));
    pn.add(cbMűveletek);
    pn.add(new JLabel("B"));
    this.add(pn);
    //
    cbMűveletek.addActionListener(this);
    //
    for (int i = 0; i < 4; i++) {
      this.add(new JLabel(""+tábla.A[i]));
      this.add(new JLabel(""+tábla.B[i]));
      this.add(lbTáblAB[i] = new JLabel(Boolean.toString(tábla.results[i])));
    }
    //Trükkel
    for(int i=0; i<this.getContentPane().getComponentCount(); i++) {
      Component komponens=this.getContentPane().getComponent(i);
      if(komponens instanceof JLabel)
        ((JLabel)(komponens)).setHorizontalAlignment(SwingConstants.CENTER);
    }
    //
    táblaFrissít();
    setVisible(true);
  }
  void táblaFrissít() { //aktMűvelet szerint
    tábla.setResults(aktMűvelet);
    for (int i = 0; i < 4; i++) {
      lbTáblAB[i].setText(""+tábla.results[i]);
    }
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    aktMűvelet = ((JComboBox)e.getSource()).getSelectedItem().toString();
    táblaFrissít();
  }
}

public class Igazságtábla3 {
  public static void main(String[] args) {
    new Ablak();
  }
}