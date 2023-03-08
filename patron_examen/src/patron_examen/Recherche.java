package patron_examen;

public  abstract class Recherche
{        
protected abstract void demarrer();
protected abstract void avancer();
protected abstract boolean audela();
protected abstract int courant();

public final boolean trouve (int x)
{demarrer();
while( ! audela() && courant() != x)
avancer();
return (!audela());
}
}
