/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.util.ArrayList;
import java.util.Random;

public class Producto {
    
    public String nombre;
    public int precio;
    public int cantidad;
    public int codigo;
    public int ganancia;
    public int peso;

    public Producto() {
        ArrayList<String> nombres=new ArrayList<>();
        nombres.add ("Billetera");
        nombres.add ("Maleta");
        nombres.add ("Morral");
        nombres.add ("Reloj");
        nombres.add ("Maletin");
        nombres.add ("Bolso");
        nombres.add ("Kit de Proteccion");
        nombres.add ("Buso");
        nombres.add ("Sudadera");
        nombres.add ("Hoodie");
        nombres.add ("Camisa");
        nombres.add ("Camiseta");
        nombres.add ("Falda");
        nombres.add ("Pantalon");
        nombres.add ("Bota");
        nombres.add ("Sandalia");
        nombres.add ("Zapatilla");
        this.nombre = nombres.get((new Random()).nextInt(nombres.size()))+" "+(new Random()).nextInt(1000);
        this.precio = (new Random()).nextInt(1000000)+1000000;
        this.cantidad = (new Random()).nextInt(100000);
        this.codigo = (new Random()).nextInt(10000000);
        this.ganancia = (new Random()).nextInt(40);
        this.peso = (new Random()).nextInt(1000);
    }

    public Producto(String nombre, int precio, int cantidad, int codigo, int ganancia, int peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.ganancia = ganancia;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
