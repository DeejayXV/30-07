package Numeri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Utils {

    public static List<Integer> generateRandomList(int n) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            randomList.add(random.nextInt(101));
        }

        Collections.sort(randomList);
        return randomList;
    }

    public static List<Integer> mirrorList(List<Integer> list) {
        List<Integer> mirroredList = new ArrayList<>(list);
        List<Integer> reverseList = new ArrayList<>(list);
        Collections.reverse(reverseList);
        mirroredList.addAll(reverseList);
        return mirroredList;
    }

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
