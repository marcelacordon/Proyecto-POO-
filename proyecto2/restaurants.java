public class restaurants extends lugar{

    restaurants(){

    }

    restaurants(String nam, String loc, String sch, String num, int numperat, int sumrat){
        super(nam, loc, sch, num, numperat, sumrat);
    }

    @Override
    public String agregado() {
        // TODO Auto-generated method stub
        return "Restaurante agregado! Gracias por tu contribucion";
    }



   

    
}
