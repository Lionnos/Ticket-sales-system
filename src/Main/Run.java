package Main;

import java.awt.EventQueue;

public class Run {
   
    public static void main(String[] args) {

        // Crea y muestra una ventana de aplicación de forma segura.
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    main run = new main();
                    run.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        /*
            EventQueue: se utiliza para agendar un trabajo para su ejecución en el hilo de despacho de eventos.

            invokeLater: asegura que la creación y visualización de la ventana se realice en el hilo de despacho de eventos 
                       y no en el hilo principal de la aplicación, lo que a su vez evita problemas de concurrencia y bloqueo de la interfaz de usuario.

            Runnable: define el trabajo que se desea ejecutar en el hilo de despacho de eventos. 
                      En este caso, el trabajo consiste en crear una instancia de la clase Login y hacerla visible en la pantalla.

        */
    }
}
