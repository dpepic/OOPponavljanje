public class Funkcije 
{
	public static void main(String[] args) 
	{
		System.out.println("Skroooz kraj: " + kolatz(5));
		int x = 5;
		fun1(x);
		System.out.println("Evo nas nazad u main :) ");
	}
	
	public static void fun2()
	{
		return;
	}
	
	public static void fun1(int x)
	{	
		fun2();
		System.out.println("Ja sada zavrsavam sto imam posle"
				+ " poziva");
	}
	
	public static int kolatz(int broj)
	{
			if (broj % 2 == 0)
				broj /= 2;
			else
				broj = broj * 3 + 1;
			System.out.println("Iduci broj je : " + broj);
			if (broj > 1)
				kolatz(broj);
			System.out.println("Unazad :) : " + broj);
			return broj;
	}
}
