package patron_examen;

public class Liste extends Recherche

{

private Noeud premier ;

private Noeud dernier ;

private Noeud courant_ref ;

public Liste()

{

premier= null ;

dernier= null ;

}

public void ajouter_apres_dernier(int x)

{ Noeud n= new Noeud(x,null) ;
if ((premier==null)&&(dernier==null))
{ 
this.setPremier(n);
this.setDernier(n);
}
else {
	dernier.changer_suivant(n);

	dernier=n;
}	


}

protected void demarrer()

{courant_ref= premier ;

}

protected void avancer()

{ courant_ref= courant_ref.obtenir_suivant() ;


}

protected int courant()

{ return courant_ref.obtenir_valeur() ;

}

protected boolean audela()

{

return courant_ref== null ;

}


public Noeud getPremier() {
	return premier;
}

public void setPremier(Noeud premier) {
	this.premier = premier;
}

public Noeud getDernier() {
	return dernier;
}

public void setDernier(Noeud dernier) {
	this.dernier = dernier;
}

public Noeud getCourant_ref() {
	return courant_ref;
}

public void setCourant_ref(Noeud courant_ref) {
	this.courant_ref = courant_ref;
}

}