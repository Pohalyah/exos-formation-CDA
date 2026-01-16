package fr.afpa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests unitaires pour la catégorie : 03-fonctions
 */
class AlgoDivers2Test {

    @Test
    public void shouldCheckNumber() {
        String[] tableauCB = { "4263982640269299",
                "4539319503436467",
                "79927398713",
                "5342889606130024",
                "8273123273520569",
                "4223982640269299" };

        boolean[] expectedResults = { true, true, true, false, false, false, false };

        for (int i = 0; i < tableauCB.length; i++) {

            boolean isCardNumber = AlgoDivers2.checkCardNumber(tableauCB[i]);

            assertEquals(expectedResults[i], isCardNumber);
        }
    }

    // TODO phase 2 - ajouter une fonction de test pour "calculateChangeBack"
    // Indice : bien penser à l'annotation "@Test"
    // utiliser les bonnes assertions (assertEquals)

    @Test
    public void shouldCalculateChangeBack()

    {
        int[] expectedResults = { 5, 1, 1, 1, 1, 1, 1, 1 };
        int[] resultat = AlgoDivers2.checkChangeBack(11.88);

        assertArrayEquals(expectedResults, resultat);

        int[] expectedResults2 = { 7, 1, 0, 0, 0, 0, 0, 0 };
        int[] resultat2 = AlgoDivers2.checkChangeBack(15.0);

        assertArrayEquals(expectedResults2, resultat2);

        int[] expectedResults3 = { 78, 1, 1, 2, 0, 1, 1, 0 };
        int[] resultat3 = AlgoDivers2.checkChangeBack(157.98);

        assertArrayEquals(expectedResults3, resultat3);

        int[] expectedResults4 = { 0, 0, 0, 1, 1, 0, 1, 1 };
        int[] resultat4 = AlgoDivers2.checkChangeBack(0.33);

        assertArrayEquals(expectedResults4, resultat4);
    }
}
