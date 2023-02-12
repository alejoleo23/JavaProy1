/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author LENOVO
 */
public class Cliente {
    String Nombres;
    String Apellidos;
    String DNI;
    String email;
    String Departamento;
    String Ciudad;
    String Distrito;
    String direccion;
       
    public Cliente() {
        this("tania","vera paredes","12345678","tania@gmail.com","La Libertad","Trujillo","Florencia","los naranjos 777");
    }

    public Cliente(String Nombres, String Apellidos, String DNI, String email, String Departamento, String Ciudad, String Distrito, String direccion) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.email = email;
        this.Departamento = Departamento;
        this.Ciudad = Ciudad;
        this.Distrito = Distrito;
        this.direccion = direccion;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getDistrito() {
        return Distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombres=" + getNombres() + ", Apellidos=" + getApellidos() + ", DNI=" + getDNI() + ", email=" + getEmail() + ", Departamento=" + getDepartamento() + ", Ciudad=" + getCiudad() + ", Distrito=" + getDistrito() + ", direccion=" + getDireccion() + '}';
    }
    
    
    
    
}
