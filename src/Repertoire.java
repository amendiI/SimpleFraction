import java.util.List;
import java.util.ArrayList;

public class Repertoire {
	private String nom;
	private List<Fichier> lf;
	private List<Repertoire> lr;
	
	public Repertoire(String nom){
		this.nom=nom;
		lf=new ArrayList<Fichier>();
		lr=new ArrayList<Repertoire>();
	}
	
	public int calcultaille()
	{
		int total=0;
		for(int i=0;i<lr.size();i++)
		{
			total =total+lr.get(i).calcultaille();
		}
		for(int i=0;i<lf.size();i++)
		{
			total=total+lf.get(i).gettaille();
		}
		return total;
	}
	
	public void ajoutfichier(Fichier f)
	{
		lf.add(f);
	}
	
	public void ajoutdossier(Repertoire D)
	{
		if (D!=this)
		{
			lr.add(D);
		} 
	}
	

	public boolean notIntegrer (Repertoire R){
		int i;
		List<Repertoire> current;
		current = R.lr; 
		
		if (current.size() == 0)
			return true;
		
		for (i = 0; i<current.size(); i++){
			if (R==this)
				return false;
			
			return notIntegrer(current.get(i));
		}
		return true; 
	}
	
}
