
public class ProbnaKlasa 
{
	public int broj;
	public String tekst;
	
	public String dajStvari()
	{
		return this.tekst + " - " + broj;
	}
	
	public ProbnaKlasa(int x, int y, String txt) 
	{
		this.broj = x+y;
		this.tekst = txt;
	}
	
	public ProbnaKlasa(int x, String txt, boolean test)
	{
		if (test)
		{
			this.broj = x;
			this.tekst = txt;
		} else
		{
			this.broj = ++x;
			this.tekst = txt.toUpperCase();
		}
	}
	
}
