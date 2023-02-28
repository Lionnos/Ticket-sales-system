package views;

public class print {
    
    public static void comprobarGuardado(int data, String d){
        if (data > 0) {
            System.out.println("guardado: " + d);
        } else {
            System.out.println("guardodo : false"+ d);
        }
    };
}
