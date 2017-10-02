
public class Fraction {
	private int numerateur;
	private int denominateur;
	
	public Fraction(int n,int d)
	{
		numerateur=n;
		denominateur=d;
	}
	
	public String toString()
	{
		return Integer.toString(numerateur)+'/'+Integer.toString(denominateur);
	}

}
