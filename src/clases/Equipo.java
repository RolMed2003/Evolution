package clases;

import java.sql.Date;

public class Equipo {

    private int IDEquipo;
    private String NumeroDeSerie;
    private String IDEmpleadoAsignado;
    private String TipoDeEquipo;
    private String Marca;
    private String Observaciones;
    private String Estado;
    private java.sql.Date FechaUltimaModificacion;
    private String UltimaModificacionBy;
    private String Modelo;
    private java.sql.Date FechaRegistro;
    private String RegistradoBy;

    public Equipo(int IDEquipo, String NumeroDeSerie, String IDEmpleadoAsignado, String TipoDeEquipo, String Marca, String Modelo, Date FechaRegistro, String RegistradoBy, String Observaciones, String Estado, Date FechaUltimaModificacion, String UltimaModificacionBy) {
        this.IDEquipo = IDEquipo;
        this.NumeroDeSerie = NumeroDeSerie;
        this.IDEmpleadoAsignado = IDEmpleadoAsignado;
        this.TipoDeEquipo = TipoDeEquipo;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.FechaRegistro = FechaRegistro;
        this.RegistradoBy = RegistradoBy;
        this.Observaciones = Observaciones;
        this.Estado = Estado;
        this.FechaUltimaModificacion = FechaUltimaModificacion;
        this.UltimaModificacionBy = UltimaModificacionBy;
    }

    public int getIDEquipo() {
        return IDEquipo;
    }

    public void setIDEquipo(int IDEquipo) {
        this.IDEquipo = IDEquipo;
    }

    public String getNumeroDeSerie() {
        return NumeroDeSerie;
    }

    public void setNumeroDeSerie(String NumeroDeSerie) {
        this.NumeroDeSerie = NumeroDeSerie;
    }

    public String getIDEmpleadoAsignado() {
        return IDEmpleadoAsignado;
    }

    public void setIDEmpleadoAsignado(String IDEmpleadoAsignado) {
        this.IDEmpleadoAsignado = IDEmpleadoAsignado;
    }

    public String getTipoDeEquipo() {
        return TipoDeEquipo;
    }

    public void setTipoDeEquipo(String TipoDeEquipo) {
        this.TipoDeEquipo = TipoDeEquipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public String getRegistradoBy() {
        return RegistradoBy;
    }

    public void setRegistradoBy(String RegistradoBy) {
        this.RegistradoBy = RegistradoBy;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Date getFechaUltimaModificacion() {
        return FechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date FechaUltimaModificacion) {
        this.FechaUltimaModificacion = FechaUltimaModificacion;
    }

    public String getUltimaModificacionBy() {
        return UltimaModificacionBy;
    }

    public void setUltimaModificacionBy(String UltimaModificacionBy) {
        this.UltimaModificacionBy = UltimaModificacionBy;
    }
    
}
