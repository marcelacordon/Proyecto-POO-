
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
    

    
    public void work(){
        
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
                    view.printrestaurant(restaurantes.get(elec));
                    //ensena el restaurante que escogio
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
                    view.printparty(partyplaces.get(elec));
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
                    view.printhangout(hgplaces.get(elec));
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
                continue;
            }
            else if (cho == 5){

                sesion = false;//termina el programa
            }
        }
   }



    
}
