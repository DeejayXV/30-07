package Numeri;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Genera una lista ordinata di N interi casuali
        int N = 10; // Puoi cambiare questo valore per testare con diversi N
        List<Integer> randomList = Utils.generateRandomList(N);
        System.out.println("Lista ordinata di numeri casuali:");
        System.out.println(randomList);

        // Crea una nuova lista con gli elementi seguiti dagli stessi elementi in ordine inverso
        List<Integer> mirroredList = Utils.mirrorList(randomList);
        System.out.println("Lista con elementi seguiti dagli stessi elementi in ordine inverso:");
        System.out.println(mirroredList);

        // Stampa i valori in posizioni pari
        System.out.println("Valori in posizioni pari:");
        Utils.printListByParity(mirroredList, true);

        // Stampa i valori in posizioni dispari
        System.out.println("Valori in posizioni dispari:");
        Utils.printListByParity(mirroredList, false);
    }
}
