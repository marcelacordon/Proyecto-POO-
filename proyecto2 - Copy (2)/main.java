import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) {
        controlador cont = new controlador();
        try {
            cont.getinfo();
            cont.work();  
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}