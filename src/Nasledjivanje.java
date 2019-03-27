public class Nasledjivanje
{
	public static void main(String[] args) 
	{
		Automobil testVozilo = new Automobil("sr-001", 120, 5);
		double vreme = testVozilo.kreciSe(200, 100);
		System.out.println("Presli smo 200km za: " + vreme);
		Bicikla bajs = new Bicikla("b-078", 20, true);
		bajs.kreciSe(30, 10);
	}
}

abstract class Vozilo
{
	int maksimalnaBrzina;
	String srBroj;
	static int globalnaKilometraza;
	
	public double kreciSe(int km, int brzina)
	{
		this.potrosnja(km);
		Vozilo.globalnaKilometraza += km;
		return km/brzina;
	}
	
	protected abstract void potrosnja(int km);
}

class Bicikla extends Vozilo
{
	boolean imaKorpu;
	
	public Bicikla(String serija, int max, boolean korpa)
	{
		this.srBroj = serija;
		this.maksimalnaBrzina = max;
		this.imaKorpu = korpa;
	}

	@Override
	protected void potrosnja(int km) 
	{
		
	}
}

class Automobil extends Vozilo
{
	private int stanjeGoriva = 100;
	
	public int procitajStanje()
	{
		return this.stanjeGoriva;
	}
	
	public void dodajGorivo(int kolicina)
	{
		this.stanjeGoriva += Math.abs(kolicina);
	}
	
	int gorivoPoKm;
	
	public Automobil(String serija, int max, int gorivoPoKm)
	{
		this.srBroj = serija;
		this.maksimalnaBrzina = max;
		this.gorivoPoKm = gorivoPoKm;
	}
	
	protected void potrosnja(int km)
	{
		this.stanjeGoriva -= this.gorivoPoKm * km;
	}
}

