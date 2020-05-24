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
public class Lineas {
    private int id;
    private String linea;

    public Lineas(int id1, String linea) {
        this.id = id1;
        this.linea = linea;
    }

    public Lineas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    
}
