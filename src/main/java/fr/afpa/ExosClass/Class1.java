package fr.afpa.ExosClass;

public class Class1 {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Josef", 34);
        personne1.sePresenter();

        Personne personne2 = new Personne("Jacobus", 48);
        personne2.saluerPersonne(personne1);
        personne2.doisPartir();
    }

}
