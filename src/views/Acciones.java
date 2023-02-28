package views;

import javax.swing.JPanel;

import Users.BuscarAsiento;

/**
 * @author Henry
 */
public class Acciones {
    public static Object[][] tablaboleta;
    public static Object[][] tablaventa;
    public static Object[][] tablacliente;
    public static Object[][] tablareserva;
    public static Object[][] tablaviaje;


    // ACCION CLICK
    public static void click(JPanel panel,int number){
        
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accion(number);
            }
        });

    }
    public static void actualiza(){

        tablaboleta = BuscarAsiento.tablabolet();
        tablaventa = BuscarAsiento.tablavent();
        tablacliente = BuscarAsiento.tablaclient();
        tablareserva = BuscarAsiento.tablareserv();
        tablaviaje = BuscarAsiento.tablaviaj();

    }

    private static void accion(int number){
        actualiza();

        Object idboleta = "";
        Object idventa = "";
        Object idcliente ="";
        Object idviaje = "";
        Object idreserva = "";

        String destinoviaje = "";
        String fechaviaje= "";
        String horaviaje= "";

        String nombre = "";
        String apellido = "";
        String dni = "";

        Object asientoVendido = "";
        Object asientoReservado = "";
        
        // Recorrer tabla boleta
        for (int i = 0; i < tablaboleta.length; i++) {
            if (tablaboleta[i][2] == (Integer)number) { // igualando al nuemro de asiento
                asientoVendido = tablaboleta[i][2];
                idboleta = tablaboleta[i][0].toString();
                idventa = tablaboleta[i][3]; //-->
                idviaje = tablaboleta[i][4]; //-->
                break;
            }
        }

        if(asientoVendido != "" && asientoVendido != null){
            // Recorrer tabla viaje
            for (int i = 0; i < tablaviaje.length; i++) {
                if (tablaviaje[i][0].equals(idviaje)) { // igualando al nuemro de asiento
                    fechaviaje = tablaviaje[i][1].toString(); 
                    horaviaje = tablaviaje[i][2].toString(); 
                    destinoviaje= tablaviaje[i][3].toString();
                    break;
                }
            }

            // Recorrer tabla venta
            for (int i = 0; i < tablaventa.length; i++) {
                if (tablaventa[i][0].equals(idventa)) { // buscando con la id relaciona al asiento
                    idcliente = tablaventa[i][4]; //-->
                    break;
                }
            }

            // Recorrer tabla cliente
            for (int i = 0; i < tablacliente.length; i++) {
                if (tablacliente[i][0].equals(idcliente)) { // buscando con la id relaciona al asiento
                    dni = tablacliente[i][1].toString();
                    nombre = tablacliente[i][2].toString();
                    apellido = tablacliente[i][3].toString();
                    break;
                }
            }
            if ((asientoVendido != "" && asientoVendido != null)) {
                Principal.Boleto.setText(idboleta.toString());
                Principal.dni.setText(dni);
                Principal.Nombre.setText(nombre);
                Principal.Apellido.setText(apellido);
                Principal.destino.setText(destinoviaje);
                Principal.hora_salida.setText(horaviaje);
                Principal.fechaSalida.setText(fechaviaje);
            }
        }

        // Recorrer tabla reserva
        for (int i = 0; i < tablareserva.length; i++) {
                if (tablareserva[i][5] == (Integer)number) { // buscando con la id relaciona al asiento
                    idreserva =  tablareserva[i][0];
                    asientoReservado = tablareserva[i][5];
                    break;
                }
            }
        

        if (asientoReservado != "" && asientoReservado != null) {
            // Recorrer tabla reserva
            for (int i = 0; i < tablareserva.length; i++) {
                if (tablareserva[i][0].equals(idreserva)) { // buscando con la id relaciona al asiento
                    destinoviaje = tablareserva[i][1].toString();
                    fechaviaje = tablareserva[i][3].toString();
                    horaviaje = tablareserva[i][4].toString();
                    idcliente = tablareserva[i][7]; // -->
                    break;
                }
            }
            // Recorrer tabla cliente
            for (int i = 0; i < tablacliente.length; i++) {
                if (tablacliente[i][0].equals(idcliente)) { // buscando con la id relaciona al asiento
                    dni = tablacliente[i][1].toString();
                    nombre = tablacliente[i][2].toString();
                    apellido = tablacliente[i][3].toString();
                    break;
                }
            }

            if ((asientoReservado != "" && asientoReservado != null)) {
                Principal.Boleto.setText(idboleta.toString());
                Principal.dni.setText(dni);
                Principal.Nombre.setText(nombre);
                Principal.Apellido.setText(apellido);
                Principal.destino.setText(destinoviaje);
                Principal.hora_salida.setText(horaviaje);
                Principal.fechaSalida.setText(fechaviaje);
            }
        }
        /*
        Principal.Boleto.setText(" ");
                Principal.dni.setText(" ");
                Principal.Nombre.setText(" ");
                Principal.Apellido.setText(" ");
                Principal.destino.setText(" ");
                Principal.hora_salida.setText(" ");
                Principal.fechaSalida.setText(" ");
        */
    }

}