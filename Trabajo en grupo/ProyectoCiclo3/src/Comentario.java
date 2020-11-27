
public class Comentario {
    private String autor;
    private String post;

    public Comentario() {
    }

    public Comentario(String autor, String post) {
        this.autor = autor;
        this.post = post;
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

    /**
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
    }
    
    
}
