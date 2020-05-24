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
public class Usuarios {
    int idusuario;
    String nombre;
    String usuario;
    String clave;
    String perfil;

    public Usuarios(int idusuario, String nombre, String usuario, String clave, String perfil) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.perfil = perfil;
    }

    public Usuarios() {
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
}
