package Numeri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Utils {

    // Funzione che genera una lista di N interi casuali da 0 a 100 e li ordina
    public static List<Integer> generateRandomList(int n) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            randomList.add(random.nextInt(101)); // Intero casuale da 0 a 100
        }

        Collections.sort(randomList); // Ordina la lista
        return randomList;
    }

    // Funzione che accetta una lista e restituisce una nuova lista con gli elementi seguiti dagli stessi elementi in ordine inverso
    public static List<Integer> mirrorList(List<Integer> list) {
        List<Integer> mirroredList = new ArrayList<>(list);
        List<Integer> reverseList = new ArrayList<>(list);
        Collections.reverse(reverseList);
        mirroredList.addAll(reverseList); // Aggiunge la lista invertita
        return mirroredList;
    }

    // Funzione che accetta una lista e un booleano: stampa valori in posizioni pari o dispari
    public static void printListByParity(List<Integer> list, boolean printEvenIndices) {
        for (int i = 0; i < list.size(); i++) {
            if (printEvenIndices && i % 2 == 0) {
                System.out.println("Posizione " + i + ": " + list.get(i));
            } else if (!printEvenIndices && i % 2 != 0) {
                System.out.println("Posizione " + i + ": " + list.get(i));
            }
        }
    }
}
