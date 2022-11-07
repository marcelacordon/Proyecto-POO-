import java.util.ArrayList;
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
     * @param newu
     * @param u    este es el método que ayuda a la creación de un usuario.
     */
    public user crearusuario(ArrayList<user> u) {
        boolean uniquen = false;
        user startu = new user();
        String newname;
        String pass;
        boolean passe = false;
        while (uniquen == false) {
            System.out.println(
                    "\t\t\t\t\t\t\t\t\t\tGO GAYS \n\t\t\t\t\t\t\t\t\tUN LUGAR SEGURO PARA TI\n\n\n \t\t\tCREAR USUARIO\n Ingrese un nombre de usuario:");
            newname = sc.next();
            System.out.println("Ingrese su contrasena");
            pass = sc.next();
            for (int i = 0; i < u.size(); i++) {
                if (newname.equals(u.get(i).getUserr())) {
                    System.out.println("Nombre se usuario ya esta en uso. Intente nuevamente");
                    passe = false;
                    break;
                } else {
                    passe = true;
                }
            }
            if (passe == true){
                System.out.println("Bienvenid@!");
                startu.setUserr(newname);
                startu.setPassword(pass);
                uniquen = true;
                break;
            }

        }
        return startu;
    }

    /**
     * @param u
     * @return user este es el método que ayuda al inicio de sesión.
     */
    public user iniciarsesion(ArrayList<user> u) {
        boolean play = false;
        String us;
        String pass;
        user startu = new user();
        while (play == false) {
            System.out.println(
                    "\t\t\t\t\t\t\t\t\t\tGO GAYS \n\t\t\t\t\t\t\t\t\tUN LUGAR SEGURO PARA TI \n\t\t\t\t\t\t\t\t\t     INICIAR SESION\n Ingrese su nombre de usuario:");
            us = sc.next();
            System.out.println("Ingrese su contrasena");
            pass = sc.next();
            boolean nelpi = true;
            for (int i = 0; i < u.size(); i++) {
                if (us.equals(u.get(i).getUserr()) && pass.equals(u.get(i).getPassword())) {
                    user yup = u.get(i);
                    startu = yup;
                    System.out.println("Bienvenid@ de nuevo!");
                    play = true;
                    nelpi = false;
                    break;
                } else {
                    nelpi = true;
                }

            }
            if (nelpi == true) {
                System.out.println("Usuario o contrasena invalidos, vuelva a intentarlo");
                continue;
            }

        }

        return startu;
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

    /**
     * @param r
     * @return int Se imprimen los restaurantes disponibles.
     */
    public int restaurantspage(ArrayList<restaurants> r) {
        int index = 1;
        System.out.println(
                "\t\t\t\t\t\tGO GAYS \n\t\t\t\t\tUN LUGAR SEGURO PARA TI\n\t\t\t\t\t      RESTAURANTES\n Restaurantes disponibles: ");
        for (int i = 0; i < r.size(); i++) {
            System.out.println(index + "." + r.get(i).getName());
            index++;
        }
        System.out.println(
                "\n\n- Pulse el número de indice del lugar que desea ver más información. \n- ¿Desea agregar un restaurante? Pulse "
                        + index + "\n- ¿Desea regresar a la pagina principal? Pulse " + (index + 1));
        index = sc.nextInt();
        return index;
    }

    /**
     * @param r Se imprime la información de un restaurante especifico.
     */
    // SEND HELP AQUI RATING CONVERTIRLO EN INT
    public void printrestaurant(restaurants r) {
        System.out.println(
                "\t\t\t\t\t---Restaurante " + r.getName() + "---\n\nDirección: " + r.getLocation() + "\nHorario: "
                        + r.getSchedule() + "\nTelefono: " + r.getNumtel() + "\nRating: " + r.getRating() + "/5 ");
                        if(r.getRating() == 0 && r.getNumperrating() == 0){
                            System.out.println("El restaurante se agrego recientemente, aun no tiene ratings");
                        }
    }

    /**
     * @param r
     * @return int Se imprimen las fiestas disponibles.
     */
    public int partyingpage(ArrayList<partying> r) {
        int index = 1;
        System.out.println(
                "\t\t\t\t\t\tGO GAYS \n\t\t\t\t\tUN LUGAR SEGURO PARA TI\n\t\t\t\t\t    PARTYING PLACES\n\n Lugares disponibles: ");
        for (int i = 0; i < r.size(); i++) {
            System.out.println(index + "." + r.get(i).getName());
            index++;
        }
        System.out.println(
                "\n\nPulse el número del lugar que desea ver más información. \n¿Desea agregar un lugar de fiesta? Pulse "
                        + index + "\n¿Desea regresar a la pagina principal? Pulse " + (index + 1));
        index = sc.nextInt();
        return index;
    }

    /**
     * @param r Se imprime la información de una fiesta especifico.
     */
    // SEND HELP AQUI RATING CONVERTIRLO EN INT
    public void printparty(partying r) {
        System.out.println(
                "\t\t\t\t\t---Lugar de Fiesta: " + r.getName() + "---\n\nDirección: " + r.getLocation() + "\nHorario: "
                        + r.getSchedule() + "\nTelefono: " + r.getNumtel() + "\nRating: " + r.getRating() + "/5 ");
                        if(r.getRating() == 0 && r.getNumperrating() == 0){
                            System.out.println("El lugar se agrego recientemente, aun no tiene ratings");
                        }
    }

    /**
     * @param r
     * @return int Se imprimen los hangout places disponibles.
     */
    public int hangoutpage(ArrayList<hangoutp> r) {
        int index = 1;
        System.out.println(
                "\t\t\t\t\t\tGO GAYS \n\t\t\t\t\tUN LUGAR SEGURO PARA TI\n\t\t\t\t\t     HANGOUT PLACES\n Lugares disponibles: ");
        for (int i = 0; i < r.size(); i++) {
            System.out.println(index + "." + r.get(i).getName());
            index++;
        }
        System.out.println(
                "\n\nPulse el número del lugar que desea ver más información. \n¿Desea agregar un lugar de Hangout? Pulse "
                        + index + "\n¿Desea regresar a la pagina principal? Pulse " + (index + 1));
        index = sc.nextInt();
        return index;
    }

    /**
     * @param r Se imprime la información de un hangout especifico.
     */
    //
    public void printhangout(hangoutp r) {
        System.out.println(
                "\t\t\t\t\t---Lugar para Pasear: " + r.getName() + "---\nDirección: " + r.getLocation() + "\nHorario: "
                        + r.getSchedule() + "\nTelefono: " + r.getNumtel() + "\nRating: " + r.getRating() + "/5 ");
                        if(r.getRating() == 0 && r.getNumperrating() == 0){
                            System.out.println("El lugar se agrego recientemente, aun no tiene ratings");
                        }
    }


    public void invalido() {
        System.out.println("Ingrese un valor válido");
    }

  
}
