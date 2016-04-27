/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CamaraComercio {
    
    public String nit;
    public String fechaInscripcion;
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
        this.lugarInscripcion=ciudades.get(Integer.parseInt(nit.substring(0, 4))%(ciudades.size()));
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        this.fechaInscripcion=formato.format(new Date((Integer.parseInt(nit.substring(0, 6))%30)+80, Integer.parseInt(nit.substring(0, 4))%11+1, Integer.parseInt(nit.substring(0, 4))%29+1));
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getLugarInscripcion() {
        return lugarInscripcion;
    }

    public void setLugarInscripcion(String lugarInscripcion) {
        this.lugarInscripcion = lugarInscripcion;
    }
    
    
}
