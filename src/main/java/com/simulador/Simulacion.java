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
        String abcdario = "1234567890";
        int i=0;
        for(; i<nit.length() && abcdario.contains(nit.charAt(i)+""); i++);
        Invima invi = null;
        if(nit.length()==11 && i==nit.length()-2 && nit.charAt(9)=='-')invi=new Invima(nit);
        return invi;
    }
    
    @RequestMapping(value="/camaracomercio/{nit}", method = RequestMethod.GET)
    public CamaraComercio consultarNIT(@PathVariable String nit) {       
        
        String abcdario = "1234567890";
        int i=0;
        for(; i<nit.length()-2 && abcdario.contains(nit.charAt(i)+""); i++);
        CamaraComercio cc = null;
        if(nit.length()==11 && i==nit.length()-2 && nit.charAt(9)=='-')cc=new CamaraComercio(nit);
        return cc;
    }
    
    @RequestMapping(value="/pasarelapagos/{tarj}/{monto}", method = RequestMethod.GET)
    public PasarelaPagos realizarPago(@PathVariable String tarj, @PathVariable Integer monto) {       
        String abcdario = "1234567890";
        int i=0;
        for(; i<tarj.length() && abcdario.contains(tarj.charAt(i)+""); i++);
        if(tarj.length()>12 && tarj.length()<20 && i==tarj.length())
            return new PasarelaPagos("", 2);
        else return null;
    }    
    
    @RequestMapping(value="/tipocliente/{ced}", method = RequestMethod.GET)
    public String consultaCliente(@PathVariable Integer ced) {       
        if((ced/2)*2==ced)
            return "Frecuente";
        else return "Normal";
    }    
    
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ResponseEntity<?> consultaX() {       
        PasarelaPagos as=new PasarelaPagos("", 2);
        return new ResponseEntity<>("REST API working. Echo:",HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value="", method = RequestMethod.GET)
    public ResponseEntity<?> consultaY() {       
        PasarelaPagos as=new PasarelaPagos("", 2);
        return new ResponseEntity<>("REST API working. Echo:",HttpStatus.ACCEPTED);
    }
    
}
