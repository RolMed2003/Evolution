package clases;

import java.sql.Date;

public class Empleado extends Persona{
    
    private int IDEmpleado;
    private String NumeroINSS;
    private String Cargo;
    private float SalarioMensual;
    private int HorasExtras;
    private float IngresosHorasExtras;
    private String RegistradoBy;
    private java.sql.Date FechaDeAlta;
    private String Estado;
    private float Antiguedad;
    private float TotalIngresos;
    private float INNSLaboral;
    private float IR;
    private float TotalDeducciones;
    private float SalarioNeto;

    public float getSalarioNeto() {
        return SalarioNeto;
    }

    public void setSalarioNeto(float SalarioNeto) {
        this.SalarioNeto = SalarioNeto;
    }

    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public String getNumeroINSS() {
        return NumeroINSS;
    }

    public void setNumeroINSS(String NumeroINSS) {
        this.NumeroINSS = NumeroINSS;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public float getSalarioMensual() {
        return SalarioMensual;
    }

    public void setSalarioMensual(float SalarioMensual) {
        this.SalarioMensual = SalarioMensual;
    }

    public int getHorasExtras() {
        return HorasExtras;
    }

    public void setHorasExtras(int HorasExtras) {
        this.HorasExtras = HorasExtras;
    }

    public float getIngresosHorasExtras() {
        return IngresosHorasExtras;
    }

    public void setIngresosHorasExtras(float IngresosHorasExtras) {
        this.IngresosHorasExtras = IngresosHorasExtras;
    }

    public String getRegistradoBy() {
        return RegistradoBy;
    }

    public void setRegistradoBy(String RegistradoBy) {
        this.RegistradoBy = RegistradoBy;
    }

    public Date getFechaDeAlta() {
        return FechaDeAlta;
    }

    public void setFechaDeAlta(Date FechaDeAlta) {
        this.FechaDeAlta = FechaDeAlta;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public float getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(float Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public float getTotalIngresos() {
        return TotalIngresos;
    }

    public void setTotalIngresos(float TotalIngresos) {
        this.TotalIngresos = TotalIngresos;
    }

    public float getINNSLaboral() {
        return INNSLaboral;
    }

    public void setINNSLaboral(float INNSLaboral) {
        this.INNSLaboral = INNSLaboral;
    }

    public float getIR() {
        return IR;
    }

    public void setIR(float IR) {
        this.IR = IR;
    }

    public float getTotalDeducciones() {
        return TotalDeducciones;
    }

    public void setTotalDeducciones(float TotalDeducciones) {
        this.TotalDeducciones = TotalDeducciones;
    }

    public float getNetoARecibir() {
        return NetoARecibir;
    }

    public void setNetoARecibir(float NetoARecibir) {
        this.NetoARecibir = NetoARecibir;
    }
    private float NetoARecibir;


    public Empleado(){
        
        
        
    }
    
}
