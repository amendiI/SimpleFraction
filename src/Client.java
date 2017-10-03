
public class Client {

	public String nom;//il y a un "+" dans la figure 4.6
	private Serveur serv;
	
	public Client(String nom){
		this.nom=nom;
	}
	public boolean seConnecter(Serveur serv)
	{
		this.serv=serv;
		return (serv!=null);
	}
	public  void envoyer(String message)
	{
		serv.diffuser(message);
	}
	public String recevoir(String str)
	{
		return str;
	}
}
