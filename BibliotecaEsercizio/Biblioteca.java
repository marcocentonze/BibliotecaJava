
/**
 * Biblioteca
 */
import java.util.ArrayList;

public class Biblioteca {
    // tutti i libri che ci sono
    ArrayList<Libro> libri = new ArrayList<Libro>(); // accetta oggetti di tipo Libro
    // copie disponibili
    ArrayList<Integer> copieDisponibili = new ArrayList<Integer>();
    // copie in prestito
    ArrayList<Integer> copieInPrestito = new ArrayList<Integer>();

    public void aggiungiLibro(String titolo, int copieDisponibili) {
        // controllo per vedere se già esiste
        for (int i = 0; i < libri.size(); i++) {
            Libro libro = libri.get(i);
            if (libro.getTitolo().equals(titolo)) {
                // se esiste già,allora usciamo dal ciclo
                System.out.println("Il libro \"" + titolo + "\" esiste già nella biblioteca.");
                return;
            }
        }
        // se non c'è lo aggiungiamo
        libri.add(new Libro(titolo, copieDisponibili));
    }

    public void prestaCopiaLibro(String titolo) {
        for (int i = 0; i < libri.size(); i++) {
            // recupero l'oggetto Libro dalla lista array
            Libro libro = libri.get(i);
            if (libro.getTitolo().equals(titolo)) {
                libro.prestaLibro();
                return;
            }
        }
        System.out.println("Libro non trovato.");
    }

    // Metodo per restituire un libro
    public void restituisciLibro(String titolo) {
        for (int i = 0; i < libri.size(); i++) {
            Libro libro = libri.get(i);
            if (libro.getTitolo().equals(titolo)) {
                libro.restituisciLibro();
                return;
            }
        }
        System.out.println("Libro non trovato.");
    }

    public void rimuoviLibro(String titolo) {
        for (int i = 0; i < libri.size(); i++) {
            Libro libro = libri.get(i);
            if (libro.getTitolo().equals(titolo)) {
                libri.remove(i);
                System.out.println("Il libro \"" + titolo + "\" è stato rimosso dalla biblioteca.");
                return;
            }
        }
        // se non viene trovato il libro
        System.out.println("Il libro \"" + titolo + "\" non è stato trovato nella biblioteca.");
    }

    public void stampaLibriDisponibili() {
        if (libri.isEmpty()) {
            System.out.println("Siamo poveri,non abbiamo libri");
            return;

        }
        System.out.println("Ecco l'elenco dei libri disponibili:");
        for (int i = 0; i < libri.size(); i++) {
            Libro libro = libri.get(i);
            System.out.println(libro.getTitolo() + " copie disponibili:" + libro.getCopieDisponibili());
        }
    }
}