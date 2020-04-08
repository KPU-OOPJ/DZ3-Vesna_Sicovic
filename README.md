**Napravite klase SluzbaNabavke, SluzbaProdaje, Prodavnica, Skladiste, Dobavljac i TestProdavnica sa sledećim uslovima:**

a)	Interfejs SluzbaNabavke koja ima: 
-	Metodu dodajRobu koja ne vraća ništa, a kao ulazni argument prima broj komada određenog proizvoda koji je potrebno dodati. 

b)	Interfejs SluzbaProdaje koji ima: 
-	Metodu prodajRobu koja ne vraća ništa, a kao ulazni argument prima broj komada određenog proizvoda koji je potrebno prodati. 

c)	Klasa Prodavnica koja implementira interfejse SluzbaNabavke i SluzbaProdaje i ima: 
-	Atribut brojProizvoda koji predstavlja koliko ima komada određenog proizvoda u prodavnici.Početna vrednost za ovaj atribut je 0. 
-	Implementiranu metodu dodajRobu koja kao ulazni argument prima broj komada određenog proizvoda koji je potrebno dodati i dodaje ga na brojProizvoda. Dodavanje se vrši samo ako je vrednost ulaznog argumenta veća od nule, a u suprotnom se ispisuje poruka o grešci. 
-	Implementiranu metodu prodajRobu koja kao ulazni argument prima broj komada određenog proizvoda koji je potrebno prodati i oduzima ga od atributa brojProizvoda. Prodaja se vrši samo ako je vrednost ulaznog argumenta veća od nule i ako ima dovoljno proizvoda u prodavnici, a u suprotnom se ispisuje poruka o grešci. 
-	Metodu ispisi koja ispisuje koliko ima proizvoda u prodavnici. 

d)	Klasa Skladiste koja implementira interfejs SluzbaNabavke i ima: 
-	Atribut stanjeNaSkladistu koji predstavlja koliko ima komada određenog proizvoda u prodavnici.Početna vrednost za ovaj atribut je 1000. 
-	Implementiranu metodu dodajRobu koja kao ulazni argument prima broj komada određenog proizvoda koji je potrebno dodati i dodaje ga na stanjeNaSkladistu. Dodavanje se vrši samo ako je vrednost ulaznog argumenta veća od nule, a u suprotnom se ispisuje poruka o grešci. 
-	Metodu skiniSaStanja koja kao ulazni argument prima broj komada određenog proizvoda koji je potrebno skinuti sa stanja i oduzima ga od atributa stanjeNaSkladistu. Skidanje sa stanja se vrši samo ako je vrednost ulaznog argumenta veća od nule i ako ima dovoljno proizvoda u skladištu, a u suprotnom se ispisuje poruka o grešci. 

e)	Klasa Dobavljac koja ima: 
-	Metodu izvrsiIsporuku koja kao ulazni argument dobija interfejs SluzbaNabavke i broj proizvoda koji je potrebno isporučiti. Isporuka robe se vrši pozivom metode dodajRobu interfejsa SluzbaNabavke sa brojem proizvoda kao ulaznim argumentom. 

f)	Klasa TestProdavnica koja kreira po jedan objekat klase Prodavnica, Skladiste i Dobavljac. Ispisati koliko ima proizvoda u prodavnici, a onda dodati robu (100 komada) u prodavnicu korišćenjem metode izvrsiIsporuku klase Dobavljac. Potom je potrebno dodati robu (500 komada) u skladište korišćenjem metode izvrsiIsporuku klase Dobavljac. Ponovo ispisati koliko ima proizvoda u prodavnici. 
