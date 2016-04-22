/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author redes
 */
public class Invima {
    
    public Integer expediente;	
    public String nit;
    public String estadoRegistro;
    public Date vencimiento;	
    public String modalidad;	
    public ArrayList<String> er=new ArrayList<>();

    public Invima(String nit) {
        Random ran =  new Random();
        this.expediente = ran.nextInt(99998999)+1000;
        this.nit=nit;
        for(int i=0; i<5; i++){
            er.add("Vigentes");
            er.add("Vencidos");
        }
        this.estadoRegistro = er.get(ran.nextInt(er.size()));
        this.vencimiento = (this.estadoRegistro.equals("Vigentes"))?new Date(ran.nextInt(2050)+2000, ran.nextInt(11)+1, ran.nextInt(29)+1):new Date(ran.nextInt(2050)+2000, ran.nextInt(11)+1, ran.nextInt(29)+1);
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
