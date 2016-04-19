/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peticiones")
public class Simulacion {

    @RequestMapping(value="/invima/{nit}", method = RequestMethod.GET)
    public String consultarRegistroSanidadFecha(@PathVariable String nit){
        Random ran =  new Random();
        Date fecha = new Date(ran.nextInt(2050)+2000, ran.nextInt(11)+1, ran.nextInt(29)+1);       
        SimpleDateFormat sd= new SimpleDateFormat("dd-MM-yyyy");
        return sd.format(fecha);
    }
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ResponseEntity<?> consultaX() {       
        return new ResponseEntity<>("REST API working. Echo:",HttpStatus.ACCEPTED);
    }
}
