public class Main {
    public static void main(String[] args) {

        Boolean resultado = false;

        resultado = EntradaSalida.salida("Hola mundo <3", EntradaSalida.SALIDA_CONSOLA);
        resultado = EntradaSalida.salida("Hola mundo <3", EntradaSalida.SALIDA_VENTANA);

        resultado = EntradaSalida.entrada(EntradaSalida.OPCION_ENTERO);
        resultado = EntradaSalida.entrada(EntradaSalida.OPCION_CADENA);
    }
}