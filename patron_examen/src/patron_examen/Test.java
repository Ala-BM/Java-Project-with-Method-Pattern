package patron_examen;

public class Test
{
public static void main( String [] args)
{ int [] c= {13, 8, 4, 100, 300};
Tableau t= new Tableau(c) ;
System.out.println(t.trouve(13)) ;
System.out.println(t.trouve(8)) ;
System.out.println(t.trouve(4)) ;
System.out.println(t.trouve(0)) ;
System.out.println(t.trouve(300)) ;
Liste l = new Liste();
l.ajouter_apres_dernier(12);
l.ajouter_apres_dernier(1);
l.ajouter_apres_dernier(10);
l.ajouter_apres_dernier(11);

System.out.println("do list");
System.out.println(l.trouve(0)) ;
System.out.println(l.trouve(300)) ;
}
}