package conjuntos;

import javax.swing.*;

public class Menu {

    public static final String CONJUNTO_B = "Conjunto B";
    public static final String CONJUNTO_A = "Conjunto A";
    private static int conjunto;
    private int elemnentos;

    public static void main(String[] args) {
        String menu = "Conjuntos\n" +
                "0.     Salir\n" +
                "1.     Cantidad de Elementos\n" +
                "2.     Pertenece\n" +
                "3.     Subconjunto\n" +
                "4.     Es Vacio\n" +
                "5.     Union\n" +
                "6.     Interseccion\n" +
                "7.     Igualdad\n" +
                "8.     Complemento\n" +
                "9.     Agregar un Elemento\n" +
                "10.    Borrar\n" +
                "11.    Posicion\n" +
                "12.    Diferencia\n" +
                "13.    Diferencia Simetrica\n" +
                "14.    Vaciar\n" +
                "";
        ConjuntoLista conjuntoA = new ConjuntoLista();
        ConjuntoLista conjuntoB = new ConjuntoLista();
        ConjuntoLista respuesta = new ConjuntoLista();
        String conjuntoOpcion = "Seleccione un conjunto\n" +
                "77.    Conjunto A\n" +
                "99.    Conjunto B\n" +
                "";
        String ingresado;
        int option;
        do {
            option = obtenerNumeroPorEntrada("MENU", menu);
            switch (option) {
                case 0:
                    break;
                case 1:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        int elemnentos = conjuntoA.cantidadDeElementos();
                        JOptionPane.showMessageDialog(null, String.format("El conjunto contiene %d%n elementos", elemnentos), CONJUNTO_A, JOptionPane.DEFAULT_OPTION);
                    } else if (conjunto == 99) {
                        int elemnentos = conjuntoB.cantidadDeElementos();
                        JOptionPane.showMessageDialog(null, String.format("El conjunto contiene %d%n elementos", elemnentos), CONJUNTO_B, JOptionPane.DEFAULT_OPTION);
                    }
                    break;
                case 2:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        System.out.println("no implementado");
                    } else if (conjunto == 99) {
                        System.out.println("no implementado");
                    }
                    break;
                case 3:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        System.out.println("no implementado");
                    } else if (conjunto == 99) {
                        System.out.println("no implementado");
                    }
                    break;
                case 4:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        if (conjuntoA.esVacio()) {
                            JOptionPane.showMessageDialog(null, "El conjunto esta vacio", CONJUNTO_A, JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El conjunto contiene valores", CONJUNTO_A, JOptionPane.DEFAULT_OPTION);
                        }
                    } else if (conjunto == 99) {
                        if (conjuntoB.esVacio()) {
                            JOptionPane.showMessageDialog(null, "El conjunto esta vacio", CONJUNTO_B, JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El conjunto contiene valores", CONJUNTO_B, JOptionPane.DEFAULT_OPTION);
                        }
                    }
                    break;
                case 5:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        respuesta = conjuntoA.union(conjuntoB);
                        JOptionPane.showMessageDialog(null, respuesta.toString(), CONJUNTO_A + " unido " + CONJUNTO_B, JOptionPane.DEFAULT_OPTION);
                    } else if (conjunto == 99) {
                        respuesta = conjuntoB.union(conjuntoA);
                        JOptionPane.showMessageDialog(null, respuesta.toString(), CONJUNTO_B + " unido " + CONJUNTO_A, JOptionPane.DEFAULT_OPTION);
                    }
                    break;
                case 6:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        System.out.println("no implementado");
                    } else if (conjunto == 99) {
                        System.out.println("no implementado");
                    }
                    break;
                case 7:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        if (conjuntoA.igualdad(conjuntoB)) {
                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales", CONJUNTO_A + " igual " + CONJUNTO_B, JOptionPane.DEFAULT_OPTION);
                        } else {
                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes", CONJUNTO_A + " NO igual " + CONJUNTO_B, JOptionPane.DEFAULT_OPTION);
                        }
                    } else if (conjunto == 99) {
                        if (conjuntoB.igualdad(conjuntoA)) {
                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales", CONJUNTO_B + " igual " + CONJUNTO_A, JOptionPane.DEFAULT_OPTION);
                        } else {
                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes", CONJUNTO_B + " NO igual " + CONJUNTO_A, JOptionPane.DEFAULT_OPTION);
                        }
                    }
                    break;
                case 8:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        System.out.println("no implementado");
                    } else if (conjunto == 99) {
                        System.out.println("no implementado");
                    }
                    break;
                case 9:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    ingresado = JOptionPane.showInputDialog(null, "Ingrese un character", "Ingrese un caracter", JOptionPane.DEFAULT_OPTION);
                    if (conjunto == 77) {
                        conjuntoA.agregar(ingresado.charAt(0));
                    } else if (conjunto == 99) {
                        conjuntoB.agregar(ingresado.charAt(0));
                    }
                    break;
                case 10:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    ingresado = JOptionPane.showInputDialog(null, "Ingrese un character", "Ingrese un caracter", JOptionPane.DEFAULT_OPTION);
                    if (conjunto == 77) {
                        if (conjuntoA.borrar(ingresado.charAt(0))) {
                            JOptionPane.showMessageDialog(null, String.format("el caracter %c fue borrado", ingresado.charAt(0)), CONJUNTO_A, JOptionPane.DEFAULT_OPTION);
                        } else {
                            JOptionPane.showMessageDialog(null, String.format("el caracter %c No fue borrado", ingresado.charAt(0)), CONJUNTO_A, JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (conjunto == 99) {
                        if (conjuntoB.borrar(ingresado.charAt(0))) {
                            JOptionPane.showMessageDialog(null, String.format("el caracter %c fue borrado", ingresado.charAt(0)), CONJUNTO_B, JOptionPane.DEFAULT_OPTION);
                        } else {
                            JOptionPane.showMessageDialog(null, String.format("el caracter %c No fue borrado", ingresado.charAt(0)), CONJUNTO_B, JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 11:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        System.out.println("no implementado");
                    } else if (conjunto == 99) {
                        System.out.println("no implementado");
                    }
                    break;
                case 12:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        System.out.println("no implementado");
                    } else if (conjunto == 99) {
                        System.out.println("no implementado");
                    }
                    break;
                case 13:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        System.out.println("no implementado");
                    } else if (conjunto == 99) {
                        System.out.println("no implementado");
                    }
                    break;
                case 14:
                    conjunto = obtenerNumeroPorEntrada("Escoja un Conjunto", conjuntoOpcion);
                    if (conjunto == 77) {
                        conjuntoA.vaciar();
                        JOptionPane.showMessageDialog(null, "Conjunto vacio", CONJUNTO_A, JOptionPane.INFORMATION_MESSAGE);
                    } else if (conjunto == 99) {
                        conjuntoB.vaciar();
                        JOptionPane.showMessageDialog(null, "Conjunto vacio", CONJUNTO_B, JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                default:
                    if (option != 99 && option != 77) {
                        JOptionPane.showMessageDialog(null, "Opción " + option + " no valida intente de nuevo", "Opción no valida", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
            }

        } while (option != 0);
    }

    public static int obtenerNumeroPorEntrada(String titulo, String mensaje) {
        do {

            String option = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.DEFAULT_OPTION);
            try {
                return Integer.parseInt(option);
            } catch (Exception e) {
                if ("null".equals(e.getMessage())) {
                    return 0;
                }
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero\n" + e.getMessage(), "Error", JOptionPane.ERROR);
            }
        } while (true);
    }
}
