package fr.afpa;

import java.util.Scanner;

public class AlgoDivers2 {

    /**
     * Vérification d'un numéro de carte bancaire en utilisant l'algorithme de Luhn.
     * 
     * @param toCheck Le numéro de carte bancaire à vérifier
     * @return true si le numéro est correct
     */
    public static boolean checkCardNumber(String bankNumber) {
        int valeurTotal = 0;
        int posDroite = 0;
        for (int j = bankNumber.length() - 1; j >= 0; j--) {
            char caracter = bankNumber.charAt(j);
            int oneNumber = Character.getNumericValue(caracter);
            if (posDroite % 2 == 1) {

                int doubledValue = oneNumber * 2;
                if (doubledValue > 9) {
                    doubledValue = (doubledValue / 10) + (doubledValue % 10);
                }
                valeurTotal = valeurTotal + doubledValue;
            } else {
                valeurTotal = valeurTotal + oneNumber;
            }
            posDroite++;
        }

        if (valeurTotal % 10 == 0) {
            return true;
        } else {
            return false;
        }

    }

    // TODO phase 1 - ajouter fonction "calculateChangeBack"

    public static int[] checkChangeBack(double valeurTest) {

        int[] tableauCentime = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] nbPiece = new int[tableauCentime.length];

        int resteSomme = 0;
        int calculSomme = 0;
        calculSomme = (int) (valeurTest * 100);

        for (int i = 0; i < tableauCentime.length; i++) {
            nbPiece[i] = (int) (calculSomme / tableauCentime[i]);
            calculSomme -= nbPiece[i] * tableauCentime[i];
            System.out.println(nbPiece[i] + " fois " + tableauCentime[i] + "cts.");
        }
        resteSomme = calculSomme;
        return nbPiece;

    }
}
