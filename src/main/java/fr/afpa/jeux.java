package fr.afpa;

import java.util.Scanner;

public class jeux {
    public static void main(String[] args) {
        testFunction1();
    }

    public static void testFunction1() {

        Scanner scanner = new Scanner(System.in);
        String prenomJ1;
        String prenomJ2;
        int nbrJ1 = -1;
        int nbrJ2;
        boolean inputValide = false;
        int difficultyData = 0;
        int numberOfChance = 10;
        int difficultyNumber = 0;

        System.out.println("Mode facile ou mode difficile? (facile = 0-1 000 ou difficile = 0-1 000 000)");
        String difficultyOfGame = scanner.nextLine();
        if (difficultyOfGame.equalsIgnoreCase("facile")) {
            difficultyData = 0;
        } else if (difficultyOfGame.equalsIgnoreCase("difficile")) {
            difficultyData = 1;
        } else {
            System.out.println("Difficulté inconnue, mode facile par défaut.");
            difficultyData = 0;
        }
        if (difficultyData == 1) {
            difficultyNumber = 1000000;
        } else if (difficultyData == 0) {
            difficultyNumber = 1000;
        }

        System.out.println("Nombre de chance : 5, 10, 100?");
        numberOfChance = scanner.nextInt();
        scanner.nextLine();

        System.out
                .println("La partie sera " + difficultyOfGame + " avec " + numberOfChance + " tentative(s)");

        System.out.println("Quel est le nom du Joueur 1 ?");
        prenomJ1 = scanner.nextLine();
        System.out.println("Joueur 1 est: " + prenomJ1);

        System.out.println("Quel est le nom du Joueur 2 ?");
        prenomJ2 = scanner.nextLine();
        System.out.println("Joueur 2 est: " + prenomJ2);

        do {
            System.out.println(prenomJ1 + ", sélectionnez un nombre entre 0 et " + difficultyNumber + ".");
            String inputJ1 = scanner.nextLine();
            for (int osef2 = 0; osef2 < 50; osef2++) {
                System.out.println();
            }

            try {
                nbrJ1 = Integer.parseInt(inputJ1);
                if (nbrJ1 >= 0 && nbrJ1 <= difficultyNumber) {
                    inputValide = true;
                } else {
                    System.out.println("Le nombre doit être compris entre 0 et " + difficultyNumber + ".");
                }
            } catch (NumberFormatException numberException) {
                System.out.println(numberException.getMessage());
                System.out.println("Saisie invalide, réessayez.");
            }

        } while (!inputValide);

        System.out.println("Merci " + prenomJ1 + ", votre nombre a été enregistré.");

        for (int osef = 0; osef < 50; osef++) {
            System.out.println();
        }

        System.out.println(prenomJ2 + ", votre mission est de trouver le nombre de " + prenomJ1
                + ", celui-ci se situe entre 0 et " + difficultyNumber + " inclus.");
        System.out.println("Vous avez " + numberOfChance + " tentatives, bonne chance.");

        for (int i = 1; i < numberOfChance + 1; i++) {
            System.out.println("");
            System.out.println("Entrez votre tentative numéro " + (i));
            nbrJ2 = scanner.nextInt();
            if (nbrJ2 == nbrJ1) {
                System.out.println("Bravo " + prenomJ2 + "! Vous avez trouvé le numéro de " + prenomJ1 + " en " + i
                        + " tentative(s)!");
                break;
            } else if (nbrJ2 < nbrJ1) {
                System.out.println(prenomJ2 + ", votre nombre est plus PETIT que celui de " + prenomJ1 + ".");
            } else if (nbrJ2 > nbrJ1) {
                System.out.println(prenomJ2 + ", votre nombre est plus GRAND que celui de " + prenomJ1 + ".");
            }
        }

    }
}