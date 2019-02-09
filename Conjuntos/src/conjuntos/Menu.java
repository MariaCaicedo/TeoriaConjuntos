package conjuntos;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        String menu = "Expresiones regulares\n0.salir\n1.Cantidad de Elementos\n2.Pertenece\n3.Subconjunto\n4.Es Vacio\n5.Union\n6.Interseccion" +
                "\n7.Igualdad\n8.Complemento\n9.Agregar un Elemento\n10.Borrar\n11.Posicion\n12.Diferencia\n13.Diferencia Simetrica\n14.Vaciar";
        int option = obtenerNumeroPorEntrada("", "");
        do {
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción " + option + " no valida intente de nuevo", "Opción no valida", JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero\n" + e.getMessage(), "Error", JOptionPane.ERROR);
            }
        } while (true);
    }
}
