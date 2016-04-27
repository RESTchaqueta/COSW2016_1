/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.util.ArrayList;
import java.util.Random;

public class Proveedor {
    
    public String nombre;
    public ArrayList<Producto> productos ;
    public String ubicacion;
    public String nit;

    public Proveedor(String nit) {
        ArrayList<String> nombres=new ArrayList<>();
        nombres.add ("Asociados");
        nombres.add ("Sociedad por Acciones Simplificada");
        nombres.add ("Sociedad Limitada");
        nombres.add ("Empresa Unipersonal");
        nombres.add ("Sociedad Anonima");
        nombres.add ("Sociedad Colectiva");
        nombres.add ("Sociedad Comandita Simple");
        nombres.add ("Sociedad Comandita por Acciones");
        nombres.add ("Empresa Asociativa de Trabajo");
        this.nombre = nombres.get((new Random()).nextInt(nombres.size()))+" "+(new Random()).nextInt(100);
        this.productos = new ArrayList<>();
        for(int i=0; i<50; i++)this.productos.add(new Producto());
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
        this.ubicacion = ciudades.get((new Random()).nextInt(ciudades.size()));
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
     
    
}
