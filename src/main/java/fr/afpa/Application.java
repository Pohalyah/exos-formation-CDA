package fr.afpa;

import java.util.Scanner;
import java.util.Vector;

public class Application {

    public static void main(String[] args) {
        testFunction12();
    }

    public static void testFunction1() {

        // boucle for et dowhile + saisie user
        int reponseUser = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            reponseUser = scanner.nextInt();
            if (1 <= reponseUser && reponseUser <= 3) {
                System.out.println("Bien joué!");
            } else {
                System.out.println("Retente");
            }
        } while (1 > reponseUser || reponseUser > 3);
    }
    // for (; 1 > reponseUser || reponseUser > 3;) {
    // System.out.println("Saisissez un nombre entre 1 et 3");

    // reponseUser = scanner.nextInt();
    // }
    // ;
    // System.out.println("bien joué");
    // }

    public static void testFunction2() {

        // boucle qui repete la saisie de l'user et 9 chiffres après

        int reponseUser = 0;
        Scanner scanner = new Scanner(System.in);
        reponseUser = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(reponseUser + i);
        }

    }

    public static void testFunction3() {

        long numeroDepart = 1;

        for (int i = 0; i < 64; i++) {
            System.out.println(numeroDepart);
            numeroDepart = numeroDepart * 2;
        }

    }

    public static void testFunction4() {
        int reponseUser = 0;
        Scanner scanner = new Scanner(System.in);
        reponseUser = scanner.nextInt();

        for (int i = 1; i <= reponseUser; i++) {
            System.out.println();
            for (int j = 1; j <= reponseUser; j++) {
                System.out.print(j + " ");

            }

        }

    }

    public static void testFunction5() {

        int reponseUser = 0;
        int plusGrandNombre = -2147483648;
        int numeroNombre = 0;
        int numeroPlusGrandNombre = 0;
        Scanner scanner = new Scanner(System.in);

        for (numeroNombre = 1; numeroNombre <= 10; numeroNombre++) {
            reponseUser = scanner.nextInt();
            if (plusGrandNombre < reponseUser) {
                plusGrandNombre = reponseUser;
                numeroPlusGrandNombre = numeroNombre;
            }

        }
        System.out.println("Voici le plus grand nombre: " + plusGrandNombre);
        System.out.println("C'était le nombre numéro " + numeroPlusGrandNombre);
    }

    public static void testFunction6() {
        int reponseUser = 0;
        int leModulo3 = 0;
        int leModulo5 = 0;

        System.out.println("Saisissez un chiffre :");
        Scanner scanner = new Scanner(System.in);
        reponseUser = scanner.nextInt();

        for (int i = 1; i <= reponseUser; i++) {
            leModulo3 = i % 3;
            leModulo5 = i % 5;
            if (leModulo3 == 0 && leModulo5 == 0) {
                System.out.println("FizzBuzz");
            } else if (leModulo5 == 0) {
                System.out.println("Buzz");
            } else if (leModulo3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void testFunction7() {
        int reponseUser = 0;
        Scanner scanner = new Scanner(System.in);
        int tempValue1;
        int tailleTableau1;
        do {
            System.out.println("Entrez un chiffre entre 6 et 20: ");
            reponseUser = scanner.nextInt();
            tailleTableau1 = reponseUser;
        } while (reponseUser > 20 || reponseUser < 6);

        int[] tableau1 = new int[reponseUser];
        for (int i = 0; i < reponseUser; i++) {
            tableau1[i] = (int) (Math.random() * (500 - 0 + 1));
            System.out.println(tableau1[i]);
        }
        System.out.println("C'était le tableau avant le tri");

        int i = 0;
        while (i < tailleTableau1) {
            for (int j = 0; j < tailleTableau1 - 1; j++) {
                if (tableau1[j] > tableau1[j + 1]) {
                    tempValue1 = tableau1[j];
                    tableau1[j] = tableau1[j + 1];
                    tableau1[j + 1] = tempValue1;
                }

            }
            tailleTableau1--;
        }
        System.out.println("Voici le tableau après le tri: ");
        for (int k = 0; k < reponseUser; k++) {
            System.out.println(tableau1[k]);
        }

    }

    public static void testFunction8() {

        int tempValue1 = 0;
        int reponseUser = 0;
        Scanner scanner = new Scanner(System.in);
        int tailleTableau1 = 0;

        do {
            System.out.println("Entrez un chiffre entre 6 et 20: ");
            reponseUser = scanner.nextInt();
            tailleTableau1 = reponseUser;
        } while (reponseUser > 20 || reponseUser < 6);

        int[] tableau1 = new int[reponseUser];
        for (int i = 0; i < reponseUser; i++) {
            tableau1[i] = (int) (Math.random() * (500 - 0 + 1));
            System.out.println(tableau1[i]);
        }
        System.out.println("C'était le tableau avant le tri");

        int i = 0;
        while (i < tailleTableau1) {

            int tempIndex = 0;
            int valueMax = 0;

            for (int j = 0; j < tailleTableau1; j++) {
                if (tableau1[j] > valueMax) {
                    tempIndex = j;
                    valueMax = tableau1[j];
                }

            }
            tempValue1 = tableau1[tailleTableau1 - 1];
            tableau1[tailleTableau1 - 1] = valueMax;
            tableau1[tempIndex] = tempValue1;

            tailleTableau1--;
        }
        System.out.println("Voici le tableau après le tri: ");
        for (int k = 0; k < reponseUser; k++) {
            System.out.println(tableau1[k]);
        }
    }

    public static void testFunction10() {

        int[] tableauCentime = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] nbPiece = new int[tableauCentime.length];

        int resteSomme = 0;
        double reponseUser = 0;
        int calculSomme = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indiquez en euro la somme à rendre: (exemple 4,64) ");
        reponseUser = scanner.nextDouble();
        calculSomme = (int) (reponseUser * 100);

        for (int i = 0; i < tableauCentime.length; i++) {
            nbPiece[i] = (int) (calculSomme / tableauCentime[i]);
            calculSomme -= nbPiece[i] * tableauCentime[i];
            System.out.println(nbPiece[i] + " fois " + tableauCentime[i] + "cts.");
        }
        resteSomme = calculSomme;
        System.out.println(resteSomme);

    }

    public static void testFunction11() {
        int tempValue1 = 0;
        int reponseUser = 0;
        Scanner scanner = new Scanner(System.in);
        int tailleTableauDeNombre = 0;

        do {
            System.out.println("Entrez un chiffre entre 6 et 100: ");
            reponseUser = scanner.nextInt();
            tailleTableauDeNombre = reponseUser;
        } while (reponseUser > 100 || reponseUser < 6);

        int[] tableauDeNombre = new int[reponseUser];
        for (int i = 0; i < reponseUser; i++) {
            tableauDeNombre[i] = (int) (Math.random() * (500 - 0 + 1));
        }

        int i = 0;
        while (i < tailleTableauDeNombre) {

            int tempIndex = 0;
            int valueMax = 0;

            for (int j = 0; j < tailleTableauDeNombre; j++) {
                if (tableauDeNombre[j] > valueMax) {
                    tempIndex = j;
                    valueMax = tableauDeNombre[j];
                }
            }
            tempValue1 = tableauDeNombre[tailleTableauDeNombre - 1];
            tableauDeNombre[tailleTableauDeNombre - 1] = valueMax;
            tableauDeNombre[tempIndex] = tempValue1;

            tailleTableauDeNombre--;
        }
        for (int k = 0; k < reponseUser; k++) {
            System.out.println(tableauDeNombre[k]);
        }

        int gauche = 0;
        int droite = tableauDeNombre.length - 1;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entrez un chiffre à rechercher: ");
        reponseUser = scanner2.nextInt();
        int valeurRecherche = reponseUser;
        boolean trouve = false;
        while (gauche <= droite) {
            int milieu = (gauche + droite) / 2;
            if (tableauDeNombre[milieu] == valeurRecherche) {
                System.out.println("Trouvé! Il est là: " + milieu);
                trouve = true;
                break;
            } else if (tableauDeNombre[milieu] < valeurRecherche) {
                gauche = milieu + 1;
            } else if (tableauDeNombre[milieu] > valeurRecherche) {
                droite = milieu - 1;
            }
        }
        if (trouve == false) {
            System.out.println("Nombre pas trouvé.");
        }

    }

    public static void testFunction12() {

        Scanner scanner = new Scanner(System.in);

        // Saisie de la position de départ
        System.out.print("Saisissez la ligne de depart 0-5: ");
        int iI = scanner.nextInt();
        System.out.print("Saisissez la colonne de depart 0-5: ");
        int jJ = scanner.nextInt();
        scanner.nextLine(); // Consomme le saut de ligne restant

        // Création du plateau 6x6
        String[][] plateauPartie = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                plateauPartie[i][j] = "O";
            }
        }

        plateauPartie[iI][jJ] = "X";
        afficherPlateau(plateauPartie);

        boolean exit = false;

        while (iI >= 0 && jJ >= 0 && iI <= 5 && jJ <= 5 && !exit) {
            System.out.print("Z Q S D: ");
            String ijDeplacement = scanner.nextLine().trim();

            plateauPartie[iI][jJ] = "O"; // On enlève le pion de l'ancienne position

            switch (ijDeplacement.toUpperCase()) { // On gère Z/Q/S/D et z/q/s/d
                case "Z":
                    if (iI > 0) {
                        iI--;
                    } else {
                        System.out.println("Mouvement impossible");
                        exit = true;
                    }
                    break;
                case "Q":
                    if (jJ > 0) {
                        jJ--;
                    } else {
                        System.out.println("Mouvement impossible");
                        exit = true;
                    }
                    break;
                case "S":
                    if (iI < 5) {
                        iI++;
                    } else {
                        System.out.println("Mouvement impossible");
                        exit = true;
                    }
                    break;
                case "D":
                    if (jJ < 5) {
                        jJ++;
                    } else {
                        System.out.println("Mouvement impossible");
                        exit = true;
                    }
                    break;
                default:
                    System.out.println("Déplacement inconnu");
                    break;
            }

            // On place le pion à la nouvelle position
            if (!exit) {
                plateauPartie[iI][jJ] = "X";
            }

            afficherPlateau(plateauPartie);
        }

        scanner.close();
        System.out.println("Fin du jeu.");
    }

    // Méthode pour afficher le plateau
    public static void afficherPlateau(String[][] plateau) {
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                System.out.print(plateau[i][j] + " ");
            }
            System.out.println();
        }
    }

    // public static void testFunction13() {
    // class Personne {
    // String prenom;
    // int age;

    // void quiEsTu() {
    // System.out.println("Je m'appelle " + prenom + " et j'ai " + age);
    // }

    // public class TestPersonne {
    // public static void main(String[] args) {
    // Personne laPersonne = new Personne();
    // laPersonne.prenom = "Tom";
    // laPersonne.age = 14;
    // }
    // }
    // }
    // Scanner scanner = new Scanner(System.in);
    // }

    public static void testFunction14() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction15() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction16() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction17() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction18() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction19() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction20() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction21() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction22() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction23() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction24() {

        Scanner scanner = new Scanner(System.in);
    }

    public static void testFunction25() {

        Scanner scanner = new Scanner(System.in);
    }

}