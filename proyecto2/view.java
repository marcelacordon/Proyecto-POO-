
import java.util.Scanner;


public class view {
    private Scanner sc = new Scanner(System.in);
    int des;
    String answ;
    boolean listo;

    /**
     * @return este es el mensaje que se pone en pantalla al iniciar el codigo
     */
    public int principal() {
        System.out.println(
                "\t\t\t\t\t\t\t\t\t\tGO GAYS \n\t\t\t\t\t\t\t\t\tUN LUGAR SEGURO PARA TI\n\n\n ¿Qué desea hacer? \n 1 Iniciar Sesión \n 2 Crear Usuario");
        des = sc.nextInt();
        return des;
    }

       /**
     * @return int Se imprime la pagina principal del app para que decida el usaurio
     *         que quiere hacer.
     */
    public int mainpage() {
        System.out.println(
                "\t\t\t\t\t\tGO GAYS \n\t\t\t\t\tUN LUGAR SEGURO PARA TI \n ¿Qué desea buscar?\n 1 Restaurante\n 2 Partying Places \n 3 Hangout Places\n 4 BAD REVIEWS\n 5 Salir");
        des = sc.nextInt();
        return des;
    }

}
