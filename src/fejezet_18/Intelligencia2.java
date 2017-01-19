package fejezet_18;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Nigel-727
 */
public class Intelligencia2 extends JFrame {
//  private JFormattedTextField ftf;// = new JFormattedTextField();
  private JTextField tf = new JTextField("", 10);
  public Intelligencia2() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400, 150);
    setLocationRelativeTo(this);
    setAlwaysOnTop(true);
    setResizable(false);
    setTitle("Intelligencica");
    //
    setLayout(new FlowLayout());
    add(new JLabel("IQ"));
 /*
    try {
      ftf = new JFormattedTextField(new MaskFormatter("###"));
    }
    catch (ParseException e) {
      ;
    }
    ftf.setColumns(8);
    add(ftf);
*/
    add(tf);
    JButton bt = new JButton("Értékel");
    JFrame szülő = this;
    bt.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
                szülő, 
                értékelés(), //üzenet
                szülő.getTitle()+" üzenetablaka", //cím
                JOptionPane.INFORMATION_MESSAGE);  //üzenettípus
      }
    });
    add(bt);
  }
  String értékelés() {
//    return ftf.getText();//TODO
    int iq;
    iq = Integer.parseInt(tf.getText()); //dobhat kivételt
    return (iq<90?"Alacsony":iq<110?"Normál":"Magas")
            +" intelligencia";
  }
  

  public static void main(String[] args) {
    new Intelligencia2().setVisible(true);
  }
}
