import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Parole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try {
            // Chiedi all'utente di inserire il numero di parole
            System.out.print("Inserisci il numero di parole: ");
            int n = scanner.nextInt();
            scanner.nextLine();  // Consuma il newline dopo l'intero

            // Imposta un breakpoint qui per iniziare il debug
            System.out.println("Inserisci " + n + " parole:");

            // Chiedi all'utente di inserire le parole
            for (int i = 0; i < n; i++) {
                String word = scanner.nextLine();
                // Imposta un breakpoint qui per vedere il valore di "word"
                if (!words.add(word)) {
                    duplicates.add(word);
                }
            }

            // Stampa le parole duplicate
            System.out.println("Parole duplicate:");
            if (duplicates.isEmpty()) {
                System.out.println("Nessuna parola duplicata.");
            } else {
                for (String word : duplicates) {
                    System.out.println(word);
                }
            }

            // Stampa il numero di parole distinte
            System.out.println("Numero di parole distinte: " + words.size());

            // Stampa l'elenco delle parole distinte
            System.out.println("Elenco delle parole distinte:");
            for (String word : words) {
                // Imposta un breakpoint qui per vedere l'output di ogni parola distinta
                System.out.println(word);
            }
        } catch (Exception e) {
            System.out.println("Si è verificato un errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
