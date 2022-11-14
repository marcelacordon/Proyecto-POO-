public class reviews {

    private String usuario;
    private String comentario;
    private String lugar;

    reviews (String user, String place, String comment){
        this.usuario = user;
        this.comentario = comment;
        this.lugar = place;

    }
    reviews (){
        
    }

    
    /** 
     * @return String
     */
    public String getUsuario() {
        return usuario;
    }

    
    /** 
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    /** 
     * @return String
     */
    public String getComentario() {
        return comentario;
    }

    
    /** 
     * @param comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    /** 
     * @return String
     */
    public String getLugar() {
        return lugar;
    }

    
    /** 
     * @param lugar
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
