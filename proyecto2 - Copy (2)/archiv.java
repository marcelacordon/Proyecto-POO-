import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class archiv {
    ArrayList<user> usuarios = new ArrayList<>();
    ArrayList<restaurants> restaurantes = new ArrayList<restaurants>();
    ArrayList<partying> partyplaces = new ArrayList<partying>();
    ArrayList<hangoutp> hgplaces = new ArrayList<hangoutp>();
    ArrayList<reviews> brrest = new ArrayList<reviews>();
    ArrayList<reviews> bhang = new ArrayList<reviews>();



    File filename;
    FileWriter w;
    BufferedWriter bw;
    PrintWriter wr;

    
    /** 
     * @return ArrayList<user>
     * @throws FileNotFoundException
     */
    public ArrayList<user> leerusers() throws FileNotFoundException{
        this.filename = new File("user.txt");
        //crea los users que tengo en mi archivo
        String[] data;
        Scanner sc = new Scanner(filename);
        while (sc.hasNextLine()) {
            data =sc.nextLine().split(",");
            user u = new user (data [0], data[1]);
            usuarios.add(u);
        } 
        sc.close();
        return usuarios;
    }
    
    /** 
     * @return ArrayList<restaurants>
     * @throws FileNotFoundException
     */
    public ArrayList<restaurants> restaurantes() throws FileNotFoundException{
        this.filename = new File("restaurants.txt");
        //crea los rest que tengo en mi archivo
        String[] data;
        Scanner sc = new Scanner(filename);
        while (sc.hasNextLine()) {
            data =sc.nextLine().split(";");
            restaurants u = new restaurants (data [0], data[1], data[2], data[3], Integer.parseInt(data[4]),Integer.parseInt(data[5]) );
            restaurantes.add(u);
        } 
        sc.close();
        return restaurantes;
    }

     
     /** 
      * @return ArrayList<partying>
      * @throws FileNotFoundException
      */
     public ArrayList<partying> partyplace() throws FileNotFoundException{
        this.filename = new File("partying.txt");
        //crea los party places que tengo en mi archivo
        String[] data;
        Scanner sc = new Scanner(filename);
        while (sc.hasNextLine()) {
            data =sc.nextLine().split(";");
            partying u = new partying (data [0], data[1], data[2], data[3], Integer.parseInt(data[4]),Integer.parseInt(data[5]) );
            partyplaces.add(u);
        } 
        sc.close();
        return partyplaces;
    }

    
    /** 
     * @return ArrayList<hangoutp>
     * @throws FileNotFoundException
     */
    public ArrayList<hangoutp> hangoutplace() throws FileNotFoundException{
        this.filename = new File("hangout.txt");
        //crea los hangout places que tengo en mi archivo
        String[] data;
        Scanner sc = new Scanner(filename);
        while (sc.hasNextLine()) {
            data =sc.nextLine().split(";");
            hangoutp u = new hangoutp (data [0], data[1], data[2], data[3], Integer.parseInt(data[4]),Integer.parseInt(data[5]) );
            hgplaces.add(u);
        } 
        sc.close();
        return hgplaces;
    }

        /** 
     * @return ArrayList<hangoutp>
     * @throws FileNotFoundException
     */
    public ArrayList<reviews> badreviewsres() throws FileNotFoundException{
        this.filename = new File("badrest.txt");
        //crea los bad reviews que tengo guardados
        String[] data;
        Scanner sc = new Scanner(filename);
        while (sc.hasNextLine()) {
            data =sc.nextLine().split(";");
            reviews u = new reviews (data[0], data [1] , data[2]);
            brrest.add(u);
        } 
        sc.close();
        return brrest;
    }

        /** 
     * @return ArrayList<hangoutp>
     * @throws FileNotFoundException
     */
    public ArrayList<reviews> badreviewshang() throws FileNotFoundException{
        this.filename = new File("badhang.txt");
        //crea los bad reviews que tengo guardados
        String[] data;
        Scanner sc = new Scanner(filename);
        while (sc.hasNextLine()) {
            data =sc.nextLine().split(";");
            reviews u = new reviews (data[0], data [1] , data[2]);
            bhang.add(u);
        } 
        sc.close();
        return bhang;
    }




    
    /** 
     * @param Nombre_archivo
     * @param d
     * escribe de regreso al archivo mis users
     */
    public void Escriturausers( ArrayList<user> d){

        try{
            filename= new File("user.txt");
            w= new FileWriter(filename);
            bw= new BufferedWriter(w);
            wr= new PrintWriter(bw);
            for (int i = 0; i<d.size(); i++){
                wr.write(d.get(i).getUserr());
                wr.write (",");
                wr.write(d.get(i).getPassword());
                wr.write("\n");
            }
            wr.close();


        }catch (Exception e){
            System.out.println("Excepcion" +e);}

        }

        /** 
         * @param d
         * escribe de regreso los rest al archivo
         */

        public void Escriturarests(ArrayList<restaurants> d){
            try{
                filename= new File("restaurants.txt");
                w= new FileWriter(filename);
                bw= new BufferedWriter(w);
                wr= new PrintWriter(bw);
                for (int i = 0; i<d.size(); i++){
                    wr.write(d.get(i).getName());
                    wr.write (";");
                    wr.write(d.get(i).getLocation());
                    wr.write (";");
                    wr.write(d.get(i).getSchedule());
                    wr.write (";");
                    wr.write(d.get(i).getNumtel());
                    wr.write (";");
                    wr.write(String.valueOf(d.get(i).getNumperrating()));
                    wr.write (";");
                    wr.write(String.valueOf(d.get(i).getSumarating()));
                    wr.write("\n");
                }
                wr.close();
    
    
            }catch (Exception e){
                System.out.println("Excepcion" +e);
    
            }
        
        }

        
        /** 
         * @param d
         * escribe de regreso los hangout places a su archivo
         */
        public void Escriturhangout(ArrayList<hangoutp> d){
            try{
                filename= new File("hangout.txt");
                w= new FileWriter(filename);
                bw= new BufferedWriter(w);
                wr= new PrintWriter(bw);
                for (int i = 0; i<d.size(); i++){
                    wr.write(d.get(i).getName());
                    wr.write (";");
                    wr.write(d.get(i).getLocation());
                    wr.write (";");
                    wr.write(d.get(i).getSchedule());
                    wr.write (";");
                    wr.write(d.get(i).getNumtel());
                    wr.write (";");
                    wr.write(String.valueOf(d.get(i).getNumperrating()));
                    wr.write (";");
                    wr.write(String.valueOf(d.get(i).getSumarating()));
                    wr.write("\n");
                }
                wr.close();
    
    
            }catch (Exception e){
                System.out.println("Excepcion" +e);
    
            }
        }

        
        /** 
         * @param d
         * escribe los party places de regreso a su archivo
         */
        public void Escriturparty(ArrayList<partying> d){
            try{
                filename= new File("partying.txt");
                w= new FileWriter(filename);
                bw= new BufferedWriter(w);
                wr= new PrintWriter(bw);
                for (int i = 0; i<d.size(); i++){
                    wr.write(d.get(i).getName());
                    wr.write (";");
                    wr.write(d.get(i).getLocation());
                    wr.write (";");
                    wr.write(d.get(i).getSchedule());
                    wr.write (";");
                    wr.write(d.get(i).getNumtel());
                    wr.write (";");
                    wr.write(String.valueOf(d.get(i).getNumperrating()));
                    wr.write (";");
                    wr.write(String.valueOf(d.get(i).getSumarating()));
                    wr.write("\n");
                }
                wr.close();
    
    
            }catch (Exception e){
                System.out.println("Excepcion" +e);
    
            }
        }
    
    
}
