package fejezet_18;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import kopipaszta.ZéháSegítő;

/**
 *
 * @author Nigel-727
 */
public class ÖtösHatosHetesLottó2 extends JFrame implements ActionListener {
  private static final String[] LOTTÓFAJTÁK = {"Ötöslottó", "Hatoslottó", "Heteslottó"};
  private static final int[][] HÁNYAT_HÁNYBÓL = { {5, 90},  //hányat, hányból
                                                  {6, 45}, 
                                                  {7, 35} };
	private JComboBox cb = new JComboBox(LOTTÓFAJTÁK);
  //faépítés:
  private DefaultMutableTreeNode faGyökér = new DefaultMutableTreeNode("Lottószelvények");
  private DefaultTreeModel dtmLottó = new DefaultTreeModel(faGyökér);
  private JTree tLottó = new JTree(dtmLottó);
  
  ÖtösHatosHetesLottó2(String üzi) {
    super(üzi);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setAlwaysOnTop(true);
    setResizable(true); 
    setSize(500, 500);
    setLocationRelativeTo(this);
    setLayout(new BorderLayout()); //alapból amúgy
    JPanel pn = new JPanel();
    pn.add(cb);
    JButton bt = new JButton("Generál");
    bt.addActionListener(this);
    pn.add(bt);
    add(pn, BorderLayout.NORTH);
    //
    for (int i = 0; i < cb.getItemCount(); i++) {
      Object item = cb.getItemAt(i);
      faGyökér.add(new DefaultMutableTreeNode(item)); //névtelen node-ok; később emiatt nehéz lehet rájuk hivatkozni
    }
    tLottó.expandRow(0);
    add(new JScrollPane(tLottó)); //alapból a BorderLayout.CENTER-be rakja
  }
  private void fábaSzúr(ArrayList<Integer> újszelvény) {
    DefaultMutableTreeNode ideszúrd; //Ötöslottó (0), Hatoslottó (1), Heteslottó (2)
    ideszúrd = (DefaultMutableTreeNode)dtmLottó.getChild(faGyökér, cb.getSelectedIndex());
//    ideszúrd.add(new DefaultMutableTreeNode(újszelvény)); //!: elsőre OK, de utána nem rajzolja újra a fát
    dtmLottó.insertNodeInto(new DefaultMutableTreeNode(újszelvény), ideszúrd, 0); //!: újrarajzolja a fát
    ideszúrd.setUserObject(cb.getSelectedItem().toString()+" ("+ideszúrd.getChildCount() +" db)");
  }
  public void actionPerformed(ActionEvent e) {    
    int választás = cb.getSelectedIndex();
    fábaSzúr(
            ZéháSegítő.lottószámok(
                    HÁNYAT_HÁNYBÓL[választás][0], HÁNYAT_HÁNYBÓL[választás][1]));
    ZéháSegítő.setFaÁllapot(tLottó, true); //#wow
  }
  public static void main(String[] args) {
    new ÖtösHatosHetesLottó2("Lottószelvényeck").setVisible(true);
  }
}