
package testprodavnica;


public class TestProdavnica {

    public static void main(String[] args) {
        Prodavnica p = new Prodavnica();
        Skladiste s = new Skladiste();
        Dobavljac d = new Dobavljac();
        
        p.ispisi();
        d.izvrsiIsporuku(p,100);
        
        d.izvrsiIsporuku(s, 500);
        p.ispisi();
    }
    
}
