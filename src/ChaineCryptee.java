
public class ChaineCryptee {
	String enclair;
	int decal;
	
	private ChaineCryptee(String messageclair,int decalage){
		enclair=messageclair;
		decal=decalage;
	}
	
	public static ChaineCryptee addcripte(int decalage,String messagecrypte)
	{
		return new ChaineCryptee(messagecrypte,decalage);
	}
	
	public static ChaineCryptee addclair(int decalage,String messagecrypte)
	{
		ChaineCryptee C =new ChaineCryptee(messagecrypte,decalage);
		C.crypte();
		return new ChaineCryptee(C.getmessage(),decalage);
		  
	}
	
	/**
	 * D�cale un charact�re majuscule
	 * les lettres en majuscule('A'-'Z') sont d�cal� de <code>decalage</code>
	 * caract�re de fa�on circulaire. Les autres charact�re ne sont pas modifi�
	 * en cas de chaine null, rien ne se passe
	 * @param c le charact�ree a d�caler
	 * @param decalage le d�calage appliqu�
	 * @return les charact�re d�cal�
	 */
	
	private static char decalCaractere(char c,int decalage){
		return (c<'A'||c>'Z')? c:(char)(((c-'A'+decalage)%26)+'A');
	}
	public String crypte(){
		StringBuilder crypte=new StringBuilder();
		for(int i=0;i<enclair.length();i++)
		{
			crypte.append(decalCaractere(enclair.charAt(i),decal));
		}
		enclair=new String(crypte.toString());
		return crypte.toString();
	}
	
	public String decrypte(){
		StringBuilder decrypte=new StringBuilder();
		for(int i=0;i<enclair.length();i++)
		{
			decrypte.append(decalCaractere(enclair.charAt(i),26-decal));
		}
		return decrypte.toString();
	}
	
	public String getmessage()
	{
		return enclair;
	}
}
