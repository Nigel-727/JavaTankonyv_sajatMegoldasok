package fejezet_18;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 *
 * @author Nigel-727
 */
public class Rádiógomb3 
        extends JFrame implements ActionListener {
  JLabel lbMinta = new JLabel("Minta szöveg");
  JRadioButton rbBalra = new JRadioButton("balra");
  JRadioButton rbKözépre = new JRadioButton("középre");
  JRadioButton rbJobbra = new JRadioButton("jobbra", true);

  public Rádiógomb3() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE); //néha do_nothing #vagymi
    this.setTitle("Szöveg igazítás");
    this.setSize(400, 200);
    this.setLocationRelativeTo(this);
    setResizable(false);
    this.setLayout(new GridLayout(2, 1));
    //
    lbMinta.setFont(new Font(lbMinta.getFont().getFontName(), lbMinta.getFont().getStyle(), 30));
    this.add(lbMinta);
    //
    ButtonGroup bg = new ButtonGroup();
    bg.add(rbBalra); bg.add(rbKözépre); bg.add(rbJobbra);
    JPanel pnGombok = new JPanel();
    pnGombok.add(rbBalra); pnGombok.add(rbKözépre); pnGombok.add(rbJobbra);
    this.add(pnGombok);
    //
    this.rbBalra.addActionListener(this);
    this.rbKözépre.addActionListener(this);
    this.rbJobbra.addActionListener(this);
    //
    this.setVisible(true);
    rbJobbra.doClick();
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource()==rbBalra)
      lbMinta.setHorizontalAlignment(SwingConstants.LEFT);
    else if (e.getSource()==rbKözépre)
      lbMinta.setHorizontalAlignment(SwingConstants.CENTER);
    else if (e.getSource()==rbJobbra)
      lbMinta.setHorizontalAlignment(SwingConstants.RIGHT);
    //dobjunk egy kivételt #gázvan
  }
  public static void main(String[] args) {
    new Rádiógomb3();
  }
}