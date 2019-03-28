package Polimorfizam;

public class PorukaSaNaslovom extends Poruka 
{
	
	public PorukaSaNaslovom(String tekst)
	{
		this.tekstovi[1] = tekst;
		this.tekstovi[0] = "";
		this.tekstovi[2] = "";
	}
	
	public PorukaSaNaslovom(String naslov, String tekst)
	{
		this.tekstovi[1] = tekst;
		this.tekstovi[0] = naslov;
		this.tekstovi[2] = "";
	} 
	
	@Override
	protected void napraviFuter() 
	{
		this.futer = "";
	}
	
	@Override
	protected void napraviHeder() 
	{
		if (!this.tekstovi[0].equals(""))
		{
			this.heder += this.tekstovi[0].toUpperCase() + "\n";
			
			for (int i = 0; i < this.tekstovi[0].length(); i++)
				this.heder += "=";
			this.heder += "\n\n";
		}
	}
}
