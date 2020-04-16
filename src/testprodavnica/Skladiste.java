
package testprodavnica;


public class Skladiste implements SluzbaNabavke{
    int stanjeNaSkladistu = 1000;

    public int getStanjeNaSkladistu() {
        return stanjeNaSkladistu;
    }
    
    
    public void dodajRobu(int broj){
        if (broj>0)
            stanjeNaSkladistu+=broj;
        else System.out.println("Greska, broj ne sme biti 0.");
    }
    
    public void skiniSaStanja(int broj){
        if (broj>0 && broj<=stanjeNaSkladistu)
            stanjeNaSkladistu-=broj;
        else System.out.println("Greska, broj ne sme biti 0 ili ima nema toliko proizvoda na skladistu");
    }
}
