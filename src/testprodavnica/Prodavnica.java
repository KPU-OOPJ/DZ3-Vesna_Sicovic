
package testprodavnica;


public class Prodavnica implements SluzbaNabavke,SluzbaProdaje{
    int brojProizvoda =0;
    
    public int getBrojProizvoda() {
        return brojProizvoda;
    }
    
    public void dodajRobu(int broj){
        if (broj>0)
            brojProizvoda+=broj;
        else System.out.println("Greska, broj ne sme biti 0.");
    }

    
    
    public void prodajRobu(int broj){
        if (broj>0)
            brojProizvoda-=broj;
        else System.out.println("Greska, broj ne sme biti 0.");
    }
    
    public void ispisi(){
        System.out.println("Broj proizvoda u prodavnici: "+ brojProizvoda);
    }
    
}
