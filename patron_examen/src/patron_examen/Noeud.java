package patron_examen;

public class Noeud {
	private int valeur ;

	private Noeud suivant ;

	public Noeud (int val, Noeud s)

	{valeur= val ;

	suivant=s ;

	}

	public int obtenir_valeur()

	{return valeur ;}

	public void changer_valeur(int v){

	valeur=v ;

	}

	public Noeud obtenir_suivant()

	{return suivant ;

	}

	public void changer_suivant(Noeud s)

	{suivant=s ;}
	}

