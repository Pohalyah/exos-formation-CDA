package fr.afpa.ExosClass;

public class Personne {
    private String prenom;
    private int age;

    public Personne(String p, int a) {
        prenom = p;
        age = a;
    }

    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle " + prenom + " et j'ai " + age + " ans.");
    }

    public void doisPartir() {
        System.out.println(prenom + " doit partir.");
    }

    public void saluerPersonne(Personne lautrePersonne) {
        System.out.println("Salut " + lautrePersonne.getPrenom() + ", je suis " + this.prenom);
    }

    public String getPrenom() {
        return prenom;
    }
}
