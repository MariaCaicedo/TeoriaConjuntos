package conjuntos;

import sun.text.resources.ja.CollationData_ja;

public class

ConjuntoLista {
    private Nodo cabeza;

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
        return cabeza == null;
    }

    public ConjuntoLista union(ConjuntoLista conjuntoB) {
        ConjuntoLista nuevoConjunto = new ConjuntoLista();
        nuevoConjunto.add(conjuntoB.getCabeza());
        Nodo recorre = this.cabeza;
        while (recorre!=null){
            if(!nuevoConjunto.buscar(recorre.getDato())){
                nuevoConjunto.agregar(recorre.getDato());
            }
            recorre=recorre.getLiga();
        }
        return nuevoConjunto;
    }

    private void add(Nodo nodo) {
        Nodo ultimo = getUltimo();
        if (ultimo == null) {
            this.cabeza = nodo;
        } else {
            ultimo.setLiga(nodo);
        }
    }

    private Nodo getUltimo() {
        if (this.cabeza == null) {
            return null;
        }
        Nodo recorre = this.cabeza;

        while (recorre.getLiga() != null) {
            recorre = recorre.getLiga();
        }
        return recorre;
    }

    public ConjuntoLista interseccion(ConjuntoLista conjuntoB) {
        ConjuntoLista cojuntoInterseccion = new ConjuntoLista();
        return cojuntoInterseccion;
    }

    public boolean igualdad(ConjuntoLista conjuntoB) {
        if (this.cabeza == null || null == conjuntoB.getCabeza()) {
            return this.getCabeza() == conjuntoB.getCabeza();
        }
        boolean flag = false;
        Nodo recorre = this.cabeza;
        while (recorre != null) {
            Nodo recorreOtro = conjuntoB.getCabeza();
            boolean encontrado = conjuntoB.buscar(recorre.getDato());
            if (!encontrado) {
                return false;
            }
            recorre = recorre.getLiga();
        }
        return recorre == null;
    }

    private boolean buscar(char dato) {
        if (this.cabeza != null) {
            Nodo recorre = this.cabeza;
            while (recorre != null) {
                if (recorre.getDato() == dato) {
                    return true;
                }
                recorre = recorre.getLiga();
            }
        }
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
        if (this.cabeza == null || !buscar(caracter)) {
            System.out.println(String.format("El caracter [%c] no existe en el conjunto", caracter));
            return false;
        }
        if (this.cabeza.getDato() == caracter) {
            this.cabeza = this.cabeza.getLiga();
            return true;
        }
        Nodo anterior = this.cabeza;
        Nodo recorre = anterior.getLiga();
        while (recorre != null) {
            if (recorre.getDato() == caracter) {
                anterior.setLiga(recorre.getLiga());
                return true;
            }
            anterior=recorre;
            recorre = recorre.getLiga();
        }
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

    @Override
    public String toString() {
        String conjunto = "Elementos:\n";
        Nodo recorre = this.cabeza;
        while (recorre != null){
            conjunto += recorre.getDato() + "\n";
        }
        return conjunto;
    }
}
