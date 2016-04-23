/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.util.ArrayList;
import java.util.Date;

public class CamaraComercio {
    
    public String nit;
    public Date fechaInscripcion;
    public String lugarInscripcion;
    
    public CamaraComercio(String nit) {
        this.nit = nit;
        ArrayList<String> ciudades=new ArrayList<>();
        ciudades.add ("Medellin");
        ciudades.add ("Cali");
        ciudades.add ("Barranquilla");
        ciudades.add ("Cartagena");
        ciudades.add ("Bogota");
        ciudades.add ("Cucuta");
        ciudades.add ("Bucaramanga");
        ciudades.add ("Pereira");
        ciudades.add ("Manizales");
        this.lugarInscripcion=ciudades.get(Integer.parseInt(nit.substring(0, 4))%9);
        this.fechaInscripcion=new Date(Integer.parseInt(nit.substring(0, 4))%65+1950, Integer.parseInt(nit.substring(0, 4))%11+1, Integer.parseInt(nit.substring(0, 4))%29+1);
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getLugarInscripcion() {
        return lugarInscripcion;
    }

    public void setLugarInscripcion(String lugarInscripcion) {
        this.lugarInscripcion = lugarInscripcion;
    }
    
    
}
