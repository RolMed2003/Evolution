package clases;

import java.sql.Date;

public class Nomina {
    
    private float INSSPatronal;
    private float INATEC;
    private float Vacaciones;
    private float TreceavoMes;
    private java.sql.Date Fecha;

    public float getINSSPatronal() {
        return INSSPatronal;
    }

    public void setINSSPatronal(float INSSPatronal) {
        this.INSSPatronal = INSSPatronal;
    }

    public float getINATEC() {
        return INATEC;
    }

    public void setINATEC(float INATEC) {
        this.INATEC = INATEC;
    }

    public float getVacaciones() {
        return Vacaciones;
    }

    public void setVacaciones(float Vacaciones) {
        this.Vacaciones = Vacaciones;
    }

    public float getTreceavoMes() {
        return TreceavoMes;
    }

    public void setTreceavoMes(float TreceavoMes) {
        this.TreceavoMes = TreceavoMes;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Nomina(float INSSPatronal, float INATEC, float Vacaciones, float TreceavoMes, Date Fecha) {
        this.INSSPatronal = INSSPatronal;
        this.INATEC = INATEC;
        this.Vacaciones = Vacaciones;
        this.TreceavoMes = TreceavoMes;
        this.Fecha = Fecha;
    }
    
}
