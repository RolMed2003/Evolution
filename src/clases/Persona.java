package clases;

public class Persona {

    private String Nombre;
    private String DNI;
    private int Edad;
    private String Sexo;
    private String Telefono;
    private String Email;
    private String Domicilio;
    private java.sql.Date FechaDeNacimiento;

    
    public Persona(){
        
        
        
    }
    
    
    public Persona(String Nombre, String DNI, int Edad, String Sexo, String Telefono, String Email, String Domicilio, java.sql.Date FechaDeNacimiento) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Domicilio = Domicilio;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public java.sql.Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(java.sql.Date FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
    
}
