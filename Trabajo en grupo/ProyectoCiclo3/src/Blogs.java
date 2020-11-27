
import java.util.ArrayList;


public class Blogs {
    private String titulo;
    private String cuerpo;
    private String privacidad;
    private ArrayList<Comentario> comentario;
    private String imagen;
    private String autor;

    public Blogs() {
    }

    public Blogs(String titulo, String cuerpo, String privacidad, ArrayList comentario, String imagen, String autor) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.privacidad = privacidad;
        this.comentario = comentario;
        this.imagen = imagen;
        this.autor = autor;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the cuerpo
     */
    public String getCuerpo() {
        return cuerpo;
    }

    /**
     * @param cuerpo the cuerpo to set
     */
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    /**
     * @return the privacidad
     */
    public String getPrivacidad() {
        return privacidad;
    }

    /**
     * @param privacidad the privacidad to set
     */
    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    /**
     * @return the comentario
     */
    public ArrayList getComentarios() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentarios(ArrayList comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    


    
    
}
