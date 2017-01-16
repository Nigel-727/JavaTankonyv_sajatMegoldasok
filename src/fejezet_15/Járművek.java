package fejezet_15;

/**
 *
 * @author Nigel-727
 */
interface Halad {
  void halad();
}
class Jármű implements Halad {
  public String kategória;
  Jármű() {
  }
  @Override
  public void halad() {
    System.out.println("mint Jármű, halad");
  }
}
class Autó extends Jármű {
  public int kerékDb;
  Autó(String kategória, int kerékDb) {
    this.kategória=kategória; //őstől örökölt a _kategória_
    this.kerékDb=kerékDb;
  }
  @Override
  public void halad() {
    System.out.println("mint Autó (kategória: "+kategória+", kerekekszáma: "+kerékDb+"), halad");
  }
}
class Repülőgép extends Jármű {
  public String hajtóErő;
  Repülőgép(String hajtóErő) {
    this.hajtóErő=hajtóErő;
  }
  @Override
  public void halad() {
    System.out.println("mint Repülőgép (hajtóereje: "+hajtóErő+"), halad");
  }
}
class Hajó extends Jármű {
  public String hajtóErő;
  Hajó(String hajtóErő) {
    this.hajtóErő=hajtóErő;
  }
  @Override
  public void halad() {
    System.out.println("mint Hajó (hajtóerő:"+hajtóErő+"), halad");
  }
}
class Bicikli extends Jármű {
  public int kerékDb;
  public int hajtóEmberDb;
  Bicikli(String kategória, int kerékDb) {
    this.kategória=kategória; //őstől örökölt
    this.kerékDb=kerékDb;
  }
  Bicikli(String kategória, int kerékDb, int hajtóEmberDb) {
    this(kategória, kerékDb);
    this.hajtóEmberDb=hajtóEmberDb;
  }
  @Override
  public void halad() {
    System.out.println("E bicikli egy "+kategória+", "+kerékDb+" keréken gurul, "+hajtóEmberDb+" ember hajtja.");
  }
}

public class Járművek { //eben van a main()
 
  public static void main(String[] args) {
    Jármű 
            jármű = new Jármű(),
            opelSzemélyautó = new Autó("személy",4),
            kamion = new Autó("kamion",8),
            cirkusziBicikli = new Bicikli("cirkuszi",1,1),
            tandem = new Bicikli("tandem",2,2),
            normálBicikli = new Bicikli("normál",2,1),
            utasszállítóRepülő = new Repülőgép("utasszállító"),
            vitorlázóRepülő = new Repülőgép("vitorlázó"),
            helikopter = new Repülőgép("helikopter"),
            óceánjáró = new Hajó("óceánjáró"),
            vitorlás = new Hajó("vitorlás");
    //
    Jármű[] össszesjármű = {jármű, opelSzemélyautó, kamion, cirkusziBicikli,
    tandem, normálBicikli, utasszállítóRepülő, vitorlázóRepülő, helikopter,
    óceánjáró, vitorlás};
    for (Jármű aktJármű : össszesjármű) {
      System.out.println("az aktuális ojjektum típusa:\t"
              +aktJármű.getClass().getSimpleName()
      );
      System.out.print("\t");
      aktJármű.halad();
    }
  }
}
