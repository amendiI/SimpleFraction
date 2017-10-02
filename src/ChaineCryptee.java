
public class ChaineCryptee {
	String enclair;
	int decal;
	
	public ChaineCryptee(String message,int decalage){
		enclair=message;
		decal=decalage;
	}
	
	public String crypte(){
		StringBuilder crypte=new StringBuilder();
		for(int i=0;i<enclair.length();i++)
		{
			crypte.append(decalCaractere(enclair.charAt(i),decal));
		}
		return crypte.toString();
	}
	private static char decalCaractere(char c,int decalage){
		return (c<'A'||c>'Z')? c:(char)(((c-'A'+decalage)%26)+'A');
	}
}
