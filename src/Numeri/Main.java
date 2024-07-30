package Numeri;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        List<Integer> randomList = Utils.generateRandomList(N);
        System.out.println("Lista ordinata di numeri casuali:");
        System.out.println(randomList);

        List<Integer> mirroredList = Utils.mirrorList(randomList);
        System.out.println("Lista con elementi seguiti dagli stessi elementi in ordine inverso:");
        System.out.println(mirroredList);

        System.out.println("Valori pari:");
        Utils.printListByParity(mirroredList, true);

         System.out.println("Valori dispari:");
        Utils.printListByParity(mirroredList, false);
    }
}
