/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Date;

/**
 *
 * @author levd
 */
public class Factura {
    int IdFacturas;
    int Lineasid;
    int ProveedoresId;
    Date FechaEntrada;

    public Factura(int IdFacturas, int Lineasid, int ProveedoresId, Date FechaEntrada) {
        this.IdFacturas = IdFacturas;
        this.Lineasid = Lineasid;
        this.ProveedoresId = ProveedoresId;
        this.FechaEntrada = FechaEntrada;
    }

    public Factura() {
    }

    public int getIdFacturas() {
        return IdFacturas;
    }

    public void setIdFacturas(int IdFacturas) {
        this.IdFacturas = IdFacturas;
    }

    public int getLineasid() {
        return Lineasid;
    }

    public void setLineasid(int Lineasid) {
        this.Lineasid = Lineasid;
    }

    public int getProveedoresId() {
        return ProveedoresId;
    }

    public void setProveedoresId(int ProveedoresId) {
        this.ProveedoresId = ProveedoresId;
    }

    public Date getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(Date FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }
    
}
