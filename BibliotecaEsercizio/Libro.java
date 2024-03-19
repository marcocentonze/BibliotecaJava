public class Libro {
   
    private String titolo;
    private int copieDisponibili;
    private int copieInPrestito;

    // Costruttore per inizializzare libro con titolo e copiedisponib
    public Libro(String titolo, int copieDisponibili) {
        this.titolo = titolo;
        this.copieDisponibili = copieDisponibili;
        this.copieInPrestito = 0; 
    }

    // getter e setter
    public String getTitolo() {
        return titolo;
    }

    public int getCopieDisponibili() {
        return copieDisponibili;
    }
   
    public void setCopieDisponibili(int copieDisponibili) {
        this.copieDisponibili = copieDisponibili;
    }

    public int getCopieInPrestito() {
        return copieInPrestito;
    }
   
    //metodo prestalibro
    public void prestaLibro() {
        if (copieDisponibili > 0) {
            copieDisponibili--;
            copieInPrestito++;
        } else {
            System.out.println("Non ci sono copie disponibili");
        }
    }
  
    //metodo restituiscilibro
    public void restituisciLibro() {
        if (copieInPrestito > 0) {
            copieInPrestito--;
            copieDisponibili++;
        } else {
            System.out.println("Errore");
        }
    }

}
