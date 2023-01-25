import javax.swing.*;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class EntradaSalida {

    public static int dameEntero(){
        int entero = Integer.parseInt(JOptionPane.showInputDialog("Dame un entero: "));

        do {
            if (entero == (int) entero) return entero;
            else entero = Integer.parseInt(JOptionPane.showInputDialog("No es un entero.\nDame otro valor: "));
        }while (entero != (int)entero);
        return entero;
    }

    static final int OPCION_ENTERO = 1;
    static final int OPCION_CADENA = 2;


    public static boolean entrada(int opcion){
        Scanner sc = new Scanner(System.in);
        switch(opcion){
            case 1:
                System.out.println("Dame un entero: ");
                sc.nextInt();
                return true;
            case 2:
                System.out.println("Dame uan cadena: ");
                sc.nextLine();
                return true;
            default:
                return false;
        }



    }

    static final int SALIDA_CONSOLA = 1;
    static final int SALIDA_VENTANA = 2;
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
                System.out.println("Consola: " + mensaje);
                return true;
            case SALIDA_VENTANA:
                JOptionPane.showMessageDialog(null, mensaje);
                return true;
            default:
                return false;
        }
    }

}
