/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.util.ArrayList;

public class Proveedor {
    
    public String nombre;
    public ArrayList<Producto> productos ;
    public String ubicacion;
    public String nit;

    public Proveedor() {
    }

    public Proveedor(String nombre, ArrayList<Producto> productos, String ubicacion, String nit) {
        this.nombre = nombre;
        this.productos = productos;
        this.ubicacion = ubicacion;
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
