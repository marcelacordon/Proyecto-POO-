import java.io.FileNotFoundException;
import java.util.ArrayList;

public class controlador {
    view view = new view();
    int des;
    int cho;
    int elec;
    boolean sesion; 
    ArrayList<user> usuarios = new ArrayList<user>();  
    ArrayList<restaurants> restaurantes = new ArrayList<restaurants>();
    ArrayList<partying> partyplaces = new ArrayList<partying>();
    ArrayList<hangoutp> hgplaces = new ArrayList<hangoutp>();
    user userprincipal;
    ArrayList<reviews> badrest = new ArrayList<reviews>();
    ArrayList<reviews> badparty = new ArrayList<reviews>();
    ArrayList<reviews> badhang = new ArrayList<reviews>();

    public void getinfo() throws FileNotFoundException{
        archiv arch = new archiv();
        usuarios = arch.leerusers();//agrega los usuarios preexistentes
        restaurantes = arch.restaurantes();//agrega los restaurantes preexistentes
        hgplaces = arch.hangoutplace();//agrega los hangoutplaces preexistentes
        partyplaces = arch.partyplace();//agrega los party places preexistentes
        badrest = arch.badreviewsres(); //crea los bad reviews de lugares
        badparty = arch.badreviewspart();
        badhang = arch.badreviewshang();
    }
    
    

    public void work(){
        archiv arch = new archiv();
        des = view.principal();
        if(des == 1){
            //inicia sesion
            userprincipal = view.iniciarsesion(usuarios);
            sesion = true;
        }
        else if(des == 2){
            //crea usuarios
            userprincipal = view.crearusuario( usuarios);
            usuarios.add(userprincipal);
            sesion = true;
        }

        while(sesion == true){
            //muestra el mensaje principal 
            cho = view.mainpage();
            if(cho == 1){
                elec = (view.restaurantspage(restaurantes))-1;
                //ensena los restaurantes y las opciones
                if(elec < (restaurantes.size())){
                    int agregar = view.printrestaurant(restaurantes.get(elec));
                    //ensena el restaurante que escogio
                    if (agregar == 1){
                        view.addrating(restaurantes.get(elec));
                    }
                }
                else if(elec == (restaurantes.size())){
                    restaurants newrest = view.restaurantenuevo(restaurantes);
                    if (newrest.getName() != null){
                        //si el restaurante si tiene un valor dado, si lo agrega, si no no
                        restaurantes.add( newrest);
                    }
                    else{
                        continue;
                    }
                }
                else if (elec == (restaurantes.size()) + 1){
                    continue;
                }
            }
            else if (cho == 2){
                elec = (view.partyingpage(partyplaces))-1;
                if(elec < (partyplaces.size())){
                    //ver todos los party places que hay
                    int agregar = view.printparty(partyplaces.get(elec));
                    if (agregar == 1){
                        view.addrating(partyplaces.get(elec));
                    }
                }
                else if(elec == (partyplaces.size())){
                    //agregar un nuevo party place
                    partying newrpart = view.newpPartying(partyplaces);
                    if (newrpart.getName() != null){
                        //si el lugar si tiene un valor dado, si lo agrega, si no no
                        partyplaces.add( newrpart);
                    }
                    else{
                        continue;
                    }
                }
                else if (elec == (partyplaces.size()) + 1){
                    //regresar al menu
                    continue;
                }
            }
            else if (cho == 3){
                elec = (view.hangoutpage(hgplaces))-1;
                if(elec < (hgplaces.size())){
                    //ver todos los hangout places que hay
                    int agregar = view.printhangout(hgplaces.get(elec));
                    if (agregar == 1){
                        view.addrating(hgplaces.get(elec));
                    }
                }
                else if(elec == (hgplaces.size())){
                    hangoutp newrhHangoutp = view.newhHangoutp(hgplaces);
                    if (newrhHangoutp.getName() != null){
                        //si el lugar si tiene un valor dado, si lo agrega, si no no
                        hgplaces.add( newrhHangoutp);
                    }
                    else{
                        continue;
                    }
                }
                else if (elec == (hgplaces.size()) + 1){
                    continue;
                }
            }
            else if (cho == 4){
                //BAD REVIEWS
                int cal = view.reviewmenu();
                if (cal == 1){
                    view.badrest(badrest);
                }
                else if (cal == 2){
                    view.badhang(badhang);
                }
                else if (cal == 3){
                    view.badparty(badparty);
                }
                else if (cal == 4){
                    view.tiporeview();
                    if (view.des == 1){
                        reviews s = view.addreview(userprincipal);
                        if (s != null){
                            badrest.add( s);
                        }
                        else{
                            continue;
                        }

                    }
                    else if (view.des == 2){
                        reviews s = view.addreview(userprincipal);
                        if (s != null){
                            badhang.add( s);
                        }
                        else{
                            continue;
                        }

                    }
                    else if (view.des == 3){
                        reviews s = view.addreview(userprincipal);
                        if (s != null){
                            badparty.add( s);
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        view.invalido();
                    }

                }
                else {
                    view.invalido();
                }
            }
            else if (cho == 5){
                view.salir();//mensaje de despedida
                arch.Escriturausers( usuarios);//agrega los usuarios de regreso a su archivo
                arch.Escriturarests(restaurantes);//agrega los restaurantes de regreso a su archivo
                arch.Escriturhangout(hgplaces);//agrega los hangout places de regreso a su archivo
                arch.Escriturparty(partyplaces);//agrega los party places de regreso a su archivo
                sesion = false;//termina el programa
                arch.Escriturareviews("badrest.txt", badrest);
                arch.Escriturareviews("badparty.txt", badparty);
                arch.Escriturareviews("badhang.txt", badhang);

            }
            else {
                view.invalido();
            }
        }
   }

    public ArrayList<user> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<user> usuarios) {
        this.usuarios = usuarios;
    }

    
}
