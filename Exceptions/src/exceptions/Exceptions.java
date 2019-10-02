
package exceptions;

import javax.swing.JOptionPane;


public class Exceptions {

    
    public static void main(String[] args) {

        division();
    }

    //exepcion sin tratar
    public static void formatoNumero() {
        int numero;
        String cadena = "   1";
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            System.out.println("No es un numero es una cadena de texto." + ex.getMessage());
        }

    }

    public static void desborde() {
        int v[] = new int[3];
        try {
            for (int i = 0; i < 5; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException mem) {
            System.out.println("No hay suficientes campos en el vector   " + mem.getMessage());
        }
    }

    public static void aritmetico() {
        int numero = 5, resultado;
        try {
            resultado = numero / 0;
        } catch (ArithmeticException e) {
            System.out.println("No se puede realizar divicion por cero    " + e.getMessage());
        }

    }

    public static void division() throws NumberMinor {
        int ent, div, res;
        ent = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero entero a dividir: "));
        if (ent < 10) {
            throw new NumberMinor("El entero no pueder ser menor a 10");
        }
        try {
            div = Integer.parseInt(JOptionPane.showInputDialog("Digite el dividendo:"));
            res = ent / div;
            JOptionPane.showMessageDialog(null, "Resultado: " + res);
        } catch (ArithmeticException cer) {
            System.out.println("No es posible dividir por cero" + cer.getMessage());
        } catch (NumberFormatException form) {
            System.out.println("No es un Numero es una cadena de texto:  " + form.getMessage());
        }
    }

}
