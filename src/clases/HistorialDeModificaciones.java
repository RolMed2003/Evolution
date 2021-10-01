package clases;

import java.sql.Date;

public class HistorialDeModificaciones {

    private int IDModificacion;
    private java.sql.Date FechaModificacion;
    private String UsernameQueRealizo;
    private String NombreQueRealizo;
    private String ModificacionRealizada;

    public HistorialDeModificaciones(int IDModificacion, Date FechaModificacion, String UsernameQueRealizo, String NombreQueRealizo, String ModificacionRealizada) {
        this.IDModificacion = IDModificacion;
        this.FechaModificacion = FechaModificacion;
        this.UsernameQueRealizo = UsernameQueRealizo;
        this.NombreQueRealizo = NombreQueRealizo;
        this.ModificacionRealizada = ModificacionRealizada;
    }
    
    public int getIDModificacion() {
        return IDModificacion;
    }

    public void setIDModificacion(int IDModificacion) {
        this.IDModificacion = IDModificacion;
    }

    public Date getFechaModificacion() {
        return FechaModificacion;
    }

    public void setFechaModificacion(Date FechaModificacion) {
        this.FechaModificacion = FechaModificacion;
    }

    public String getUsernameQueRealizo() {
        return UsernameQueRealizo;
    }

    public void setUsernameQueRealizo(String UsernameQueRealizo) {
        this.UsernameQueRealizo = UsernameQueRealizo;
    }

    public String getNombreQueRealizo() {
        return NombreQueRealizo;
    }

    public void setNombreQueRealizo(String NombreQueRealizo) {
        this.NombreQueRealizo = NombreQueRealizo;
    }

    public String getModificacionRealizada() {
        return ModificacionRealizada;
    }

    public void setModificacionRealizada(String ModificacionRealizada) {
        this.ModificacionRealizada = ModificacionRealizada;
    }
      
}
