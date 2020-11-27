
public class Usuarios {
    private String username;
    private String clave;
    private String correo;
    private boolean activacion;

    public Usuarios() {
    }

    public Usuarios(String username, String clave, String correo, boolean activacion) {
        this.username = username;
        this.clave = clave;
        this.correo = correo;
        this.activacion = activacion;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the activacion
     */
    public boolean isActivacion() {
        return activacion;
    }

    /**
     * @param activacion the activacion to set
     */
    public void setActivacion(boolean activacion) {
        this.activacion = activacion;
    }
    
    
}
