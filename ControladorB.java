/**
 * Clase que implementa la interfaz PanelControl para manejar eventos específicos.
 * Esta clase proporciona implementaciones para los eventos A y B del panel de control.
 */
public class ControladorB implements PanelControl {

    /**
     * Maneja el evento A del panel de control.
     * Imprime un mensaje indicando que el Controlador B está manejando el evento A.
     */
    public void eventoA() {
        System.out.println("Controlador B en evento A");
    }

    /**
     * Maneja el evento B del panel de control.
     * Imprime un mensaje indicando que el Controlador B está manejando el evento B.
     */
    public void eventoB() {
        System.out.println("Controlador B en evento B");
    }
}