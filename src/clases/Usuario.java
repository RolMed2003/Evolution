package clases;

import java.sql.Date;

public class Usuario extends Persona {
    
    private String Username;
    private String Password;
    private String NivelAcceso;
    private String PreguntaSecreta;
    private String RespuestaSecreta;
    private String RegistradoBy;
    private java.sql.Date FechaRegistro;
    private String Estado;
    private int IDUser;
    private int NumeroDeSesion;
    private String UltimaModificacionBy;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNivelAcceso() {
        return NivelAcceso;
    }

    public void setNivelAcceso(String NivelAcceso) {
        this.NivelAcceso = NivelAcceso;
    }

    public String getPreguntaSecreta() {
        return PreguntaSecreta;
    }

    public void setPreguntaSecreta(String PreguntaSecreta) {
        this.PreguntaSecreta = PreguntaSecreta;
    }

    public String getRespuestaSecreta() {
        return RespuestaSecreta;
    }

    public void setRespuestaSecreta(String RespuestaSecreta) {
        this.RespuestaSecreta = RespuestaSecreta;
    }

    public String getRegistradoBy() {
        return RegistradoBy;
    }

    public void setRegistradoBy(String RegistradoBy) {
        this.RegistradoBy = RegistradoBy;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public int getNumeroDeSesion() {
        return NumeroDeSesion;
    }

    public void setNumeroDeSesion(int NumeroDeSesion) {
        this.NumeroDeSesion = NumeroDeSesion;
    }

    public String getUltimaModificacionBy() {
        return UltimaModificacionBy;
    }

    public void setUltimaModificacionBy(String UltimaModificacionBy) {
        this.UltimaModificacionBy = UltimaModificacionBy;
    }

    public Usuario() {
        
        
        
    }
   
}
