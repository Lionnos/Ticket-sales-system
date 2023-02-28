package Users;

public class Separar {

    public  static String cadena( String string, int x){
        //"clñie-00034"
        String[] partes = string.split("-");

        if (x == 0) {
            return partes[0]+"-";
        } else {
           return partes[1];
        }
    }

}
