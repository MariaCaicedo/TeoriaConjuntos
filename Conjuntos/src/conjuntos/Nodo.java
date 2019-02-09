package conjuntos;

public class Nodo {
    char dato;
    Nodo liga;

    public char getDato() {
        return dato;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public Nodo(char dato) {
        this.dato = dato;
        this.liga=null;
    }
}
