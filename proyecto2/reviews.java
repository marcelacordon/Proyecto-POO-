public class reviews {

    private boolean good;
    private String usuario;
    private String comentario;
    private String lugar;

    reviews (String user, String comment, String place){
        this.usuario = user;
        this.comentario = comment;
        this.lugar = place;

    }

    
    /** 
     * @return boolean
     */
    public boolean isGood() {
        return good;
    }

    
    /** 
     * @param good
     */
    public void setGood(boolean good) {
        this.good = good;
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
