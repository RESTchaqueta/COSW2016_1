/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

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
    public Invima consultarRegistroSanidadFecha(@PathVariable String nit){
        String abcdario = "qwertyuiopasdfghjklzxcvbnm";
        //if(nit.length()==11)
        return new Invima(nit);
    }
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ResponseEntity<?> consultaX() {       
        return new ResponseEntity<>("REST API working. Echo:",HttpStatus.ACCEPTED);
    }
}
