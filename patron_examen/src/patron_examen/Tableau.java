package patron_examen;

public class Tableau extends Recherche
{private int []a ;
private int position ;
public Tableau(int [] b)
{
super() ;
 a= new int [b.length] ;
for (int i=0; i<a.length; i++)
a[i]=b[i];
}
protected void demarrer()
{
position=0;
}
protected void avancer()
{ position ++;
}
protected int courant()
{
return a[position];
}
protected boolean audela()
{return position >= a.length;
}
}
