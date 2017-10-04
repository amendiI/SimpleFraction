
public class main {

	public static void main(String[] args)
	{
		
		ChaineCryptee C = ChaineCryptee.addcripte(5,"AZERTYUI");
		System.out.println(C.getmessage());
		
		ChaineCryptee C2=ChaineCryptee.addclair(5,"AZERTYUI");
		System.out.println(C2.getmessage());
		
		
		Serveur S=new Serveur();
		Client max=new Client("max");
		Client bob=new Client("bob");
		
		max.seConnecter(S);
		bob.seConnecter(S);
		max.envoyer("bonjours");
		bob.envoyer("comment ça va?");
		
		Fraction f=new Fraction(4,6);
		Fraction f2=new Fraction(4);
		Fraction f3=new Fraction();
		
		System.out.println(f.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		
		f2.add(f);
		
		System.out.println(f2.toString());
		
		System.out.println(f.cmp(f2));
		System.out.println(f.cmp(f3));
		System.out.println(f.cmp(f));
		
		Fichier fi1=new Fichier("f1",5);
		Fichier fi2=new Fichier("f2",100);
		Fichier fi3=new Fichier("f3",1000);
		
		Repertoire R1=new Repertoire("R1");
		Repertoire R2=new Repertoire("R2");
		Repertoire R3=new Repertoire("R3");
		
		System.out.println(fi2.gettaille());
		R1.ajoutfichier(fi1);
		R2.ajoutfichier(fi2);
		R3.ajoutfichier(fi3);
		R1.ajoutdossier(R2);
		R2.ajoutdossier(R3);
		R3.ajoutdossier(R3);
		
		System.out.println(R1.calcultaille());
		System.out.println(R2.calcultaille());
		System.out.println(R3.calcultaille());
		
	}
}
