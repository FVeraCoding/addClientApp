
package logica;

import java.util.Date;


public class Cliente {
    private String nombre;
    private String apellidos;
    private Date fecha;
    private String provincia;

    public Cliente(String nombre, String apellidos, Date fecha, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String[] toArrayString(){
        String[] datos = new String[4];
        datos[0] = this.nombre;
        datos[1] = this.apellidos;
        datos[2] = this.fecha.toString();
        datos[3] = this.provincia;
        
        return datos;
    }
}
