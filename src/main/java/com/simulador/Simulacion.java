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
    public ResponseEntity<?> consultarRegistroSanidadFecha(@PathVariable String nit){
        if(nit.length()==11){
            String abcdario = "1234567890";
            int i=0;
            while(i<nit.length()-2 && abcdario.contains(nit.charAt(i)+""))i++;
            if(i==nit.length()-2 && nit.charAt(9)=='-' && abcdario.contains(nit.charAt(10)+""))
                return new ResponseEntity<>(new Invima(nit),HttpStatus.ACCEPTED);
            else return new ResponseEntity<>("",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("",HttpStatus.NOT_FOUND);
        
    }
    
    @RequestMapping(value="/camaracomercio/{nit}", method = RequestMethod.GET)
    public ResponseEntity<?> consultarNIT(@PathVariable String nit) {       
        if(nit.length()==11){
            String abcdario = "1234567890";
            int i=0;
            while(i<nit.length()-2 && abcdario.contains(nit.charAt(i)+""))i++;
            if(i==nit.length()-2 && nit.charAt(9)=='-' && abcdario.contains(nit.charAt(10)+""))
                if(((Integer.parseInt(nit.charAt(1)+"")/2*2==Integer.parseInt(nit.charAt(1)+""))) 
                        &&((Integer.parseInt(nit.charAt(2)+"")/2*2==Integer.parseInt(nit.charAt(2)+""))) 
                        && ((Integer.parseInt(nit.charAt(3)+"")/2*2==Integer.parseInt(nit.charAt(3)+""))) 
                        && ((Integer.parseInt(nit.charAt(8)+"")/2*2==Integer.parseInt(nit.charAt(8)+""))) 
                        && ((Integer.parseInt(nit.charAt(10)+"")/2*2==Integer.parseInt(nit.charAt(10)+""))))
                    return new ResponseEntity<>(new CamaraComercio(nit),HttpStatus.ACCEPTED);
                else return new ResponseEntity<>("",HttpStatus.NOT_FOUND);    
        }
        return new ResponseEntity<>("Peticion incorrecta",HttpStatus.NOT_FOUND);
    }
    
    @RequestMapping(value="/pasarelapagos/{tarj}/{cuenta}/{monto}", method = RequestMethod.GET)
    public ResponseEntity<?> realizarPago(@PathVariable String tarj, @PathVariable String cuenta, @PathVariable Integer monto) {       
        if(tarj.length()>12 && tarj.length()<20 && cuenta.length()>12 && cuenta.length()<21){
            String abcdario = "1234567890";
            int i=0;
            while(i<tarj.length() && abcdario.contains(tarj.charAt(i)+""))i++;
            int j=0;
            while(j<cuenta.length() && abcdario.contains(cuenta.charAt(j)+""))j++;
            if(i==tarj.length() && j==cuenta.length()) 
                return new ResponseEntity<>(new PasarelaPagos(tarj, monto, cuenta),HttpStatus.ACCEPTED);
            return new ResponseEntity<>("",HttpStatus.NOT_FOUND);
        }else return new ResponseEntity<>("",HttpStatus.NOT_FOUND);
    }    
    
    @RequestMapping(value="/tipocliente/{ced}", method = RequestMethod.GET)
    public ResponseEntity<?> consultaCliente(@PathVariable String ced) {  
        String respuesta="";
        if(ced.length()==10){
            String abcdario = "1234567890";
            int i=0;
            while(i<ced.length() && abcdario.contains(ced.charAt(i)+""))i++;
            if(i==ced.length()){
                if((Integer.parseInt(ced.substring(0,3))/2)*2==Integer.parseInt(ced.substring(0,3)))
                    respuesta="Frecuente";
                else respuesta="Normal";
            }
        }
        return new ResponseEntity<>("",HttpStatus.NOT_FOUND);
    }    
    
    @RequestMapping(value="/proveedoresysupermecados/{nit}", method = RequestMethod.GET)
    public ResponseEntity<?> consultaProveedores(@PathVariable String nit) {
        if(nit.length()==11){
            String abcdario = "1234567890";
            int i=0;
            while(i<nit.length()-2 && abcdario.contains(nit.charAt(i)+""))i++;
            if(i==nit.length()-2 && nit.charAt(9)=='-' && abcdario.contains(nit.charAt(10)+""))
                return new ResponseEntity<>(new Proveedor(nit),HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>("",HttpStatus.NOT_FOUND);
    }
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ResponseEntity<?> consultaX() {       
        return new ResponseEntity<>("REST API working. Echo:",HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value="", method = RequestMethod.GET)
    public ResponseEntity<?> consultaY() {       
        
        return new ResponseEntity<>("REST API working. Echo:",HttpStatus.ACCEPTED);
    }
    
}
