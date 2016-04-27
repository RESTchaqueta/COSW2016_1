/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class PasarelaPagos {
    
    public String tarjetaCredito;
    public String codTransaccion;
    public Integer monto;
    public Integer interes;
    public String fechaTransaccion;
    public Integer costoTotal;
    public String cuentaBancaria;

    public PasarelaPagos(String tarjetaCredito, Integer monto, String cuentaBancaria) {
        Random ran=new Random();
        this.tarjetaCredito = tarjetaCredito;
        this.codTransaccion = ((ran.nextInt(999999999)%1000000)+100000000)+"";
        this.monto = monto;
        this.cuentaBancaria = cuentaBancaria;
        this.interes = ran.nextInt(10);
        SimpleDateFormat formato=new SimpleDateFormat("EEEEEEE, dd MMM yyyy HH:mm:ss");
        this.fechaTransaccion = formato.format(new Date());
        this.costoTotal = monto+(monto*this.interes/100);
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getCodTransaccion() {
        return codTransaccion;
    }

    public void setCodTransaccion(String codTransaccion) {
        this.codTransaccion = codTransaccion;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }

    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public Integer getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Integer costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

      
}
