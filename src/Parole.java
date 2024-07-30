import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Parole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try {
            System.out.print("Inserisci il numero di parole: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci " + n + " parole:");

            for (int i = 0; i < n; i++) {
                String word = scanner.nextLine();
                if (!words.add(word)) {
                    duplicates.add(word);
                }
            }

            System.out.println("Parole duplicate:");
            if (duplicates.isEmpty()) {
                System.out.println("Nessuna parola duplicata.");
            } else {
                for (String word : duplicates) {
                    System.out.println(word);
                }
            }

            System.out.println("Numero di parole distinte: " + words.size());


            System.out.println("Lista delle parole distinte:");
            for (String word : words) {
                System.out.println(word);
            }
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
