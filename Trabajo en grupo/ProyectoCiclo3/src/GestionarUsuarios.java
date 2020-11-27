
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GestionarUsuarios extends Usuarios{
    
    public boolean validarUsuario(){
        return false;
    }
    
    public String recuperarClave(){
        return "hola";
    }
    
    public void crear(){
        /*try {
            Conexion conexion = new Conexion("colegio.db");
            conexion.conectar();
            Statement stmt = conexion.getConexion().createStatement();
            String sql = "INSERT INTO estudiantes (nombre,celular,edad) "
                    + "VALUES ('" + this.nombre + "','" + this.celular + "'," + this.edad + ")";
            stmt.executeUpdate(sql);
            stmt.close();
            conexion.cerrarConexion();
            //System.out.println("Datos insertados correctamente!");
        } catch (SQLException e) {
            System.out.println("Error en la inserción de datos: " + e);
        }*/
    }

    public static ArrayList<Usuarios> leer() {
        ArrayList<Usuarios> usuarios = new ArrayList();
        /*int edad;
        long id;
        String nombre, celular;
        try {
            Conexion conexion = new Conexion("colegio.db");
            conexion.conectar();
            Statement stmt = conexion.getConexion().createStatement();
            String sql = "SELECT * FROM estudiantes";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {        
                id = rs.getLong("id");
                nombre = rs.getString("nombre");
                celular = rs.getString("celular");
                edad = rs.getInt("edad");
                estudiantes.add(new Estudiante(id, nombre, celular, edad));
            }
            rs.close();
            conexion.cerrarConexion();        
        } catch (SQLException e) {
            System.out.println("Error al leer los datos: " + e);
        }*/

        return usuarios;
    }
    
    
    public static void actualizar(long id, String nombre, String celular, int edad){
        /*try{
            Conexion conexion = new Conexion("colegio.db");
            conexion.conectar();          
            Statement stmt = conexion.getConexion().createStatement();
            String sql = "UPDATE estudiantes SET nombre = '"+nombre+"',"
                        + "celular='"+celular+"',"
                        + "edad=" +edad + " WHERE id = " + id;            
            stmt.executeUpdate(sql);
            stmt.close();
            conexion.cerrarConexion();
            //System.out.println("Datos actualizados correctamente!");
        }catch(SQLException e){
            System.out.println("Error en la actualización de datos: " + e);
        }*/
    }
    
    public static void borrar(long id){
        /*try{
            Conexion conexion = new Conexion("colegio.db");
            conexion.conectar();          
            Statement stmt = conexion.getConexion().createStatement();
            //String sql = "DELETE estudiantes WHERE nombre = '" + nombre + "'";
            String sql = "DELETE FROM estudiantes WHERE id = " + id;           
            stmt.executeUpdate(sql);
            stmt.close();
            conexion.cerrarConexion();
            //System.out.println("Datos eliminados correctamente!");
        }catch(SQLException e){
            System.out.println("Error en la eliminación de datos: " + e);
        }*/
    }
}
