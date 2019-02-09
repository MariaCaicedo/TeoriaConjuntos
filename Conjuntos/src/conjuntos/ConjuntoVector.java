package conjuntos;

public class ConjuntoVector {
    int tamañoVector;
    char[] vector;

    public ConjuntoVector() {
        tamañoVector=0;
    }

    public int getTamañoVector(){
        return tamañoVector;
    }

    public char getVector(int posicion){
        return vector[posicion];
    }

    public void setVector(){

    }

    public int cantidadDeElemnetos(){
        int cantidadDeElemntos=0;
        for (int i = 0; i < tamañoVector; i++){
            if(vector[i]==0){
                break;
            }else{
                cantidadDeElemntos++;
            }
        }
        return cantidadDeElemntos;
    }

    public void perteneceUnElementoAUnConjunto(){

    }

    public void subconjunto(){

    }

    public void esVacio(){

    }

    public void union(){

    }

    public void interseccion(){

    }

    public void igualdad(){

    }

    public void complemento(){

    }

    public void agregar(){

    }

    public void borrar(){

    }

    public void posicion(){

    }

    public void diferencia(){

    }

    public void diferenciaSimetrica(){

    }

    public void vaciar(){

    }

}
