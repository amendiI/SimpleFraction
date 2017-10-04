import java.util.List;
import java.util.ArrayList;

public class Serveur {
	private List<Client> liste;
	
	public Serveur()
	{
		liste=new ArrayList<Client>();
	}
	
	public boolean Connecter(Client C)
	{
		liste.add(C);
		//System.out.println(C.getnom());
		return true;
	}
	
	public void diffuser(String str)
	{
		for(int i=0;i<liste.size();i++)
		{
			liste.get(i).recevoir(str);
		}
	}
}
