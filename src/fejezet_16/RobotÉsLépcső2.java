package fejezet_16;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

/**
 *
 * @author Nigel-727
 */
public class RobotÉsLépcső2 extends JFrame { //JPanel + OverlayLayout
  private JLabel 
          lbLépcső = new JLabel(new ImageIcon("../JavaPA/images/lépcső.gif")),
          lbRobot  = new JLabel(new ImageIcon("../JavaPA/images/robot.jpg"));
  
  public RobotÉsLépcső2() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(800, 400);
    this.setLocationRelativeTo(this);
    this.setResizable(false);
    JPanel myPanel = new JPanel();
    myPanel.setLayout(new OverlayLayout(myPanel)); //!: OverlayLayout
    lbRobot.setAlignmentX(0); lbRobot.setAlignmentY(0);    
    myPanel.add(lbRobot);
    lbLépcső.setAlignmentX(0); lbLépcső.setAlignmentY(0);
    myPanel.add(lbLépcső); //minél később adjuk hozzá annál felsőbb rétegben helyezkedik el
    this.add(myPanel);
    this.setVisible(true);
  }
 
  public static void main(String[] args) {
    new RobotÉsLépcső2();
  }
}
