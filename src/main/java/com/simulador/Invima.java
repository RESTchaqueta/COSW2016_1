/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.util.ArrayList;
import java.util.Date;

public class Invima {
    
    public Integer expediente;	
    public String nit;
    public String estadoRegistro;
    public Date vencimiento;	
    public String modalidad;	
    public ArrayList<String> er=new ArrayList<>();

    public Invima(String nit) {
        this.expediente = Integer.parseInt(nit.substring(0, 8));
        this.nit=nit;
        this.vencimiento = new Date(Integer.parseInt(nit.substring(0, 4))%65+1950, Integer.parseInt(nit.substring(0, 4))%11+1, Integer.parseInt(nit.substring(0, 4))%29+1);
        this.estadoRegistro = ((Integer.parseInt(nit.substring(0, 4))%65+1950)<2015)?"Vencidos":"Vigentes";
        
        this.modalidad = "Reposteria";
    }

    public Integer getExpediente() {
        return expediente;
    }

    public void setExpediente(Integer expediente) {
        this.expediente = expediente;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

}
