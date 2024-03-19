import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // dati per prova
        biblioteca.aggiungiLibro("Spiderman", 3);
        biblioteca.aggiungiLibro("Harry", 2);

        System.out.println("Benvenuto/a in Biblioteca.Scegli cosa fare");
        System.out.println("1. Aggiungi libro");
        System.out.println("2. Presta libro");
        System.out.println("3. Restituisci libro");
        System.out.println("4. Rimuovi libro");
        System.out.println("5. Stampa il catalogo libri");
        System.out.println("6. Esci");
        int scelta = scanner.nextInt();
        scanner.nextLine();

        switch (scelta) {
            case 1:
                System.out.println("Inserisci il titolo del libro");
                String titoloInserito = scanner.nextLine();
                System.out.println("Inserisci il numero delle copie disponibili");
                int copieInserite = scanner.nextInt();
                // aggiungo l'input inseriti
                biblioteca.aggiungiLibro(titoloInserito, copieInserite);
                System.out.println("Libro aggiunto correttamente");
                break;
            case 2:
                System.out.println("Quale libro vuoi prendere in prestito?");
                String titoloInseritoPrestito = scanner.nextLine();
                biblioteca.prestaCopiaLibro(titoloInseritoPrestito);
                break;
            case 3:
                System.out.println("Quale libro vuoi restituire?");
                String titoloInseritoRestituito = scanner.nextLine();
                biblioteca.restituisciLibro(titoloInseritoRestituito);
            case 4:
                System.out.println("Quale libro vuoi rimuovere?");
                String titoloInseritoRimuovere = scanner.nextLine();
                biblioteca.rimuoviLibro(titoloInseritoRimuovere);
            case 5:
                System.out.println("Ecco la lista dei libri presenti");
                biblioteca.stampaLibriDisponibili();
            case 6:
                System.out.println("Grazie per essere passato");
                scanner.close();
                return;

            default:
                System.out.println("Opzione non valida,riprova.");
                return;
        }

    }
}
