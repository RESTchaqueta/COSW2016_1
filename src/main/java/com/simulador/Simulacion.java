/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.util.Date;
import java.util.Random;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simulador")
public class Simulacion {
    @RequestMapping(value="/invima/{nit}", method = RequestMethod.GET)
    public Date consultarRegistroSanidadFecha(@PathVariable String nit){
        Random ran =  new Random();
        Date fecha = new Date(ran.nextInt(2050)+2000, ran.nextInt(11)+1, ran.nextInt(29)+1);       
        return fecha;
    }
    @RequestMapping(value="/{nit}", method = RequestMethod.GET)
    public String test1(@PathVariable String nit){
        return "Hola Mundo test 1";
    }
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String test2(){
        return "Hola Mundo test 2";
    }
}
