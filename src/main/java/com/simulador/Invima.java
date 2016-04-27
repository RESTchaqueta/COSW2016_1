/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invima {
    
    public Integer expediente;	
    public String nit;
    public String estadoRegistro;
    public String vencimiento;	
    public String modalidad;	

    public Invima(String nit) {
        this.expediente = Integer.parseInt(nit.substring(0, 8));
        this.nit=nit;
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        Date fecha=new Date((Integer.parseInt(nit.substring(0, 6))%40)+100, Integer.parseInt(nit.substring(0, 4))%11+1, Integer.parseInt(nit.substring(0, 4))%29+1);
        this.vencimiento = formato.format(fecha);
        this.estadoRegistro = (fecha.getTime()<(new Date()).getTime())?"Vencidos":"Vigentes";
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

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

}
