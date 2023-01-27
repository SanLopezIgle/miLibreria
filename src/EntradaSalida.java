import com.sun.source.tree.TryTree;

import javax.swing.*;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class EntradaSalida {
    static final int OPCION_ENTERO = 1;
    static final int OPCION_CADENA = 2;
    static final int SALIDA_CONSOLA = 1;
    static final int SALIDA_VENTANA = 2;

    /**
     * Entrada por consola de un entero o una cadena
     * @param opcion entrada de entero (OPCION_ENTERO) o entrada de cadena (OPCION_CADENA)
     * @return true si correcto y si no false
     */
    public static boolean entrada(int opcion){
        Scanner sc = new Scanner(System.in);
        switch(opcion){
            case OPCION_ENTERO:
                try {
                    int entero = 0;
                    System.out.println("Dame un entero: ");
                    sc.nextInt();
                    return true;
                }catch (Exception e){
                    return false;
                }
            case OPCION_CADENA:
                try {
                    System.out.println("Dame una cadena: ");
                    sc.nextLine();
                    return true;
                }catch (Exception e){
                    return false;
                }
            default:
                return false;
        }
    }
    /**
     * Salida por ventana o consola de un mensaje
     * @param mensaje cadena que queremos imprimir
     * @param dispositivo dispositivo de salida, consola(SALIDA_CONSOLA) o ventana(SALIDA_VENTANA)
     * @return si es true correcto si es false
     */
    public static boolean salida(String mensaje, int dispositivo){
        switch (dispositivo) {
            //TODO: try catch
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + mensaje);
                    return true;
                } catch (Exception e){
                    return false;
                }
            case SALIDA_VENTANA:
                try {
                    JOptionPane.showMessageDialog(null, mensaje);
                    JOptionPane.showMessageDialog(null, "Sale por ventana" + mensaje.toCharArray()[20]);
                    return true;
                }catch (Exception e){
                    return false;
                }
            default:
                return false;
        }
    }

}
