package Polimorfizam;

public class PorukaAdresirana extends Poruka 
{
	public PorukaAdresirana(String od, String za, String tekst)
	{
		this.promeniAdresu(od, za);
		this.tekstovi[1] = tekst;
		this.tekstovi[2] = "";
	}
	
	public void promeniAdresu(String od, String za)
	{
		this.tekstovi[0] = od + "-" + za;
	}

	@Override
	protected void napraviFuter() 
	{
		this.futer = "";
	}

	@Override
	protected void napraviHeder() 
	{
		String[] adrese = this.tekstovi[0].split("-");
		this.heder = String.format("Od: %s\nZa: %s\n"
				                    , adrese[0], adrese[1]);
		int brojCrtica;
		
		if (this.heder.split("\n")[0].length() > this.heder.split("\n")[1].length())
			brojCrtica = this.heder.split("\n")[0].length();
		else
			brojCrtica = this.heder.split("\n")[1].length();
		
		for (int i = 0; i < brojCrtica; i++)
		{
			this.heder += "-";
		}
		this.heder += "\n";
	}
}
