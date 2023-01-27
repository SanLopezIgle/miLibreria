public class Main {
    public static void main(String[] args) {
/*
        Boolean isOK_ventana = false;
        Boolean isOK_consola = false;

        isOK_consola = EntradaSalida.salida("Hola mundo <3", EntradaSalida.SALIDA_CONSOLA);
        if(!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hola mundo <3", EntradaSalida.SALIDA_VENTANA);
        if(!isOK_ventana) System.out.println("ERROR VENTANA");
*/
        Boolean isOK_entero = false;
        Boolean isOK_cadena = false;

        isOK_entero = EntradaSalida.entrada(EntradaSalida.OPCION_ENTERO);
        if(!isOK_entero) System.out.println("ERROR ENTERO");
        isOK_cadena = EntradaSalida.entrada(EntradaSalida.OPCION_CADENA);
    }
}