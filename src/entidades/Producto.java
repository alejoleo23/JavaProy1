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
public class Producto {
    String marca;
    String modelo;
    String dimensiones;
    double precio;
    int cantidad;
    String codigoproducto;
    String añofabricacion;
    String lugardefabricacion;
    
    public Producto() {
        this("sony","psp","13x14x34",23.5,12,"1706fd12","09/12/2015","Peru");

}

   
    public Producto(String marca, String modelo, String dimensiones, double precio, int cantidad, String codigoproducto, String añofabricacion, String lugardefabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.dimensiones = dimensiones;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigoproducto = codigoproducto;
        this.añofabricacion = añofabricacion;
        this.lugardefabricacion = lugardefabricacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigoproducto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public void setAñofabricacion(String añofabricacion) {
        this.añofabricacion = añofabricacion;
    }

    public void setLugardefabricacion(String lugardefabricacion) {
        this.lugardefabricacion = lugardefabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public String getAñofabricacion() {
        return añofabricacion;
    }

    public String getLugardefabricacion() {
        return lugardefabricacion;
    }

    @Override
    public String toString() {
        return "Producto{" + "marca=" + getMarca() + ", modelo=" + getModelo() + ", dimensiones=" + getDimensiones() + ", precio=" + getPrecio() + ", cantidad=" + getCantidad() + ", codigoproducto=" + getCodigoproducto() + ", a\u00f1ofabricacion=" + getAñofabricacion() + ", lugardefabricacion=" + getLugardefabricacion() + '}';
    }
     
        
}