package fejezet_13.téglalapok2;

import java.util.ArrayList;

class Téglalap {

  private double a, b;

  public Téglalap(double a, double b) {
    if(a<=0 || b<=0)
      throw new IllegalArgumentException(               //1
        "A téglalap oldalai nem pozitívak!");
    this.a=a;
    this.b=b;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double kerület() {
    return 2*(a+b);
  }

  public double terület() {
    return a*b;
  }

  @Override
  public String toString() {
    return getClass().getName()+": "+
      " a= "+extra.Format.right(a, 6, 2)+
      " b= "+extra.Format.right(b, 6, 2)+
      " K= "+extra.Format.right(kerület(), 6, 2)+
      " T= "+extra.Format.right(terület(), 6, 2);
  }

  public boolean equals(Téglalap téglalap) {            //2
    return (téglalap.getA()==a && téglalap.getB()==b) ||
           (téglalap.getA()==b && téglalap.getB()==a);
  }
}//class Téglalap

public class TéglalapokListában2 {
  public static void main(String[] args) {
//    ArrayList<Téglalap> téglalapLista=new ArrayList<>();
    ArrayList téglalapLista=new ArrayList();
    téglalapLista.add(new Téglalap(6, 8));
    téglalapLista.add(new Téglalap(10, 5));
    téglalapLista.add(new Téglalap(8, 6));
    téglalapLista.add(new Téglalap(4, 16));
    téglalapLista.add(new Téglalap(15, 40));
    System.out.println("A téglalapok:\n"+téglalapLista);
    Téglalap téglalapMinta=new Téglalap(6, 8);          //3
    System.out.println("Az összehasonlításhoz használt " +
      "téglalap:\n"+téglalapMinta);
    System.out.println("Az oldalak összehasonlítása " +
      "alapján megegyező téglalapok:");
    //#ÍGY vagy
    for(Object o: téglalapLista) {
      if(((Téglalap)o).equals(téglalapMinta))                
        System.out.println((Téglalap)o);                   
    }
    System.out.println("valamint");
    //#ÚGY
    for(Object o: téglalapLista) {
      Téglalap téglalap = (Téglalap)o;
      if(téglalap.equals(téglalapMinta))                
        System.out.println(téglalap);                   
    }
    //#AMÚGY
    System.out.println("valamint");
    for(int i=0; i<téglalapLista.size()-1; i++) {
      Téglalap téglalap=(Téglalap)téglalapLista.get(i);
      if(téglalap.equals(téglalapMinta))
        System.out.println(téglalap);
    }
  } //class TéglalapokListában2
}