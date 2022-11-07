
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
            
            sesion = true;
        }
        else if(des == 2){
            //crea usuarios
            
            sesion = true;
        }

        while(sesion == true){
            //muestra el mensaje principal 
            view.mainpage();
           
            if(cho == 1){
                continue;
                
                //ensena los restaurantes y las opciones
        
            }
            else if (cho == 2){
                continue;
                
            }
            else if (cho == 3){
                continue;
                
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
