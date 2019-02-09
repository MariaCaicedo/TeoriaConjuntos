package conjuntos;

import sun.text.resources.ja.CollationData_ja;

public class ConjuntoLista {
    Nodo cabeza;

    public ConjuntoLista() {
        this.cabeza = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public int cantidadDeElementos() {
        int cantidadElementos = 0;
        Nodo recorre = this.cabeza;
        while (recorre != null) {
            cantidadElementos++;
            recorre = recorre.getLiga();
        }
        return cantidadElementos;
    }

    public boolean pertenece(ConjuntoLista conjuntoB) {
        return false;
    }

    public boolean subconjunto(ConjuntoLista conjuntoB) {
        return false;
    }

    public boolean esVacio() {
        return cabeza != null;
    }

    public ConjuntoLista union(ConjuntoLista conjuntoB) {
        ConjuntoLista nuevoConjunto = new ConjuntoLista();
        return nuevoConjunto;
    }

    public ConjuntoLista interseccion(ConjuntoLista conjuntoB) {
        ConjuntoLista cojuntoInterseccion = new ConjuntoLista();
        return cojuntoInterseccion;
    }

    public boolean igualdad(ConjuntoLista conjuntoB) {
        return false;
    }

    public ConjuntoLista complemento(ConjuntoLista conjuntoB) {
        ConjuntoLista conjuntoComplemento = new ConjuntoLista();
        return conjuntoComplemento;
    }

    public boolean agregar(char caracter) {
        Nodo nuevo = new Nodo(caracter);
        nuevo.setLiga(cabeza);
        cabeza = nuevo;
        return true;
    }

    public boolean borrar(char caracter) {
        return false;
    }

    public int posicion(char caracter) {
        int posicion = 0;
        Nodo recorre = cabeza;
        while (recorre != null) {
            if (recorre.getDato() != caracter) {
                posicion++;
                break;
            }
            recorre = recorre.getLiga();
        }
        return posicion;
    }

    public ConjuntoLista diferencia(ConjuntoLista conjuntoB) {
        ConjuntoLista conjuntoDiferencia = new ConjuntoLista();
        return conjuntoDiferencia;
    }

    public ConjuntoLista diferneciaAsimetrica(ConjuntoLista conjuntoB) {
        ConjuntoLista conjuntoDiferenciaAsimetrica = new ConjuntoLista();
        return conjuntoDiferenciaAsimetrica;
    }

    public void vaciar() {
        cabeza = null;
    }
}
