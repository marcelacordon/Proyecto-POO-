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
    public int printrestaurant(restaurants r) {
        System.out.println(
                "\t\t\t\t\t---Restaurante " + r.getName() + "---\n\nDirección: " + r.getLocation() + "\nHorario: "
                        + r.getSchedule() + "\nTelefono: " + r.getNumtel() + "\nRating: " + r.getRating() + "/5 ");
                        if(r.getRating() == 0 && r.getNumperrating() == 0){
                            System.out.println("El restaurante se agrego recientemente, aun no tiene ratings");
                        }
        System.out.println("¿Desea agregar un rating a " + r.getName() + "? \n1 SI \n2 NO");
        int choice = sc.nextInt();
        return choice;
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
    public int printparty(partying r) {
        System.out.println(
                "\t\t\t\t\t---Lugar de Fiesta: " + r.getName() + "---\n\nDirección: " + r.getLocation() + "\nHorario: "
                        + r.getSchedule() + "\nTelefono: " + r.getNumtel() + "\nRating: " + r.getRating() + "/5 ");
                        if(r.getRating() == 0 && r.getNumperrating() == 0){
                            System.out.println("El lugar se agrego recientemente, aun no tiene ratings");
                        }
        System.out.println("¿Desea agregar un rating a " + r.getName() + "? \n1 SI \n2 NO");
        int choice = sc.nextInt();
        return choice;
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
    public int printhangout(hangoutp r) {
        System.out.println(
                "\t\t\t\t\t---Lugar para Pasear: " + r.getName() + "---\nDirección: " + r.getLocation() + "\nHorario: "
                        + r.getSchedule() + "\nTelefono: " + r.getNumtel() + "\nRating: " + r.getRating() + "/5 ");
                        if(r.getRating() == 0 && r.getNumperrating() == 0){
                            System.out.println("El lugar se agrego recientemente, aun no tiene ratings");
                        }
        System.out.println("¿Desea agregar un rating a " + r.getName() + "? \n1 SI \n2 NO");
        int choice = sc.nextInt();
        return choice;
    }

    public void salir() {
        System.out.println("Gracias por utilizar GO GAYS, esperamos que disfrute sus salidas seguras");
    }

    public void invalido() {
        System.out.println("Ingrese un valor válido");
    }

    
    /** 
     * @param d
     * @return restaurants
     * Para agregar restaurantes
     */
    public restaurants restaurantenuevo(ArrayList<restaurants> d) {
        boolean marco = true;
        restaurants res = new restaurants();
        boolean conti = false;
        while (marco == true) {
            System.out.println("Ingrese el nombre del restaurante:");
            String name = sc.next();
            String name2 = sc.nextLine();
            name = name + name2;
            for (int i = 0; i < d.size(); i++) {
                if (name.equals(d.get(i).getName())) {
                    System.out.println("Este lugar ya existe en nuestra lista, vuelve a intentarlo");
                    conti = false;
                    marco = false;
                    break;
                } else {
                    conti = true;
                }
            }
            if (conti == true) {
                System.out.println("Ingrese la dirección del restaurante:");
                String direccion = sc.next();
                String direccion2 = sc.nextLine();
                direccion = direccion + direccion2;
                System.out.println("Ingrese el horario del restaurante:");
                String horario = sc.next();
                String horario2 = sc.nextLine();
                horario = horario + horario2;
                System.out.println("Ingrese el telefono del restaurante:");
                String tel = sc.next();
                int per = 0;
                int tot = 0;
                res = new restaurants(name, direccion, horario, tel, per, tot);
                System.out.println(res.agregado());
                marco = false;
                break;
            }
        }
        return res;
    }

    
    /** 
     * @param d
     * @return partying
     * para crear un nuevo party place
     * 
     */
    public partying newpPartying(ArrayList<partying> d) {
        boolean marco = true;
        partying res = new partying();
        boolean conti = false;
        while (marco == true) {
            System.out.println("Ingrese el nombre del lugar de fiesta:");
            String name = sc.next();
            String name2 = sc.nextLine();
            name = name + name2;
            for (int i = 0; i < d.size(); i++) {
                if (name.equals(d.get(i).getName())) {
                    System.out.println("Este lugar ya existe en nuestra lista, vuelve a intentarlo");
                    conti = false;
                    marco = false;
                    break;
                } else {
                    conti = true;
                }
            }
            if (conti == true) {
                System.out.println("Ingrese la dirección:");
                String direccion = sc.next();
                String direccion2 = sc.nextLine();
                direccion = direccion + direccion2;
                System.out.println("Ingrese el horario del establecimiento:");
                String horario = sc.next();
                String horario2 = sc.nextLine();
                horario = horario + horario2;
                System.out.println("Ingrese el numero de telefono:");
                String tel = sc.next();
                int per = 0;
                int tot = 0;
                res = new partying(name, direccion, horario, tel, per, tot);
                System.out.println(res.agregado());
                marco = false;
                break;
            }
        }
        return res;
    }

    
    /** 
     * @param d
     * @return hangoutp
     * para crear un nuevo hangout place
     */
    public hangoutp newhHangoutp(ArrayList<hangoutp> d) {
        boolean marco = true;
        hangoutp res = new hangoutp();
        boolean conti = false;
        while (marco == true) {
            System.out.println("Ingrese el nombre del lugar de fiesta:");
            String name = sc.next();
            String name2 = sc.nextLine();
            name = name + name2;
            for (int i = 0; i < d.size(); i++) {
                if (name.equals(d.get(i).getName())) {
                    System.out.println("Este lugar ya existe en nuestra lista, vuelve a intentarlo");
                    conti = false;
                    marco = false;
                    break;
                } else {
                    conti = true;
                }
            }
            if (conti == true) {
                System.out.println("Ingrese la dirección:");
                String direccion = sc.next();
                String direccion2 = sc.nextLine();
                direccion = direccion + direccion2;
                System.out.println("Ingrese el horario del establecimiento:");
                String horario = sc.next();
                String horario2 = sc.nextLine();
                horario = horario + horario2;
                System.out.println("Ingrese el numero de telefono:");
                String tel = sc.next();
                int per = 0;
                int tot = 0;
                res = new hangoutp(name, direccion, horario, tel, per, tot);
                System.out.println(res.agregado());
                marco = false;
                break;
            }
        }
        return res;
    }

    
    /** 
     * @param l
     */
    public void addrating(lugar l){
        boolean succesfulladd = false;
        System.out.println("Rating de " + l.getName());
        while (succesfulladd == false){
            System.out.println("\nIngrese su rating con un número del 1 al 5 dependiendo de su experiencia con el lugar. \n1 Nada Satisfactorio \n2 Poco Satisfactorio \n3 Satisfactorio \n4 Muy Satisfactorio \n5 Plenamente Satisfactorio \n ");
            int rate = sc.nextInt();
            if(rate > 5 || rate < 1){
                System.out.println("Ingrese un valor válido");
            }
            else{
                l.setNumperrating(l.getNumperrating() + 1);
                l.setSumarating(l.getSumarating() + rate);
                l.setRating(l.getSumarating()/l.getNumperrating());
                System.out.println("Rating agregado exitosamente");
                succesfulladd = true;
            }
        }
    }


    //
    public int reviewmenu (){
        System.out.println("\t\t\t\t\t\t\tBAD REVIEWS\n\n\t1. Restaurantes\n\t2. Hangout Places\n\t3. Party Places\n\t4. Agregar una");
        des = sc.nextInt();
        return des;
    }

    
    /** ver los bad reviews de restaurantes
     * @param ArrayListd
     */
    public void badrest (ArrayList<reviews>d){
        System.out.println("\t\t\t\t\t\t\tBAD REVIEWS DE RESTAURANTES\n\n");
        for (int i = 0; i < d.size(); i ++){
            System.out.println("\t\t\t\t\t\t"+d.get(i).getLugar()+"\n"+d.get(i).getUsuario()+": "+d.get(i).getComentario()+"\n\n");
        }
    }
    
    /** ver bad reviews de hangout places
     * @param ArrayListd
     */
    public void badhang (ArrayList<reviews>d){
        System.out.println("\t\t\t\t\t\t\tBAD REVIEWS DE HANGOUT PLACES\n\n");
        for (int i = 0; i < d.size(); i ++){
            System.out.println("\t\t\t\t\t\t"+d.get(i).getLugar()+"\n"+d.get(i).getUsuario()+": "+d.get(i).getComentario()+"\n\n");
        }
    }

    
    /** ver bad reviews de party places
     * @param ArrayListd
     */
    public void badparty (ArrayList<reviews>d){
        System.out.println("\t\t\t\t\t\t\tBAD REVIEWS DE PARTY PLACES\n\n");
        for (int i = 0; i < d.size(); i ++){
            System.out.println("\t\t\t\t\t\t"+d.get(i).getLugar()+"\n"+d.get(i).getUsuario()+": "+d.get(i).getComentario()+"\n\n");
        }
    }

    public void tiporeview (){
        System.out.println("\nDe que tipo de lugar es tu review?\n1. Restaurantes\n2. Hangout Place\n3. Party Place");
        des = sc.nextInt();

    }

    
    /** agregar un review
     * @param s
     * @return reviews
     */
    public reviews addreview(user s){
        reviews rev = new reviews();
        System.out.println("Ingresa el nombre del lugar");
        String lug = sc.next();
        String lug2 = sc.nextLine();
        lug = lug + lug2;
        System.out.println("\nExplicanos lo que viviste:\n");
        String comm = sc.next();
        String comm2 = sc.nextLine();
        comm = comm + comm2;
        if (lug != null && comm != null){
            rev = new reviews(s.getUserr(), lug, comm);
            System.out.println("\nLamentamos mucho que hayas pasado por eso... Gracias por tener el coraje de contarlo para que los demás estemos prevenidos! ");
        }
        else {
            System.out.println("Lo sentimos... no llenaste algunos datos, podrias volver a intentarlo?");
        }
 
        return rev;
        
    }


}
