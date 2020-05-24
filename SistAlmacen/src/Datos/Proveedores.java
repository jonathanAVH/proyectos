/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author levd
 */
public class Proveedores {
   
    private int idProveedores;
    private String nombre;
    private String telefono;
    private String domicilio;

    public Proveedores(int idProveedores, String nombre, String telefono, String domicilio) {
        this.idProveedores = idProveedores;
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public Proveedores() {
    }

    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    
    
}
