
package clases;

public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private double salario;

    public Persona() {
    }
    public Persona(String nombres, String apellidos, int edad, double salario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
    
}
