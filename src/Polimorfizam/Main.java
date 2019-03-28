package Polimorfizam;

import java.util.Vector;

public class Main 
{
	public static void main(String[] args) 
	{
		
		Poruka telegram = new PorukaAdresirana(
				"Pera Peric", "Neko Nekic", "Ovo je poruka :)");
		Vector<Poruka> poruke = new Vector<Poruka>();
		poruke.add(new PorukaSaNaslovom("Hej :)"));
		poruke.add(new PorukaSaNaslovom("Ova i naslov ima :)",
                "Ovde bi isla poruka "
                + "da imam neku ideju :D"));
		poruke.add(telegram);
		
	
		
		
		for (Poruka poruka: poruke)
		{
			System.out.println(poruka.dajPoruku(true, true)); 
		}
	}
}
