public class OOP 
{
	static ProbnaKlasa noviObjekat = new ProbnaKlasa(5, "aaa", false);
	
	public static void main(String[] args) 
	{	
		int x;
		x = 5;
		ProbnaKlasa prviObjekat;
		prviObjekat = new ProbnaKlasa(5, "tekst", true);
		ProbnaKlasa drugiObjekat = new ProbnaKlasa(5, "tekst", false);
		System.out.println(prviObjekat.toString());
		System.out.println("Pre poziva: " + prviObjekat.dajStvari());
		nesto(prviObjekat);
		System.out.println(prviObjekat.dajStvari());
	}
	
	public static void nesto(ProbnaKlasa nekiObjekat)
	{
		noviObjekat = new ProbnaKlasa(52, "tekst", true);
		noviObjekat.broj *= 2;
		System.out.println(noviObjekat.dajStvari());
	}
}
