/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simulador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 *
 * @author usuario
 */
public class FormatoObjeto extends ObjectMapper{

    public FormatoObjeto() {
        registerModule(new Hibernate4Module());
    }
    
}
