
public class Fraction {
	private int numerateur;
	private int denominateur;;
	
	public Fraction(int n,int d)
	{
		numerateur=n;
		denominateur=d;
	}
	
	public Fraction(int numerateur)
	{
		this.numerateur=numerateur;
		denominateur=1;
	}
	
	public Fraction()
	{
		this.numerateur=0;
		this.denominateur=1;
	}
	
	public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction ONE = new Fraction(1, 1);
	
	public int getdenominateur()
	{
		return denominateur;
	}
	
	public int getnumerateur()
	{
		return numerateur;
	}
	
	public String toString()
	{
		return Integer.toString(numerateur)+'/'+Integer.toString(denominateur);
	}
	
	public double todouble()
	{
		return (double)numerateur/(double)denominateur;
	}
	/**prend en argument une fraction  f et additionne la f avec la fraction cpntenue dans la classe
	 * 
	 * @param f Fraction a additionner
	 */
	public void add(Fraction f)
	{
		int d=f.denominateur;
		int n=f.numerateur;
		if(d==denominateur)
		{
			numerateur+=n;
		}
		else
		{
			d=d*denominateur;
			n=n*denominateur;
			denominateur=d;
			numerateur=f.denominateur*numerateur;
		}
		
	}
	
	public boolean equal(Fraction f)
	{
		if(f.todouble()==this.todouble()){return true;}
		return false;
			
	}
	/**
	 * 
	 * @param f Fraction a comparer
	 * @return 1,pour this plus grand que f, -1 pour inferieur et 0 si égalitée
	 */
	public int cmp(Fraction f)
	{
		double tmp=f.todouble()-this.todouble();
		if(tmp>0){
			return -1;
		}
		else if(tmp==0){
			return 0;
		}
		else{
			return 1;
		}
	}
}

