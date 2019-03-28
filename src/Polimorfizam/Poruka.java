package Polimorfizam;

public abstract class Poruka 
{
	String heder = "", futer = "";
	private static int brStampanja = 0;
	protected String[] tekstovi = new String[3];
	//Indeksi: 0 -- heder, 1 -- poruka, 2 -- futer
	
	
	protected abstract void napraviFuter();
	protected abstract void napraviHeder();
	
	public static int statistika()
	{
		//Napraviti da prati po klasama, npr
		//br stampanja za adresirane,
		//br stampanja sa naslovom
		//.getClass() -- za razvrstavanje
		//.equals() -- za porednjenje
		return Poruka.brStampanja;
	}
	
	public String dajPoruku(boolean heder, boolean futer)
	{
		brStampanja++;
		String poruka = "";
		
		if (heder)
		{
			this.napraviHeder();
			poruka += this.heder;
		}
		
		poruka += this.tekstovi[1] + "\n\n";
			
		if (futer)
		{
			this.napraviFuter();
			poruka += this.futer;
		}
		
		return poruka;
	}
}
