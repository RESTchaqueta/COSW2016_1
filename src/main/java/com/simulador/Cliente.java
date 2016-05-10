/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.util.ArrayList;
import java.util.Random;

public class Cliente {
    
    public String nombre;
    public String tipo;
    public int gastoAcumulado;
    public int codigo;

    public Cliente() {
        ArrayList<String> nombres=new ArrayList<>();
        nombres.add ("Adela");
        nombres.add ("Adolfo");
        nombres.add ("Beatriz");
        nombres.add ("Boris");
        nombres.add ("Catalina");
        nombres.add ("Carlos");
        nombres.add ("Diana");
        nombres.add ("Daniel");
        nombres.add ("Estefania");
        nombres.add ("Enrique");
        nombres.add ("Fabiola");
        nombres.add ("Fernando");
        nombres.add ("Gisell");
        nombres.add ("German");
        nombres.add ("Helena");
        nombres.add ("Hugo");
        nombres.add ("Isabel");
        ArrayList<String> tiposCli=new ArrayList<>();
        tiposCli.add ("Normal");
        tiposCli.add ("Frecuente");
        this.nombre = nombres.get((new Random()).nextInt(nombres.size()));
        this.tipo = tiposCli.get((new Random()).nextInt(tiposCli.size()));
        if(this.tipo.equals("Frecuente"))
            this.gastoAcumulado = (new Random()).nextInt(100000000)+1000000;
        else this.gastoAcumulado = (new Random()).nextInt(1000000);
        this.codigo = (new Random()).nextInt(10000000);
    }

    public Cliente(String nombre, String tipo, int gastoAcumulado, int codigo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.gastoAcumulado = gastoAcumulado;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getGastoAcumulado() {
        return gastoAcumulado;
    }

    public void setGastoAcumulado(int gastoAcumulado) {
        this.gastoAcumulado = gastoAcumulado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     
}
